package arbore;

public class Node {
	
	public Object data;
	private Node left, right;
	
	public Node(Object data, Node left, Node right){
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
	public Object getLeftMostData (){
		if (left == null)
			return data;
		else
			return left.getLeftMostData();
	}
	
	
	public Object getRightMostData (){
		if (right == null)
			return data;
		else
			return right.getRightMostData();
	}
	
	
	//traversarea in inordine (left -> node -> right)
	public void inorderPrint(int depth){
		if (left != null)
			left.inorderPrint(depth+1);
		for (int i = 0; i < depth; i++)
			System.out.println("___----");
		System.out.println(data);
		if (right != null)
			right.inorderPrint( depth + 1);
	}
	
	//traversarea in postordine (left -> right -> node)
	public void postorderPrint (int depth){
		if (left != null)
			left.postorderPrint( depth + 1);
		if (right != null)
			right.postorderPrint(depth + 1);
		for (int i = 0; i < depth; i++)
			System.out.println("___");
		System.out.println(data);
	}
	
	//traversarea in preordine (node -> left -> right)
	public void preorderPrint (int depth){
		for (int i = 0; i< depth; i++)
			System.out.println("___");
		System.out.println(data);
		if (left != null)
			left.preorderPrint(depth + 1);
		if (right != null)
			right.preorderPrint(depth + 1);
	}
	
	// se verifica daca nodul este frunza (true) sau nu (false)
	public boolean isLeaf(){
		if ((left==null) && (right==null))
			return true;
		else
			return false;
	}
	
	// se calculeaza numarul de noduri al arborelui binar
	public static int treeSize(Node root){
		if (root == null)
			return 0;
		else 
			return 1 + treeSize(root.left) + treeSize(root.right);
	}
}
