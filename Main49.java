/**
 * 字符串变成整数
 * */
public class Main49 {
	public int StrToInt(String str) {
        if(str.equals("")||str.length()==0)
        	return 0;
        char[] a = str.toCharArray();
        int symble = 0;
        if(a[0] == '-')
        	symble = 1;
        int sum = 0;
        for (int i = symble; i < a.length; i++) {
			if(a[i] == '+')
				continue;
			if(a[i]<48 || a[i]>57)
				return 0;
			sum = sum*10+a[i]-48;
		}
        return symble == 0? sum:sum*(-1);
    }
}