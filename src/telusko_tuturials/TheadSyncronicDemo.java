package telusko_tuturials;
class Counter{
	int c;
	public synchronized void increment() {
		c++;
	}
}

public class TheadSyncronicDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Counter c =new Counter();
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int j=0;j<1000;j++) {
					c.increment();
				}
				
			}
		});
Thread t2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int j=0;j<1000;j++) {
					c.increment();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("count   "+c.c);

	}
	

}
