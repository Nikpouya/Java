package MultiThreading;

import java.util.concurrent.Callable;

public class myCallable implements Callable<Integer> {
    private int counter =0;
    @Override
    public Integer call() throws Exception {
        counter ++;
        return counter;
    }
}
