package labirint;

import java.util.ArrayDeque;
import java.util.Queue;

public class SearchPath {
	
	    public static final int LINII = 10;
	    public static final int COLOANE = 10;
	    
	    int[] rowNum = new int[] { -1, 0, 0, 1 };
	    int[] colNum = new int[] { 0, -1, 1, 0 };
		

	    static class QueueNode {
		public QueueNode(Point src, int d) {
		    this.point = src;
		    this.dist = d;
		}

		Point point; 
		int dist; 
	    }

	    int search(int mat[][], Point start, Point end) {

	    	if ((mat[start.x][start.y] == 0) || (mat[end.x][end.y] == 0))
	    		return Integer.MAX_VALUE;

	    	boolean[][] visited = new boolean[LINII][COLOANE];

	    	visited[start.x][start.y] = true;

	    	Queue<QueueNode> q = new ArrayDeque<QueueNode>();
	    	QueueNode s = new QueueNode(start, 0);
		    q.add(s); 
		    
		    while (!q.isEmpty()) {
		    	QueueNode curent = q.peek();
		    	Point p = curent.point;

		    	if (p.x == end.x && p.y == end.y)
		    		return curent.dist;

		        q.poll();

		        for (int i = 0; i < 4; i++) {
		        	int row = p.x + rowNum[i];
		        	int col = p.y + colNum[i];

			if ((isValid(row, col) && mat[row][col] == 1) && !visited[row][col]) {

			    visited[row][col] = true;
			    QueueNode adjCell = new QueueNode(new Point(row, col),
				    curent.dist + 1);
			    q.add(adjCell);
			}
		    }
		}
		return Integer.MAX_VALUE;
	    }
	    
	    public boolean isValid(int linie, int coloana) {
	    	
	    	if (((linie >= 0) && (linie < LINII)) && ((coloana >= 0) && (coloana < COLOANE)))
	    		return true;
	    	else
	    		return false;
	    }
}
