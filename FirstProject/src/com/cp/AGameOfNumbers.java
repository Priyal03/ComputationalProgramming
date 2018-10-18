package com.cp;
import java.util.Scanner;

public class AGameOfNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int  ans = 0,answer=0;		
		for(int i=0;i<n;i++){
			
			ans = arr[i];
			boolean IsGreater=false,IsSmaller=false;
			for(int j = i+1; j<n && ! IsSmaller; j++){
				
				if(arr[j]>ans && !IsGreater){					
					ans = arr[j];					
					IsGreater=true;
					
				}else if(arr[j]<ans && IsGreater)
					{
						answer=arr[j];
						IsSmaller=true;
					
					}											
			}
			if(!IsGreater && !IsSmaller)
			{
				System.out.print(-1+" ");
			}
			else
			{
				System.out.print(answer+" ");
			}			
		}
	}
}
