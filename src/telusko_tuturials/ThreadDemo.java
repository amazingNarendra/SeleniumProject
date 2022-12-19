package telusko_tuturials;
class Hi extends Thread{
	public void run()  {
		for(int i=0;i<5;i++) {
			System.out.println("HI");
			try {Thread.sleep(500);	} catch (InterruptedException e) {}
		}
	}
}
class Hello extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("HELLO");
		    try {Thread.sleep(500);	} catch (InterruptedException e) {}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Hi o= new Hi();
		Hello o1=new Hello();
		o.start();
		 try {Thread.sleep(500);	} catch (InterruptedException e) {}// makes code without random
		o1.start();
//		o.show();
//		o1.show();
		

	}

}
