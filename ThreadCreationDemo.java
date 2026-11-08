// Experiment 5(a): Creation of a thread by extending Thread
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child thread: " + i);
        }
    }
}

public class ThreadCreationDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // start() creates a new thread and calls run()
        System.out.println("Main thread is running");
    }
}
