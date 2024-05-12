package CollectionPractice;

public class Maxarea {
	    public int maxArea(int[] height) {
	        int maxWater = 0;
	        int left = 0;
	        int right = height.length - 1;  //8

	        while (left < right) {
	            // Calculate the current area
	            int currentWater = Math.min(height[left], height[right]) * (right - left);
	            maxWater = Math.max(maxWater, currentWater);

	            // Move pointers inward
	            if (height[left] < height[right]) {
	                left++;
	            } else {
	                right--;
	            }
	        }

	        return maxWater;
	    }

	    public static void main(String[] args) {
	        Maxarea container = new Maxarea ();

	        // Example 1
	        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
	        System.out.println(container.maxArea(height1)); // Output: 49

	        // Example 2
	        int[] height2 = {1, 1};
	        System.out.println(container.maxArea(height2)); // Output: 1
	    }

}
