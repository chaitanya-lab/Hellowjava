package CollectionPractice;

public class BinarySearch {

	public static void main(String args[]) {
		
		int arr[]= {1,3,5,6,7,8,9,10};
		int target=11;
		 int result = binarySearch(arr, target);

	        if (result != -1) {
	            System.out.println("Element found at index: " + result);
	        } else {
	            System.out.println("Element not found in the array.");
	        }
		
	
	}

	private static int binarySearch(int[] arr, int target) {
		int low=0;
		int high=arr.length-1;
		
		while(low<=high) {
			
			int mid=low+(high-low)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[mid]<target) {
				low=mid+1;
			}
			else {
				low=mid-1;
			}
		}
		return -1;
	}
}
