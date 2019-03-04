/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Main9 {
	public int JumpFloorII(int target) {
		if(target<3)
			return target;
		int num = 0;
		for (int i = 1; i < target; i++) {
			num += JumpFloorII(i);
		}
		return num+1;
    }
	public static void main(String[] args) {
		System.out.println(new Main9().JumpFloorII(3));
	}
}
