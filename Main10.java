/**
 *我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 *请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *本质任是斐波那契数列
 * */
public class Main10 {
	public int RectCover(int target) {
		if(target<3)
			return target;
		int f1 = 1;
        int f2 = 2;
		int fn = 0;
        for(int i =3;i<=target;i++){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
}
