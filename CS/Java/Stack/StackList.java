public class StackList implements IStack{
	/*Push method */
	static int TopofStack = -1;  // -1 value shows there is no node in the stack.

	// Node structure as follows
	int iData;
	StackList NextNode = null;

	// Simple constructor Constructor
	public StackList( int iDataToStore){
		this.iData = iDataToStore;
		TopofStack++;
	}

	// Permitted operation on Stack are as PUSH and POP. Definition follows- 

	@Override
	public StackList Push(int iData){
		StackList currentNode = this;
		StackList tempNode = new StackList(iData);
		tempNode.NextNode = currentNode;
		TopofStack++;
		return tempNode;
		/*if( -1 == TopofStack || null == currentNode){
			StackList tempNode = new StackList(iData);
		}*/

	}
	@Override
	public StackList Pop(){
		StackList currentNode = this;
		System.out.println("Data at TopofStack:: " + currentNode.iData);
		TopofStack--;
		return(currentNode.NextNode);
	}

	public void PrintStack(){
		StackList currentNode = this;
		if(currentNode == null){
			System.out.println("NO Data in the StackList" );
		}

		while( null != currentNode){
			System.out.println("Data at Stack:: " + currentNode.iData);
			currentNode = currentNode.NextNode;
		}
	}

}
