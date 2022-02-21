package com.abc.exthree;


public class Password {

	public static void main(String[] args) {

		String name = "AhsanMomin";
		String pass = "ahsan@123";
		Authentication p = ((username, password) -> {
			
			if (username.equals(name) && password.equals(pass))
				return true;
			else
				return false;
		});
		
		System.out.println(p.checkIdentity("AhsanMomin", "ahsan@123"));
	}
}
