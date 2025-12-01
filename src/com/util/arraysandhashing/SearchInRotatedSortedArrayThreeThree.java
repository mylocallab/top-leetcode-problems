package com.util.arraysandhashing;

public class SearchInRotatedSortedArrayThreeThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 23;

		int found = searchBruteforce(nums, target);
		System.out.println(found);

		int foundB = searchBinary(nums, target);
		System.out.println(foundB);

	}

	private static int searchBinary(int[] nums, int target) {
		// TODO Auto-generated method stub
		int left=0;
		int right=nums.length-1;
		
	    while(left<=right) {
	    	
	    	int mid=left+(right-left)/2;
	    	
	    	if(nums[mid]==target) {return mid;}

	    	//check if left half is sorted
	    	
	    	if(nums[left]<=nums[mid]) {
	    		
	    		//target is in this sorted left half
	    		if(nums[left]<=target&&target<nums[mid]) {
	    			right=mid-1;
	    		}else {
	    			left=mid+1;
	    		}
	    	}else {
	    		//otherwise right is sorted
	    		if(nums[mid]<target&&target<=nums[right]) {
	    			
	    			left=mid+1;
	    		}else
	    		{
	    			right=mid-1;
	    		}
	    	}
	    }
	
	    return -1;
	}

	private static int searchBruteforce(int[] nums, int target) {
		// TODO Auto-generated method stub

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
