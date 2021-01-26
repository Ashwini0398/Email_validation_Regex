package practice;

import java.util.regex.*;

public class RegexEmailValidation {

	public static boolean EmailValidation(String email)
	{
		String regexemail = "^([a-zA-Z0-9]*[+._-]*[a-zA-Z0-9]+@[a-zA-Z]+.{3}[a-zA-z.]*[a-zA-z]{2})+$";
		Pattern pat =Pattern.compile(regexemail);//compile the pattern
		if(email == null)
		{
			return false;
		}
		
		Matcher m = pat.matcher(email);//enter the pattern to match
		//matches whether it is true or false
		return m.matches();

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String e1="abc-100@google.com";
			System.out.println(e1+" "+EmailValidation(e1));
			
			String e2="abc111@yahoo.com";
			System.out.println(e2+" "+EmailValidation(e2));
			
			String e3="abc.100@abc.com.au";
			System.out.println(e3+" "+EmailValidation(e3));
			
			String e4="abc@.com.my";
			System.out.println(e4+" "+EmailValidation(e4));
			
			String e5="abc123@gmail.c";
			System.out.println(e5+" "+EmailValidation(e5));
			
			String e6="abc()*@gmail.com";
			System.out.println(e6+" "+EmailValidation(e6));

	}

}
