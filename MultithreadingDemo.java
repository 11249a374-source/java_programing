// Experiment 5(b): Multithreading using Runnable
class Task implements Runnable {
    private final String taskName;

    Task(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(taskName + " - count " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(taskName + " was interrupted");
                return;
            }
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task("Thread 1"));
        Thread t2 = new Thread(new Task("Thread 2"));

        t1.start();
        t2.start();
    }
}
