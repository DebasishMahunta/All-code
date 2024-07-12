package MultiThreading;
import java.util.*;

class SingleRun implements Runnable{
	public void run(){
		Thread t = Thread.currentThread();
		 String name = t.getName();

		 if(name.equals("ADD")){
		 	addition();
		 } else if(name.equals("CHAR")){
		 	printChar();
		 } else{
		 	printNum();
		 }
	}
	void addition(){
		System.out.println("Addition activity statrted");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println(c);
		System.out.println("Addition activity completed");
	}
	void printNum(){
		System.out.println("Number printing statrted");
		for(int i=1; i<=10; i++){
			System.out.println(i);
			try{
				Thread.sleep(3000);
			} catch(Exception e){
				System.out.println("Number printing stopped");
			}
		}
		System.out.println("Number printing completed");
	}
	void printChar(){
		System.out.println("Character printing statrted");
		for(int i=65; i<=75; i++){
			System.out.println((char)i);
			try{
				Thread.sleep(3000);
			} catch(Exception e){
				System.out.println("Character printing stopped");
			}
		}
		System.out.println("Character printing completed");
	}
}
public class MultithreadingRunnable {
	public static void main(String args[]) {
		SingleRun sr = new SingleRun();

		Thread t1 = new Thread(sr);
		Thread t2 = new Thread(sr);
		Thread t3 = new Thread(sr);

		t1.setName("ADD");
		t2.setName("CHAR");
		t3.setName("NUM");

		t1.start();
		t2.start();
		t3.start();

	}

}
