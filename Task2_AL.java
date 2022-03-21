/*
write a java program to store group of integers [order of insertion elements matters](Hint - use Array List)
*/
import java.util.Scanner;
import java.util.ArrayList;
class Task2_AL{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		int c;
		do{
			System.out.println("1 for insertion,\t2 for display,\t0 for exit\nenter your choice:");
			c=scan.nextInt();
			switch(c){
				case 1:
					System.out.print("Enter the number to store: ");
					al.add(scan.nextInt());
					break;
				case 2:
					System.out.println("\n-------\n"+al+"\n--------\n");
        				break;
        			case 0:
        				c=0;
        				break;
        			default:
        				System.out.println("please enter valid input..\n");
			}
		}while(c!=0);
	}
}


