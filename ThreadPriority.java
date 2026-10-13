
class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(
            getName() + " is running with priority "
            + getPriority()
        );
    }
}

public class ThreadPriority {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("Low Priority Thread");
        MyThread t2 = new MyThread("Normal Priority Thread");
        MyThread t3 = new MyThread("High Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
