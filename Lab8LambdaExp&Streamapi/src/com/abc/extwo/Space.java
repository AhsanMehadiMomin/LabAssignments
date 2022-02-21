package com.abc.extwo;

interface space {
	public StringBuffer s(String str);
}

public class Space {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		space obj = (str) -> {
			for (int i = 0; i < str.length(); i++) {
				sb.append(str.charAt(i) + " ");
			}
			return sb;
		};
		
		StringBuffer str2 = obj.s("Ahsan");
		System.out.println(str2);
	}

}
