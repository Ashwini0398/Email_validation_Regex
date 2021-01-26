package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmailValidation {

	public static void main(String[] args) {
		
		
		Pattern pat =Pattern.compile("^[a-zA-z]*@[a-zA-Z]+$");//compile the pattern
                Matcher m = pat.matcher("abc@bridzelabz");//enter the pattern to match
                boolean result=m.matches();//matches whether it is true or false
                System.out.println(result);//display the result
	}

}
