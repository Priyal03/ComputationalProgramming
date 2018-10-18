package examples;

import java.util.Scanner;

public class CutTheSticks {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        while(arr.length>0){
	        	int count=0;
	        	int min=getMinValue(arr);
	 	        for(int i=0;i<n&&arr[i]!=0;i++){
	 	        	arr[n]=arr[n]-min;
	 	        	count++;
	 	        }
	 	       System.out.println(count);
	        }
	       
	    }
	 public static int getMinValue(int[] array){  
	     int minValue = array[0];  
	     for(int i=1;i<array.length;i++){  
	     if(array[i] < minValue){  
	     minValue = array[i];  
	        }  
	     }  
	    return minValue;  
	}  

}
