
/*
Create a program which prints the first 10 numbers using a fixed thread pool of size 5. Execute them using executor.Describe the behavior of the executor framework.(Hint use the Runnable interface)
*/

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
class MyJobs implements Runnable{
	int i;
	MyJobs(int i){
		this.i=i;
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+": "+i);
	}
}
class Task3_m2{
	public static void main(String[] args) {
		ExecutorService pool=Executors.newFixedThreadPool(5);
		MyJobs[] jobs={new MyJobs(1),new MyJobs(2),new MyJobs(3),new MyJobs(4),new MyJobs(5),new MyJobs(6),new MyJobs(7),new MyJobs(8),new MyJobs(9),new MyJobs(10)};
		for(MyJobs job:jobs){
			pool.execute(job);
		}
		pool.shutdown();
	}
}



/*
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
class MyJobs implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName()+" :\t "+i);
		}
	}
}
class Task3{
	public static void main(String[] args) {
		ExecutorService pool=Executors.newFixedThreadPool(5);
		MyJobs job=new MyJobs();
		pool.execute(job);
		pool.shutdown();
	}
}
-------------------
Executor Framework:
-------------------
 *A framework having a bunch of components that are used for managing worker threads efficiently is referred to as Executor Framework. 
 *The Executor API reduces the execution of the task from the actual task to be executed through the Executors. 
 *The executor framework is an implementation of the Producer-Consumer pattern.
 *The java.util.concurrent.Executors class provides a set of methods for creating ThreadPools of worker threads.
 *In order to use the executor framework, we have to create a thread pool for executing the task by submitting that task to that thread pool.

*/
