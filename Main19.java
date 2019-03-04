import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Main19 {
	public ArrayList<Integer> printMatrix(int [][] matrix) {
		if(matrix == null || matrix.length == 0)
			return null;
		ArrayList<Integer> list = new ArrayList<>();
	    int rowStart = 0;
	    int colStart = 0;
	    int rowEnd = matrix.length-1;
	    int colEnd = matrix[0].length-1;
	    while(rowStart<=rowEnd&&colStart<=colEnd){
	    	for (int i = colStart; i <=colEnd; i++) 
	    		list.add(matrix[rowStart][i]);
	    	for (int i = rowStart+1; i <=rowEnd; i++) 
	    		list.add(matrix[i][colEnd]);
//	    			list.add(matrix[i][sy]);
	    	if(rowStart != rowEnd)
	    		for (int i = colEnd-1; i>=colStart; i--)
	    			list.add(matrix[rowEnd][i]);
	    	if(colStart != colEnd)
	    		for (int i = rowEnd-1; i>rowStart; i--)
	    			list.add(matrix[i][colStart]);
	    	rowStart++;
	    	colStart++;
	    	rowEnd--;
	    	colEnd--;
	    }
	    return list;
    }
}
