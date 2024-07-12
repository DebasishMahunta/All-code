package MultiThreading;

public class Customer implements Runnable{
	int avaliable =1,passenger;
	Customer(int passenger){
		this.passenger=passenger;
	}
	public synchronized void run() {
		String name = Thread.currentThread().getName();
		if(avaliable>=passenger) {
			System.out.println(name+" Reserved Seat...");
			avaliable = avaliable-passenger;
		} else {
			System.out.println("Sorry seat not avaliable....");
		}
		
	}
}
class Bus{
	public static void main(String[] args) {
		Customer c = new Customer(1);
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		Thread t3=new Thread(c);
		
		t1.setName("Pinku");
		t2.setName("Alekha");
		t3.setName("Babua");
		
		t1.start(); t2.start();t3.start();
	}
}
