package telusko_tuturials;

class Helloo implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("HELLO    " +Thread.currentThread().getPriority());
		    try {Thread.sleep(500);	} catch (InterruptedException e) {}
		}
	}
}

public class ThreadDemouInterface {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		Runnable o=()-> {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("HI");
//			try {Thread.sleep(500);	} catch (InterruptedException e) 					{
//			}
//		}
//	
//} ;
		Helloo o1=new Helloo();
		Thread t1= new Thread(()-> {
			for (int i = 0; i < 5; i++) {
				System.out.println("HI");
				try {Thread.sleep(500);	} catch (InterruptedException e) 					{
				}
			}
		
	});              
		t1.setName("HI Thread");// thread naming
		Thread t2= new Thread(o1,"Hello thread");  // thread naming
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(10);
		
		System.out.println(t1.getName() +": priotity is  "+t1.getPriority());
		System.out.println(t2.getName()+": priotity is  "+t1.getPriority());
		
		t1.start();
		 try {Thread.sleep(500);	} catch (InterruptedException e) {}// makes code without random
		t2.start();
//		o.show();
//		o1.show();
		System.out.println(t1.isAlive()); //return true
		t1.join();
		t2.join();
		System.out.println(t1.isAlive()); //return false
		System.out.println("Bye"); // main job prints bye
		

	}

}
