/*
write a java program to store group of integers[order of insertion  elemetns does not matter](Hint- use HashSet)
*/
import java.util.HashSet;
import java.util.Scanner;
public class Task1_HS{
    public static void main(String args[]){
        int ch;
        Scanner scan=new Scanner(System.in);
        HashSet<Integer> h=new HashSet<Integer>();
        do{
        	System.out.println("1 for insertion\t2 for display\t0 for exit\nEnter your choice: ");
        	ch=scan.nextInt();
        	switch(ch){
        		case 1:
        			System.out.print("Enter the value to insert: ");
        			h.add(scan.nextInt());
        			break;
        		case 2:
        			System.out.println("\n-------\n"+h+"\n--------\n");
        			break;
        		case 0:
        			ch=0;
        			break;
        		default:
        			System.out.println("\nPlease enter valid input...");

        	}
        }while(ch!=0);
    }
}

