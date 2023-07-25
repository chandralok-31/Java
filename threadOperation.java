class UserThread extends Thread {
    public void run() {
        System.out.println("user defined thread ");
    }
}


public class threadOperation {
    public static void main(String[] args) {
        System.out.println("program started");
        int x=56+34;
        System.out.println("sum is " + x);
        Thread t=Thread.currentThread();
        String tname=t.getName();
        System.out.println("currnt running thread is "+tname);
        t.setName("myMain");
        System.out.println(t.getName());
        try{
            Thread.sleep(3000);
        }
        catch(Exception e){

        }
        System.out.println(t.getId());
        System.out.println("program ended");
        UserThread ut = new UserThread();
        ut.start();
    }
    
}
