package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger aInt = new AtomicInteger();
    private int           i;



    public static void main(String[] args) {
        final Counter cas = new Counter();
        List<Thread> threadList = new ArrayList<Thread>();
        long start = System.currentTimeMillis();

        for (int j = 0; j < 100; j++) {
            Thread t = new Thread(new Runnable() {

                @Override
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        cas.safeCount();
                        cas.count();
                    }
                }
            });

            threadList.add(t);
        }
        for (Thread thread : threadList) {
            thread.start();
        }

        for (Thread thread : threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(cas.i);
        System.out.println(cas.aInt.get());
        System.out.println(System.currentTimeMillis() - start);
    }



    private void safeCount() {
        aInt.incrementAndGet();
    }



    private void count() {
        i++;
    }
}
