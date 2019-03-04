/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Main23 {
	public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0)
        	return false;
        if(sequence.length == 1)
        	return true;
        return judge(sequence, 0, sequence.length-1);
    }
	public boolean judge(int[] a, int start, int root){
		if(start>=root)
			return true;
		int i = start;
		while(i < root-1 && a[i] < a[root])
			i++;
		for (int j = i; j < root-1; j++) {
			if(a[j] < a[root])
				return false;
		}
		return judge(a, start, i-1) && judge(a, i, root-1);
	}
}
