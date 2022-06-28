package com.binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] input = {10,20,30,45,58,78};
		int searchindenx =20 ;
		int a =performBinarySearch(input,searchindenx);
		System.out.println("this is the index "+ a);

	}
	
	public static int performBinarySearch(int[] input , int findIndex) {
		int low =0;
		int high = input.length-1;
		while(high>=low) {
			int middle= (low+high)/2;
			if(input[middle]==findIndex) {
				return middle;
			}
				else if(input[middle]<findIndex) {
					low=middle+1;
				}
				else if(input[middle]>findIndex) {
					high=middle-1;
				}
				
			}
		return -1;
		}
	}


