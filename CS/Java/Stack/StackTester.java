import java.util.Scanner;

public class StackTester{

	public static void main(String[] args) {
		int iChoice = -1;
		int iData;
		String sContChoice;
		Scanner in = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
		StackList SHead = null;
	
	do{
			System.out.println(
			"Please select from following permitted operations...\n" +
			"1: Create a Head Node..\n" +
			"2: PUSH  \n" +
			"3: POP \n" +
			"4: Print Stack \n"
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
					SHead = new StackList(iData);
					break;
				case 2:
					System.out.println("Enter Integer Data to insert on Head Node");
					iData = in.nextInt();
					if (null == SHead){
						SHead = new StackList(iData);
					}
					else{
						SHead = SHead.Push(iData);	
					}
					break;
				case 3:
					if(null != SHead){
						SHead = SHead.Pop();
					}
					else{
						System.out.println("NO Data to Pop.. Sorry!!!");
					}
					break;
				case 4:
				SHead.PrintStack();
				break;

				case 5:
				
				case 6:
				
				case 7:
				

				default:
				System.out.println("Please Check the permitted operations.. ");
				break;
			}
			/*System.out.println("Current Stack is as follows-");
			System.out.println("##################################");
			if(null != Head){
				SHead.PrintStack();
			}
			System.out.println("##################################\n\n\n\n");*/
			
			System.out.println("do you want to continue with operations");
			sContChoice = str.next();
			// Runtime.getRuntime().exec("clear"); **TODO add exception here ask thakur
			System.out.print("\033[H\033[2J");  
    		System.out.flush();  
		} while ( sContChoice.equals("y") );

	}
}
