package CollectionPractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArray {

	public static void main(String args[]) {
		/*
		 * int arr[]= {2,5,2,7}; int arr1[]= {1,5,2,7};
		 */

		int nums1[] = { 1, 2 };
		int nums2[] = { 3, 4 };
		float median = 0;

		// Merge this array and sort it

		int merge[] = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();
		/*
		 * int merge[]=new int[arr.length+arr1.length];
		 * System.out.println(merge.length); int k=0; for(int i=0;i<merge.length;i++) {
		 * if(i<4) { merge[i]=arr[i]; } else {
		 * 
		 * merge[i]=arr1[k]; k++;
		 * 
		 * } }
		 */
		// Arrays.sort(merge);
		// int s=Arrays.compare(nums1, nums2);
		if (merge.length % 2 == 0) {
			median = (float) (merge[merge.length / 2 - 1] + merge[merge.length / 2]) / 2;
		} else {
			median = (float) merge[(merge.length / 2)];

		}
		System.out.println("\n" + median);
	}

}
