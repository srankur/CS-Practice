import java.util.Scanner;

public class DoubleList{
	public static void main(String[] args) {
		int iChoice = -1;
		int iData;
		String sContChoice;
		DoubleListNode Head =null;
		Scanner in = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
		//DoubleListNode Head = new DoubleListNode();
/*		DoubleListNode Head = new DoubleListNode(20);
		Head.InsertNodeAtEnd(25);
		Head.InsertNodeAtEnd(30);
		Head.InsertNodeAtEnd(30);
		Head.InsertNodeAtEnd(50);
		Head.InsertNodeAtEnd(70);
		Head.InsertNodeAtEnd(80);
		Head = Head.AddNodeAtFront(100);
		Head = Head.AddNodeAtFront(10001);
		Head.InsertNodeAtIndex(2,500);
		Head.InsertNodeAtIndex(11,5600);
		Head.SizeofList();
		Head.PrintDoubleListForwardandBackward();*/
		do{
			System.out.println(
			"Please select from following permitted operations...\n" +
			"1: Create a Head Node..\n" +
			"2: Append a Node \n" +
			"3: Insert a Node at front \n" +
			"4: Insert a Node at a particular index \n" +
			"5: Print a List Forward/Backward \n" +
			"6: Size of the List \n" +
			"7: Delete a data/Node from List \n" 
			);
			System.out.println("Enter your choice now ::");
			iChoice = in.nextInt();
			switch (iChoice) {
				case -1: 
				System.out.println("there was no choice entered");
				break;
				case 1: 
					System.out.println("Enter Integer Data to insert on Head Node");
					iData = in.nextInt();
					Head = new DoubleListNode(iData);
				break;
				case 2:
					System.out.println("Enter Integer Data to insert on Head Node");
					iData = in.nextInt();
					if(null == Head){
						Head = new DoubleListNode(iData);
					}
					else{
						Head.InsertNodeAtEnd(iData);	
					}
				break;
				case 3:
					System.out.println("Enter Integer Data to insert on Head Node");
					iData = in.nextInt();
					
					if(null == Head){
						Head = new DoubleListNode(iData);
					}
					else{
						Head = Head.AddNodeAtFront(iData);
					}
					break;
				case 4:
				
				case 5:
				
				case 6:
				
				case 7:
				

				default:
				System.out.println("Please Check the permitted operations.. ");
				break;
			}
			System.out.println("Current List is as follows-");
			System.out.println("##################################");
			if(null != Head){
				Head.PrintDoubleListForwardandBackward();
			}
			System.out.println("##################################\n\n\n\n");
			
			System.out.println("do you want to continue with operations");
			sContChoice = str.next();
			// Runtime.getRuntime().exec("clear"); **TODO add exception here ask thakur
			System.out.print("\033[H\033[2J");  
    		System.out.flush();  
		} while ( sContChoice.equals("Yes") );
	}
}