package implimentation;

public class interupt extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is runnning............");
        } catch (InterruptedException e) {
            System.out.println("Thread interupted:- "+e);
        }
    }

    public static void main(String[] args) {
        interupt t1 = new interupt();
        t1.start();
        t1.interrupt();
    }
}
