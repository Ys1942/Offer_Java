
/**
 * ��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)
 * ���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, 
 * ���û���򷵻� -1����Ҫ���ִ�Сд��
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