package examples;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BinaryNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int w[][]=new int[5][5];
        int max=0;
        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                w[i][j]=arr[i+1][j+1]+arr[i][j]+arr[i-1][j-1]+arr[i-1][j]+arr[i+1][j]+arr[i+1][j-1]+arr[i-1][j+1];
               if(max<w[i][j]){
            	   max=w[i][j];
               }
            }
        }
        System.out.println(max);
    }
    
}