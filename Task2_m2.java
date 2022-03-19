/*
Create 5 Thread nd print "Hello India" using Runnable interface
*/
class MyThread implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName()+":\tHello India");
	}
}
class Task2_m2{
	public static void main(String[] args) {
		MyThread m1=new MyThread();
		Thread t1=new Thread(m1);
		t1.start();
		MyThread m2=new MyThread();
		Thread t2=new Thread(m2);
		t2.start();
		MyThread m3=new MyThread();
		Thread t3=new Thread(m3);
		t3.start();
		MyThread m4=new MyThread();
		Thread t4=new Thread(m4);
		t4.start();
		MyThread m5=new MyThread();
		Thread t5=new Thread(m5);
		t5.start();
	}
}
