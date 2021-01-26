package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmailValidation {

	public static void main(String[] args) {
		
		
		Pattern pat =Pattern.compile("^[a-zA-Z0-9]*[+._-]*[a-zA-Z0-9]+@[a-zA-Z]+.{3}[a-zA-z.]+$");//compile the pattern
                Matcher m = pat.matcher("abc@bridzelabz.com");//enter the pattern to match
                boolean result=m.matches();//matches whether it is true or false
                System.out.println(result);//display the result
	}

}
