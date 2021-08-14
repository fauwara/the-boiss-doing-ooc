package assignment3;

class PrintDemo extends Thread {
   public void printCount() {
      try {
         for(int i = 5; i > 0; i--) {
            System.out.println("Counter --- " + i );
         }
      } catch (Exception e) {
         System.out.println("Thread " + Thread.currentThread().getName()+" interrupted.");
      }
   }
   public void run() {
      synchronized(this) {
         printCount();
         System.out.println("Thread " + Thread.currentThread().getName() + " exiting.");
      }
      
   }
   //public synchronized void display() {
	   
   //}
}
class PrintDemo2 extends Thread{
	public void printCount() {
		try {
	         for(int i = 0; i < 6; i++) {
	            System.out.println("Counter --- " + i );
	         }
	      } catch (Exception e) {
	         System.out.println("Thread " + Thread.currentThread().getName()+" interrupted.");
	      }
	
	}
	public synchronized void run() {
	         printCount();
	         System.out.println("Thread " + Thread.currentThread().getName() + " exiting.");
	}
}
public class partB {
   public static void main(String args[]) {
      PrintDemo PD = new PrintDemo();
      PrintDemo2 PD2 = new PrintDemo2();
      Thread t1 = new Thread(PD );
      Thread t2 = new Thread(PD2 );
      t1.start();
      t2.start();
      // wait for threads to end
      try {
         t1.join();
         t2.join();
      } catch ( Exception e) {
         System.out.println("Interrupted");
      }
   }
}