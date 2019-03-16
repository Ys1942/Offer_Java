/**
 * ×óĞı×ª×Ö·û´®
 * */
public class Main44 {
	public String LeftRotateString(String str,int n) {
		if(n>=str.length())
			return str;
        String result = "";
        for (int i = n; i < str.length(); i++) {
			result+=str.charAt(i);
		}
        for (int i = 0; i < n; i++) {
			result+=str.charAt(i);
		}
        return result;
    }
}
