package co.g2academy.jdbc;

import java.sql.*;

public class MysqlConnection {


    public static void main(String[] args) {
        try {
            // First step : load My SQL JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Second step : Create database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabootcamp",
                    "root", "Debaymbil117");

            // Third : Create Statement
            Statement statement = connection.createStatement();

            // Fourth : execute query to get data from db
            ResultSet rs = statement.executeQuery("select * from student");

            // Fifth " iterate through all rows in student table
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                String phoneNumber = rs.getString("phone_no");
                System.out.println(id + " " + name + " " + age + " " + phoneNumber + " ");
            }

            // Sixth : update data
            statement.executeUpdate("update student set age = 17, name='Syifa Humaira' where id=1");

            // Seventh : insert data
            statement.executeUpdate("insert into student values(2, 'Vina', 17, '0892785641')");

            // Eight : delete data
            statement.executeUpdate("delete from student where id = 2");

            //==== prepared statement ====
            String insertQuery = "insert into student(id, name, age, phone_no) values (?,?,?,?)";
            PreparedStatement psInsert = connection.prepareStatement(insertQuery);
            String updateQuery = "update student set name = ?, age = ?, phone_no = ? where id = ?";
            PreparedStatement psUpdate = connection.prepareStatement(updateQuery);

            //insert
            psInsert.setInt(1,2);
            psInsert.setString(2,"Debay");
            psInsert.setInt(3, 17);
            psInsert.setString(4, "08937926");
            psInsert.executeUpdate();

            //Update
            psUpdate.setString(1,"Cipa");
            psUpdate.setInt(2, 21);
            psUpdate.setString(3,"088987625");
            psUpdate.setInt(4,1);
            psUpdate.executeUpdate();

            //==== batch execution and transaction
            connection.setAutoCommit(false);
            for (int i = 15; i < 100; i++) {
                //insert
                psInsert.setInt(1,i);
                psInsert.setString(2, "Student "+ i);
                psInsert.setInt(3, 19);
                psInsert.setString(4, "092882786" + i);
                psInsert.addBatch();
            }

            psInsert.executeBatch();
            connection.commit();
            connection.setAutoCommit(true);

            // Nine :  close all resource once it is being used
            // bad example, need to be in finally statement
            rs.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
