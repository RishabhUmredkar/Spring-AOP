package MethodThrowAdvice;

public class validator {

	public void validate(int age)throws Exception{
		if(age < 18 ){
			throw new ArithmeticException("age not valid");
			
		}
		else{
			System.out.println("vote valid");
		}
	}
}
