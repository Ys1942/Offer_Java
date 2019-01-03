/**在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
判断数组中是否含有该整数。*/
public class Main1 {
	public boolean Find(int target, int [][] array) {
		int rIndex = 0;
		int cIndex = array[0].length-1;
		for (int i = rIndex; i <array.length; i++) {
			for (int j = cIndex; j >=0;j--) {
				if(array[i][j]==target)
					return true;
				else if(array[i][j] > target){
					
					continue;
				}
				else if(array[i][j] < target){
					cIndex = j;
					break;
				}
			}
			
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] array=new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		System.out.println(new Main1().Find(9,array));
		System.out.println(new Main1().Find(13,array));
	}
}
/*考察 查找，注意数组的顺序规律*/
/*二维数组取行数：array.length,取列数:array[0].length*/
