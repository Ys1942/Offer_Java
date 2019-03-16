
/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)
 * 中找到第一个只出现一次的字符,并返回它的位置, 
 * 如果没有则返回 -1（需要区分大小写）
 * */
public class Main34 {
	public int FirstNotRepeatingChar(String str) {
		char[] c = str.toCharArray();
		int[] a = new int['z'+1];
		for (char d : c) {
			a[(int)d] ++;
		}
		for (int i = 0; i < c.length; i++) {
			if(a[(int)c[i]] == 1)
				return i;
		}
		return -1;
    }
}
