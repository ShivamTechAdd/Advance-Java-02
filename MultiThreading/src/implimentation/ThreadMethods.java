package implimentation;

public class ThreadMethods extends Thread{
//    @Override
//    public void run() {
//        for(int i=0;i<=5;i++){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(i);
//        }
//    }
    public ThreadMethods(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+ " Priority " + Thread.currentThread().getPriority() +" Count: "+i);
            try{
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        ThreadMethods t1 = new ThreadMethods();
//        t1.start();
//        t1.join();
//        System.out.println("Hello Main thread again started.");

        ThreadMethods l = new ThreadMethods("Low_priority_Thread");
        ThreadMethods m = new ThreadMethods("Medium_Priority_Thread");
        ThreadMethods h = new ThreadMethods("High_Priority_Thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();

    }
}


//start run sleep join setPriority.