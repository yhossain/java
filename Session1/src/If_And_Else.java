
public class If_And_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=300;
		int j=200;
		int a=200;
		
// operators in Java= < , >, =, <=, >=, !
		
	if (i<j) // condition
		System.out.println("i is less than j");
	else
		System.out.println("i is not less than j");
	
	if (i<a)
		System.out.println("i is less than a");
	else
		System.out.println("i is not less than a");
	
	// if you are comparing two variable you need to pit ==. example i ==a
	// if you are assigning a value to the variable you should use =, example i= 300.
	
	if (i==a)
		System.out.println("value of i and a are same");
	else
	System.out.println("value of i and a are not the same");
	
	//if (j>a)
	    //System.out.println("j is greater than a");
	
	
	if (j<a)
	{
   System.out.println("j is greater than a");
}
	
  else
{
	System.out.println("j is not greater than a");
}
	
	
	if (!(i==a)) // not equal example
	{
		System.out.println("value of i and a are not equal");
	}
	else
	{
		System.out.println("value of i and a are equal"+"value of i is"+i);
	}

	}
	
	}
	
	