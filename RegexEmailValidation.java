package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pat =Pattern.compile("^[a-z]+$");//compile the pattern 
		Matcher m = pat.matcher("abc@bridzelabz.com");//enter the pattern to match
		boolean result=m.matches();//matches whether it is true or false
		System.out.println(result);//display the result
	}

}
