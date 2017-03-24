package heapOperations;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {2,3,5};
		Heap heap = new Heap(array);
		
		heap.buildHeap(array);
		heap.sort(array);
		heap.heapIncreaseKey(array, 2, 7);
		heap.heapDelete(array, 3);
		
		
		int[] a = {4,6};
		int[] b = {3,9};
		heap.merge(a, b);
	}

}
