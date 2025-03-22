package com.UC;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.*;

public class ThreadPool {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future<String>> futuresList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Callable<String> callable = new MyCallable("Task" + i);
            FutureTask<String> futureTask = new FutureTask<>(callable);
            executorService.submit(futureTask); // 提交 FutureTask 给 ExecutorService
            futuresList.add(futureTask); // 添加到列表中
        }


        for (Future<String> future : futuresList) {
            System.out.println(future.get());
        }
        executorService.shutdown();

        Callable<String> callable = new MyCallable("Task");
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();

        System.out.println("-----------ThreadPoolExcutor---------------");
        int corePoolSize = Runtime.getRuntime().availableProcessors();
        int maximumPoolSize = corePoolSize * 5;
        long keepAliveTime = 30;
        TimeUnit unit = TimeUnit.SECONDS;
        BlockingQueue<Runnable> blockingQueue = new LinkedBlockingQueue<>(maximumPoolSize);

        ThreadPoolExecutor excutor = new ThreadPoolExecutor(
            corePoolSize, maximumPoolSize, keepAliveTime, unit, blockingQueue
        );


    }



}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("running...");
    }
}

class MyCallable implements Callable<String> {
    private final String result;

    public MyCallable(String result) {
        this.result = result;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "is calling...");
        return result;
    }
}
