package co.g2academy.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 100; i++) {
            Runnable worker = new WorkerThread("Message " + i);
            executor.execute(worker);
        }
        executor.shutdown();
        //loop for ever
        while (!executor.isTerminated()) {
        }
        System.out.println("Finish all threads");
    }
}
