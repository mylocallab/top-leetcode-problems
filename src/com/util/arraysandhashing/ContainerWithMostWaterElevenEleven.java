package com.util.arraysandhashing;

public class ContainerWithMostWaterElevenEleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] heights= {1,8,6,2,5,4,8,3,7};
		
		int maxArea=calculateMax(heights);
		System.out.println(maxArea);
		

	}

	private static int calculateMax(int[] heights) {
		// TODO Auto-generated method stub
		int left=0;
		int right=heights.length-1;
		int maxArea=0;
		while(left<right) {
			
		  int area=(right-left)*Math.min(heights[left], heights[right]);
		  
		  maxArea=Math.max(maxArea, area);
		  
		  if(heights[left]<heights[right]) {
			  
			  left++;
			  
		  }else
		  {
			  right--;
		  }
		  
		  
			
		}
		return maxArea;
	}

}
