package Test;

public class FinalExample {
    final int[] i;

    static FinalExample obj;



    public FinalExample() {
        i = new int[1];
        i[0] = 1;
    }



    public static void writer() {
        obj = new FinalExample();
    }



    public static void writer2() {
        obj.i[0] = 2;
    }



    public static void reader() {
        if (obj != null) {
            System.out.println(Thread.currentThread().getName() + ":::" + obj.i[0]);
        }

    }



    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    FinalExample.writer();
                    FinalExample.reader();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    FinalExample.writer2();
                    FinalExample.reader();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        FinalExample.writer();
//        FinalExample.writer2();
//        FinalExample.reader();
    }
}
