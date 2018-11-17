package offer;
///for a string, replace its space with %20
public class Test4 {
	public static void main(String[] args) {
		String str = "We are happy";
		
		System.out.println(replace(str));
	}
	
	public static String replace(String str){
		String string = "";
		for (int i = 0; i < str.length(); i++) {
			if(Character.isSpace(str.charAt(i))){
				string+="%20";
			}
			else
				string+=str.charAt(i);
		}
		
		return string;
	}
}
