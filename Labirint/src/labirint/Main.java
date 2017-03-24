package labirint;

public class Main {
	public static void main(String[] args) {
		SearchPath s = new SearchPath();
		int[][] mat = new int[][] { 
			{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
			{ 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
			{ 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
			{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
			{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
			{ 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
			{ 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 },
			{ 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 } };

		Point start = new Point(0, 0);
		Point dest = new Point(3, 4);

		int dist = s.search(mat, start, dest);

		if (dist != Integer.MAX_VALUE)
		    System.out.println("Cea mai scurta cale: " + dist);
		else
		    System.out.println("Nu exista o cale!");

	    }
}
