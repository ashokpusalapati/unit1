import java.util.*;
class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
class Task1{
	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
	}
}
