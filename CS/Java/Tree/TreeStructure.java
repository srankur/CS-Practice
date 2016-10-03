public class TreeStructure{
	TreeNode RootNode;

	private class TreeNode{
		int iData = -1;
		TreeNode left = null;
		TreeNode right = null;

	public TreeNode(int iDataToStore){
		iData = iDataToStore;
		this.left = null;
		this.right = null;
		}	
	}
	
	public TreeStructure(){
	RootNode = null;
	}
	
	public void AddNode(int iDataToStore ){
		RootNode =AddNode( iDataToStore, RootNode );	
	}
	public TreeNode AddNode(int iDataToStore, TreeNode Node ){
		if(Node == null){
			Node = new TreeNode(iDataToStore);
			System.out.println("Node Added, Data::"+iDataToStore );
		}

		if(iDataToStore < Node.iData){
			System.out.println("Node has Data::"+Node.iData+" Data To Store is::"+iDataToStore+" Calling Left ->" );
			Node.left =  AddNode(iDataToStore,Node.left );
		}

		if(iDataToStore > Node.iData){
			System.out.println("Node has Data::"+Node.iData+" Data To Store is::"+iDataToStore+" Calling Right ->" );
			Node.right = AddNode(iDataToStore, Node.right);
		}
		System.out.println("Printing Node Data Before returning::"+Node.iData );
		return Node;

          }
		
	
	
	
	public void PrintTree(){
	
	PreorderTree(RootNode);
	InorderTree(RootNode);
	PostorderTree(RootNode);
	

	}
	public void PreorderTree(TreeNode Node){
		if(Node == null){
		//	System.out.println("No Node Available" );
			return;
		}
		System.out.println("TreeData in PREORDER:" + Node.iData);
		PreorderTree(Node.left);
		PreorderTree(Node.right);

	}

	public void InorderTree(TreeNode Node){
		if(Node == null){
		//	System.out.println("No Node Available" );
			return;
		}
		InorderTree(Node.left);
		System.out.println("TreeData in INORDER:" + Node.iData);
		InorderTree(Node.right);

	}

	public void PostorderTree(TreeNode Node){
		if(Node == null){
		//	System.out.println("No Node Available" );
			return;
		}
		PostorderTree(Node.left);
		PostorderTree(Node.right);
		System.out.println("TreeData in POSTORDER:" + Node.iData);

	}


}


