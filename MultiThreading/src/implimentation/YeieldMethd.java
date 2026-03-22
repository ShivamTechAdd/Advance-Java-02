package implimentation;

    public class YeieldMethd extends Thread{
        @Override
        public void run() {
          while(true){
              System.out.println(Thread.currentThread().getName() + " is running ");
              Thread.yield();
          }
        }

        public static void main(String[] args) throws InterruptedException{
            YeieldMethd t1 = new YeieldMethd(); // User thread // 2.Demon thread;
            YeieldMethd t2 = new YeieldMethd();
            t1.start();
            t2.start();
    }
}
