package org.example.creational.singletonClass;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService executor= Executors.newFixedThreadPool(2);


        executor.execute(() -> TVSet.getTVSetInstance()); // task 1
        executor.execute(() -> TVSet.getTVSetInstance()); // task 2
        executor.execute(() -> TVSet.getTVSetInstance()); // task 3
        executor.execute(() -> TVSet.getTVSetInstance()); // task 4
    }
}
