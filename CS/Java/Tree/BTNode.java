public class BTNode{

	BTNode left;
	BTNode right;
	int data;
	
	public BTNode(int idata){
		left = null;
		right= null;
		data = idata;
	}

	public void setLeft (BTNode node){
		left = node;
	}

	public void setRight (BTNode node){
		right = node;
	}	

	public BTNode getLeft(){
	 	return left;
	}

	public BTNode getRight(){
		return right;
	}

	public int getData(){
		return data;
	}

	public void setData(int idata){
		data =idata;
	}


}
