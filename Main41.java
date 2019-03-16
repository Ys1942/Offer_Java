/**
 * 输出所有和为S的连续正数序列。
 * 序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 * */
import java.util.ArrayList;
public class Main41 {
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	     if(sum<3)
	    	 return new ArrayList<>();
	     int low = 1;
	     int high = 2;
	     ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	     while(low<high && high<sum){
	    	 int tmp = (low+high)*(high-low+1)/2;
	    	 if(tmp == sum){
	    		 ArrayList<Integer> list = new ArrayList<>();
	    		 for (int i = low; i <= high; i++) {
					list.add(i);
				}
	    		 result.add(list);
	    		 high++;
	    	 }
	    	 else if(tmp < sum)
	    		 high++;
	    	 else
	    		 low++;
	     }
	     return result;
    }
}
