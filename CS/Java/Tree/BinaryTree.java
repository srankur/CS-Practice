import java.util.Scanner;

public class BinaryTree{

public static void main (String[] args){
	
	Scanner scan = new Scanner(System.in);	
	BToperations bto = new BToperations();
	char cont = 'N';
	System.out.println("Binary Tree Application");
	
	do{
	 
	System.out.println("Please choose from following operations\n\n");
	System.out.println("1. Insert");
	System.out.println("2. Search");
	System.out.println("3. Print in All Order");

	int choice = scan.nextInt();
	
		switch(choice){
		case 1: 
		System.out.print("Enter an integer to insert");
		bto.insert(scan.nextInt());
		break;
	
		case 2: 
		break;	

		case 3: 
		bto.inorder();
		break;	

		default : 
		System.out.println("Deafult Entry Exiting");
		break;	
		
		}
		
		cont = scan.next().charAt(0);
	} while (cont == 'Y' || cont == 'y');//continue == 'Y'|| continue == 'y');
	
	

  }

}
