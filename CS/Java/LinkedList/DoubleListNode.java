public class DoubleListNode{
int iData = -1;
DoubleListNode pNext = null;
DoubleListNode pPrev = null; 

//DoubleListNode(){}
DoubleListNode(int istoreData){
	this.iData = istoreData;
}
/*This function will add the nodes at front of the list before header*/
DoubleListNode AddNodeAtFront(int istoreData){
	DoubleListNode current = this;
	DoubleListNode temp = new DoubleListNode(istoreData);
	temp.pNext = this;
	this.pPrev = temp;
	return temp;
}


void InsertNodeAtEnd(int istoreData){
	DoubleListNode current = this ;
	if(null == current){
		System.out.println("There was no Head node.. adding one..");
		this.AddNodeAtFront(istoreData);
	}
	while(current.pNext != null){
		current = current.pNext;
	}
	current.pNext = new DoubleListNode(istoreData);
	current.pNext.pPrev = current;
	current = current.pNext;
	current.pNext = null;
}

void InsertNodeAtIndex(int iIndex, int istoreData){
	DoubleListNode current =this;
	if(iIndex > SizeofList() || iIndex < 1){
		System.out.println("Given Index is either less than 1 or greater than the list");
		return;
	}
	else{
		for(int iCount = 1;iCount < iIndex ; iCount++){
			current = current.pNext;
		}
		DoubleListNode temp = new DoubleListNode(istoreData);
		temp.pNext = current;
		temp.pPrev = current.pPrev;
		current.pPrev.pNext = temp;
		current.pPrev = temp;
	}
}

int SizeofList(){
	DoubleListNode current = this;
	int iCount = 0;
	while(null != current){
		iCount = iCount +1;
		current = current.pNext;
	}
	System.out.println("Size of List :: " + iCount);
	return iCount;
}
void PrintDoubleListForwardandBackward(){
	DoubleListNode current = this;
	int iCount=0;
	if(null!= current){
		while(null != current){
			iCount = iCount+1;
			System.out.println("Data at Index:: " + iCount + " is " + current.iData);
			if(null != current.pNext){
				current = current.pNext;
			}
			else break;			
		}
		
		System.out.println("List reaches at End. now Printing backwards!!");
		while(null != current){
			System.out.println(current.iData);
			if(null != current.pPrev){
				current = current.pPrev;	
			}
			else break;
			
		}
		System.out.println("Doubly List reaches back to Head!!!");

	}
	else{
		System.out.println("No data to Print");
	}
}

DoubleListNode SearchAndDeleteNode(int iDeleteData){
	DoubleListNode current = this;
	int iCount = 0;
	// if there is no list at all. return.. 
	if (null == current){
		System.out.println("There is no node to delete");
		return null;
	}
	// if there is only one node and data doesn't exist...
	if ( (null == current.pNext) && (null == current.pPrev) && (iDeleteData != current.iData)){
		System.out.println("searched data doesn't exist in the list.. returning existing list...");
		return this;
	}
	// if there is only one node and node identified for deletion[Data matched] . return there is no data left. 
	if ( (null == current.pNext) && (null == current.pPrev) && (iDeleteData == current.iData)){
		System.out.println("List left with no Node as the only node deleted.. ");
		return (current = null);
	}
	// Data list has more than 1 node and data found on Head node. returning rest of the node. 
	if((null == current.pPrev) &&(null !=current.pNext) && (iDeleteData == current.iData) ){
		System.out.println("Data found on head node, returning rest of the list");
		return(current.pNext);
	}
	// List needs to be traverse and search if data exist..
	while(null == current.pNext){
		++iCount;
		if(current.iData == iDeleteData){
			System.out.println("Data found on Index ::" + iCount);
			current.pPrev.pNext = current.pNext;
			current.pNext.pPrev = current.pPrev;
			return this;
		}
		current = current.pNext;
	}
System.out.println("List Exausted Data not found");
return current;
}

}