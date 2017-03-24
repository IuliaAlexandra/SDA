package arbore;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node a = new Node (15, null, null);
		Node b = new Node (18, null, null);
		Node c = new Node (12, a, b);
		
		a = new Node (20, null, null);
		b = new Node (7, null, a);
		a = new Node (1, c, b);
		
		System.out.println("Inordine");
		a.inorderPrint(0);
		System.out.println("***");
		System.out.println("Preordine: ");
		a.preorderPrint(0);
		System.out.println("***");
		System.out.println("Postordine:");
		a.postorderPrint(0);
  }
}
