/*
write a simple program using Queue interface and add 6 integers and proint them and remove 2 integral out of it, print the removed elemetns and existing elements(Hint - use Queue)
*/
import java.util.*;
class Task5_Queue{
	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<Integer>();
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<6;i++){
			pq.offer(scan.nextInt());
		}
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq);
	}
}

