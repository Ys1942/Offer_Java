package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
///find the number in the 2-d arrays

public class Test3{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[][] arry = new int[][]{
			{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}
		};
		
		
		while(true){
			int n = input.nextInt();
			System.out.println(Search(arry, n));
		}
		
		
	}
	
	public static boolean Search(int[][] arry,int num){
		int rows = arry.length;
		int cols = arry[0].length;
		
		int row = 0;
		int col = cols-1;
		
		while(row>=0&&col<=cols-1&&row<=rows-1&&col>=0){
			if(arry[row][col]==num)
				return true;
			else if(arry[row][col]>num)
				col--;
			else
				row++;
		}
		return false;
	}
}
