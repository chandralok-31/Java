public class myThread1 implements Runnable {

    public void run() {
        //task for the thread
        for(int i=0;i<10;i++) {
            System.out.println("the value of the thread " + i );
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){

            }
        }
    }

    public static void main(String[] args) {
        myThread1 t1=new myThread1();
        Thread  thr=new Thread(t1);
        


        // object of another thread
        myThread2 t2=new myThread2();
        thr.start();
        t2.start();
    }
    
}
