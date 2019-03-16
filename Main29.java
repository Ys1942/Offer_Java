import java.util.ArrayList;
/**TopK问题
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * */
public class Main29 {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> result = new ArrayList<>();
		if(input == null || input.length<=0||input.length <k)
			return result;
		for (int i = k/2-1; i >=0; i--) {
			heapAdjust(input,i,k-1);
		}
		for (int i = k; i < input.length; i++) {
			if(input[i]<input[0]){
				swap(input, i, 0);
				heapAdjust(input,0,k-1);
			}
		}
		for (int i = 0; i < k; i++) {
			result.add(input[i]);
		}
		return result;
	}
	public static void heapAdjust(int[] a,int s, int m){
		int temp = a[s];
		for (int i = 2*s+1; i <=m; i=2*i+1) {
			if(i<m&&a[i]<a[i+1])
				++i;
			if(temp>=a[i])
				break;
			a[s] = a[i];
			s = i;
		}
		a[s] = temp;
	}
	public static void swap(int[] ch, int i, int j){
		int temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}
}
