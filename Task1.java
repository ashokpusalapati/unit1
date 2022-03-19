class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName()+":\tHello All");
	}
}
class Task1{
	public static void main(String[] args) {
		MyThread m1=new MyThread();
		m1.start();
		MyThread m2=new MyThread();
		m2.start();
		MyThread m3=new MyThread();
		m3.start();
		MyThread m4=new MyThread();
		m4.start();
		MyThread m5=new MyThread();
		m5.start();

	}
}
