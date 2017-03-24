package heapOperations;

public class Heap {
	
	private int size;
	private int[] heap; 
		
		
	public Heap(int[] array){
		size = array.length;
		heap = array;
	}
	
	public void buildHeap (int[] heap){
		
		for (int i = size/2; i <= size; i++)
			shiftDown(heap,i);
	}
	
	public void shiftDown(int[] heap, int i){
		
		int k,j,aux;
		k = i;
		
		do{
			j = k;
			
			if ( (2*j <= heap.length) && (heap[k] < heap[2*j]) )
				k = 2*j;
			if ( (2*j < heap.length) && (heap[(2*j) + 1] > heap[k]) )
				k = 2*j + 1;
			
			aux = heap[j];
			heap[j] = heap[k];
			heap[k] = aux;
		}
		while (j != k);
	}
	
	public void percolate(int[] heap, int i){
		
		int k,j,aux;
		k = i;
		
		do{
			j = k;
			
			if (j>1 && (heap[j/2] < heap[k]) )
				k = j/2;
			
			aux = heap[j];
			heap[j] = heap[k];
			heap[k] = aux;
		}
		while (j == k);
	}
	
	public int maxim (int i, int k){
		
		if (i >= k)
			return i;
		else 
			return k;
	}
	
	public void sort (int[] heap){
		
		int aux;
		buildHeap(heap);
		for (int i = size; i > 2; i--){
			aux = heap[1];
			heap[1] = heap[i];
			heap[i] = aux;
		}
	}
	
	public void heapIncreaseKey(int[] heap, int i, int k){
		
		int[] parent = heap;
		heap[i] = maxim(heap[i],k);
		
		if (heap[i] > parent[i])
			percolate(heap,i);
		else if (heap[i] < parent[i])
			shiftDown(heap,i);
	}
	
	public void heapDelete(int[] heap, int i){
		
		if (heap.length == 0)
			System.out.println("Lista este goala!");
		else
			heap[i] = heap[i+1];
		    percolate(heap,i);	
	}
	
	public void merge (int[] a, int[] b){
		int[] finalList = new int[a.length + b.length];
		sort(a);
		sort(b);
		
		for (int i = 0; i < a.length; i++){
			finalList[i] = a[i];
		}
		int size = finalList.length;
		
		for (int j = 0; j < b.length; j++){
			finalList[size] = b[j];
			size++;
		}
		
		sort(finalList);
	}
}
