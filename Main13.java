import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * */
public class Main13 {
	/**使用辅助空间*/
	public void reOrderArray(int [] array) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
			if(!isEven(array[i]))
				list1.add(array[i]);
			else
				list2.add(array[i]);
		}
        for (int i = 0; i < list1.size(); i++) 
			array[i] = list1.get(i);
        for (int i = 0; i < list2.size(); i++) 
			array[i+list1.size()] = list2.get(i);
    }
	public void reOrderArray1(int [] array) {
		if(array == null || array.length == 0)
			return;
		int i = 0,j;
		while(i<array.length){
			while(i<array.length && !isEven(array[i]))
				i++;
			j = i+1;
			while(j<array.length && isEven(array[j]))
				j++;
			if(j<array.length){
				int temp = array[j];
				for (int k = j-1; k >=i; k--) {
					array[k+1] = array[k];
				}
				array[i++] = temp;
			}
			else
				break;
		}
	}
	public static boolean isEven(int n){
		if((n & 0x1) ==0)
			return true;
		return false;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		System.out.println(Arrays.toString(array));
		new Main13().reOrderArray(array);
		System.out.println(Arrays.toString(array));
	}
}
