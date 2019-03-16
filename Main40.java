/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。
 * 请写程序找出这两个只出现一次的数字。
 * */
public class Main40 {
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
       if(array == null || array.length == 0)
    	   return;
       int tmp = 0;
       for (int i = 0; i < array.length; i++) {
    	   tmp ^= array[i];
       }
       int index = firstIndexOf1(tmp);
       for (int i = 0; i < array.length; i++) {
    	   if(isBit(array[i], index))
    		   num1[0]^= array[i];
    	   else
    		   num2[0]^= array[i];
       }
    }
	public int firstIndexOf1(int temp){
		int index = 0;
		while(((temp & 1)==0) && index < 32){
			temp = temp >>1;
		index++;
		}
		return index;
	}
	public boolean isBit(int num,int index){
		num = num >> index;
		return (num & 1) == 1;
	}
}
