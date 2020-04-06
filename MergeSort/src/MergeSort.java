
public class MergeSort {
	
	public static void main(String[] args) {
		String[] items = {"sohail", "apple", "cat", "ball", "elephant"};
		
		for(int i = 0; i < items.length; i++) {
			System.out.print(items[i] + " ");
		}
		System.out.println();
		mergesort(items, 0, 4);
		
		for(int i = 0; i < items.length; i++) {
			System.out.print(items[i] + " ");
		}
	}
	
	/**
	 * sorts the items
	 * @param items - the array to be sorted
	 * @param start - the index of which to start
	 * @param end - the index of which to end
	 */
	public static void mergesort(String[] items, int start, int end) {
		if(start < end ) {
			int mid = (start+end) / 2; 
			mergesort(items, start, mid);
			mergesort(items, mid+1, end);
			merge(items, start, mid, end);
		}
	}
	
	/**
	 * sorts the items	
	 * @param items - the array to be sorted
	 * @param start - the index of which to start
	 * @param mid - the index of the mid point of the array
	 * @param end - the end of the array; 
	 */
	public static void merge(String[] items, int start, int mid , int end) {
		String[] temp = new String[items.length];
		int pos1 = start;
		int pos2 = mid+1;
		int spot = start;
		while(pos1 <= mid || pos2 <= end) {
			if((pos1 > mid) || ((pos2 <= end) && (items[pos2].compareTo(items[pos1]) < 0 ))) {
				temp[spot] = items[pos2];
				pos2++; 
			}else {
				temp[spot] = items[pos1];
				pos1++;
			}
			spot++;
		}
		for(int i = start; i <= end; i++) {
			items[i] = temp[i];
		}
		
	}

	
}
