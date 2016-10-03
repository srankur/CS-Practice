public class BToperations{
	private BTNode root ;

	public BToperations(){
		root = null;
	}	

	public void insert(int idata){
		root = insert(root, idata);
	}

	private BTNode insert(BTNode node, int idata){
	
		if(node == null){
		node = new BTNode(idata);
		}
		else{
			if(node.right == null)
				node.left = insert(node.left, idata);
			else
				node.right = insert(node.right, idata);
		
		}
		
		return node;
	}


	public void inorder(){
		inorder(root);
	}
	
	private void inorder(BTNode node){
	
		if(node != null){
		inorder(node.left);
		System.out.print(node.getData());
		inorder(node.right);
		}
	
	}


}
