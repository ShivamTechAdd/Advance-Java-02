

public class Test {
    public static void main(String[] args) {
        World world=new World(); //Thread-0.
        world.start();

        World2 world2=new World2(); //using runnable interface;
        Thread t1 = new Thread(world2); //New state;
        t1.start(); //Runnable state;

        for( ; ; ){
            System.out.println(Thread.currentThread().getName());
        }

    }
}
