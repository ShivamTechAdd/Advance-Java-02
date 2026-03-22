package implimentation;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Running.");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException { //Main thread is executing
        MyThread t1 = new MyThread(); //new
        System.out.println(t1.getState());
        System.out.println(t1.getName());
        t1.start();                  //runnable :- means either ready to run or running.
        System.out.println(t1.getState());
        Thread.sleep(100); // sleeping main thread;
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }

}
