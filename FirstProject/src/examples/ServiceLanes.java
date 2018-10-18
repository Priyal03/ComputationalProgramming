package examples;

import java.util.Scanner;

public class ServiceLanes {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        int ans=0;
        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
            ans=width[i];
            for(int x=i+1;x<=j;x++){
            	            	
            	if(width[x]<ans){
            		ans=width[x];
            	}
            }
            System.out.println(ans);
        }
    }
}
