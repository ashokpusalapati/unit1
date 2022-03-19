/*
Create a Thread using the Runnable interface and print Thread name
*/
class MyThread implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
class Task2{
	public static void main(String[] args) {
		MyThread m=new MyThread();
		Thread t=new Thread(m);
		t.start();
	}
}
