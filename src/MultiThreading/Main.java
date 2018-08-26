package MultiThreading;

import java.util.ArrayList;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        myRunnable runnable = new myRunnable();
        myCallable callable = new myCallable();
        ExecutorService worker = Executors.newFixedThreadPool(10);

        // Using Runnable Interface
        Thread thread = new Thread(runnable);
        thread.start();

        // Using Thread Class
        myThread me = new myThread();
        me.run();

        // Using ExecutorService and Runnable Interface

        for(int i =0 ; i<10 ; i++)
        {
            worker.execute(runnable);
        }

        // Using ExecutorService and Callable Interface
        ArrayList<Future<Integer>> results = new ArrayList<>();
        for(int i=0; i<10 ; i++)
        {
            results.add(worker.submit(callable));
        }
        for(Future<Integer> item: results)
        {
            System.out.println(item.get());
        }

        worker.shutdown();
        try {
            if (!worker.awaitTermination(800, TimeUnit.MILLISECONDS)) {
                worker.shutdownNow();
            }
        } catch (InterruptedException e) {
            worker.shutdownNow();
        }
    }
}
