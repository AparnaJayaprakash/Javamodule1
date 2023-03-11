package optionals;

import java.util.Optional;

//Optional is null testing. without using null keyword we have to test null. We test null so that we dont get NullPointerExceptions
public class TestOptional {

	public static void main(String[] args) {
		
		String str = null;
		String str2 = "hello";
	//	Optional<String> optional = Optional.of(str);            //passing str object to optional 
		//System.out.println(optional.get());                      //this will give NullPointerException it is because we have used of we use of only when we know str is not null.
		
		Optional<String> optional2 = Optional.ofNullable(str);    //when str2 is passed true condition will be executed but when str is passed else condition is executed and gives no value present exception
		if(optional2.isPresent()) {
			System.out.println("value is present: " + optional2.get()); 
		}
		else {
//			System.out.println("is null" + optional2.get());             //this will give no value present exception
			System.out.println("is null: " + optional2.orElse("str is not initialised"));        //use it when you are sure that str is not initialised
		}
	}

}
