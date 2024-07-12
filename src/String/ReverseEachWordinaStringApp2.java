package String;

public class ReverseEachWordinaStringApp2 {
	public static void main(String[] args) {
		String str ="Debasish Mahunta";
		String []words = str.split(" ");
		String reverseString="";
		for(String w:words) {
			StringBuffer sb = new StringBuffer(w);
			sb.reverse();
			reverseString = reverseString+sb.toString()+" ";
		}
		System.out.println(reverseString);
	}

}
