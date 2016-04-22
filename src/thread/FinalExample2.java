package thread;

public class FinalExample2 {
    final int i;

    static FinalExample2 obj;



    public FinalExample2() {
        obj = this;
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i = 1;
    }



    public static void writer() {
        obj = new FinalExample2();
    }






    public static void reader() {
        if (obj != null) {
            System.out.println(Thread.currentThread().getName() + ":::" + obj.i);
        }

    }



    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                FinalExample2.writer();
                FinalExample2.reader();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                FinalExample2.reader();
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
    }
}
