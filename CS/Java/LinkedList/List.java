public class List{
	int iData;
	List cNextNode = null;
     
    List(int x){
    	iData = x;
    }
 
	public void InsertAtEnd(List IntList){
		List current = this;

		while( null != current.cNextNode)
		{
			current=current.cNextNode;
		}

		current.cNextNode = IntList;
	}

	public void printList( ){
		List current = this;
		while  ( null != current){
			System.out.println(current.iData);
			current = current.cNextNode;

		}
	}

	public boolean  lookup( int iDataToSearch){
		List current = this;
		while  ( null != current){
			if(current.iData == iDataToSearch){
				return true;
			}
			current = current.cNextNode;
			}
			return false;
		}

	public List split(int iDataToSearch){
		List current = this;
		List X5 =null;
		while  ( null != current){
			if(current.iData == iDataToSearch){
				X5 = current.cNextNode;
				current.cNextNode =null;
				return X5;
			}
		current = current.cNextNode;
		}
		return X5;
	}
		
}
		

	
