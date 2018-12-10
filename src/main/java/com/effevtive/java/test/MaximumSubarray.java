package com.effevtive.java.test;

public class MaximumSubarray {

	public static void main(String[] args) {
		int[] arr = {1,-1,4,3,-1};
//		violenceSolve(arr);
//		System.out.println("********************");
		divideAndConquer(arr);
	}

	public static void violenceSolve(int[] arr){
		int maxNum = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(maxNum<arr[j]-arr[i]) {
					maxNum = arr[j]-arr[i];
				}
			}
		}
		System.out.println(maxNum);
	}
	
	public static void divideAndConquer(int[] array) {
		int[] arr = new int[array.length-1];
		for(int i=0;i<array.length-1;i++) {
			arr[i] = array[i+1]-array[i];
		}
		int[] result = findMaximumSubarray(arr,0,arr.length-1);
		for(int j=0;j<result.length;j++) {
			System.out.println(result[j]);
		}
	}
	
	public static int[] findMaxCrossingSubarray(int[] arr) {
		int low = 0;
		int high = arr.length-1;
		int mid = (int)Math.floor(high/2);
		
		int leftSum = 0;
		int leftMax = 0;
		int left = 0;
		for(int i = mid;i>=low;i--) {
			leftSum = leftSum+arr[i];
			if (leftSum>leftMax) {
				leftMax = leftSum;
				left = i;
			}
		}
		
		int rightSum = 0;
		int rightMax = 0;
		int right = 0;
		for(int i = mid+1;i<=high;i++) {
			rightSum = rightSum+arr[i];
			if (rightSum>rightMax) {
				rightMax = rightSum;
				right = i;
			}
		}
		
		int[] result = {left,right,leftMax+rightMax};
		return result;
	}
	
	public static int[] findMaximumSubarray(int[] arr,int low,int high) {
		int[] result = new int[3];
		
		if (low == high) {
			result[0] = low;
			result[1] = high;
			result[2] = arr[low];
			return result;
		}
		else {
			int mid = (int)Math.floor(high/2);
			
			int leftLow = findMaximumSubarray(arr,low,mid)[0];
			int leftHigh = findMaximumSubarray(arr,low,mid)[1];
			int leftSum = findMaximumSubarray(arr,low,mid)[2];
			
			int rightLow = findMaximumSubarray(arr,mid+1,high)[0];
			int rightHigh = findMaximumSubarray(arr,mid+1,high)[1];
			int rightSum = findMaximumSubarray(arr,mid+1,high)[2];
			
			int crossLow = findMaxCrossingSubarray(arr)[0];
			int crossHigh = findMaxCrossingSubarray(arr)[1];
			int crossSum = findMaxCrossingSubarray(arr)[2];
			
			if (leftSum>=rightSum && leftSum>=crossSum) {
				result[0] = leftLow;
				result[1] = leftHigh;
				result[2] = leftSum;
				return result;
			}
			else if (rightSum>=leftSum && rightSum>=crossSum) {
				result[0] = rightLow;
				result[1] = rightHigh;
				result[2] = rightSum;
				return result;
			}
			else {
				result[0] = crossLow;
				result[1] = crossHigh;
				result[2] = crossSum;
				return result;
			}
		}
	}
}
