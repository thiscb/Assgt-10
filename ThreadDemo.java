package Assgt10;

public class ThreadExample extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        ThreadExample thread = new ThreadExample();
        thread.start(); // start the thread

        // wait for the thread to complete
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // check if the thread is alive
        System.out.println("Thread is alive: " + thread.isAlive());

        // set the thread priority
        thread.setPriority(Thread.MAX_PRIORITY);

        // get the thread priority
        System.out.println("Thread priority: " + thread.getPriority());

        // set the thread name
        thread.setName("MyThread");

        // get the thread name
        System.out.println("Thread name: " + thread.getName());

        // get the thread ID
        System.out.println("Thread ID: " + thread.getId());

        // get the thread state
        System.out.println("Thread state: " + thread.getState());

        // check if the thread is a daemon thread
        System.out.println("Thread is daemon: " + thread.isDaemon());

        // set the thread to be a daemon thread
        thread.setDaemon(true);

        // check if the thread is a daemon thread again
        System.out.println("Thread is daemon: " + thread.isDaemon());
    }
}
