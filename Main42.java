/**
 * 输入一个递增排序的数组和一个数字S，
 * 在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 * */
import java.util.ArrayList;
public class Main42 {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		if(array == null || array.length<2)
			return new ArrayList<>();
        int low = 0;
        int high = array.length-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(low<high){
        	int tmp = array[low]+array[high];
        	if(tmp == sum){
        		list.add(array[low]);
        		list.add(array[high]);
        		break;
        	}
        	else if(tmp<sum) {
        		low++;
        	}
        	else
        		high--;
        }
        return list;
    }
}
