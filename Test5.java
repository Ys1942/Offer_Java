package offer;

import java.util.Arrays;

public class Test5 {
	public static void main(String[] args) {
		int[] a1 = new int[]{6,0,5,2,1,6,7,9,8};
		int[] a2 = new int[]{1,8,3,8,0,1,0,1,8,3,1};
		Arrays.sort(a1);
		Arrays.sort(a2);
		int index1 = a1.length-1;
		int index2 = a2.length-1;
		
		int[] a3 = new int[a1.length+a2.length];
		
		for (int i = a3.length-1; i >=0; i++) {
			if(index1>=0&&a1[index1]>a2[index2]){
				a3[i] = a1[index1];
				index1--;
			}
			else{
				a3[i] = a2[index1];
				index2--;
			}
		}
	}
	
}
