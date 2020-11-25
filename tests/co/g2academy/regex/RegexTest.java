package co.g2academy.regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class RegexTest {

    @Test
    public void testingSingleCharacterRegexUsingIterationCode() {

        Pattern pattern = Pattern.compile("..s"); //single character test
        Matcher matcher = pattern.matcher("ais");
        boolean actual = matcher.matches();
        assertTrue(actual);
    }

    @Test
    public void testingCharacterRegexUsingChainingCode() {
        assertTrue(Pattern.compile(".s").matcher("as").matches());
    }

    @Test
    public void testingSingleCharacterRegexUsingPatternMatchesMethod() {
        assertTrue(Pattern.matches(".s", "asi"));
    }

    @Test
    public void testMatchOneCharacterInBracket() {
        // [] is exactly one character inside the bracket
        assertTrue(Pattern.matches("[abc]","a"));
    }

    @Test
    public void testMatchZeroOrOneCharasterInBracket() {
        // ? is one or none
        assertTrue(Pattern.matches("[amn]?","a"));
    }

    @Test
    public void testMatchZeroOrManyCharasterInBracket() {
        //* is zaro or many
        assertTrue(Pattern.matches("[amn]*","aaaaaaaaaaaaabbbbbbbbbbbbbbbcccccccccccc"));
    }

    @Test
    public void testMatchOneOrManyCharasterInBracket() {
        // + is one or many
        assertTrue(Pattern.matches("[amn]+","aaabbbbcccc"));
    }
}
