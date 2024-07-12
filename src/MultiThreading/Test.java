package MultiThreading;
import java.util.*;
class Test1 implements Runnable{

	public void run(){
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
}
class Test2 implements Runnable{
	public void run(){
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
}
class Test3 implements Runnable{
	public void run(){
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

public class Test {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		Test3 t3 = new Test3();

		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);

		th1.start();
		th2.start();
		th3.start();

	}

}
