package oopsday5;

import another.AppConstants;    //AppConstants is in another package so it access it here we need to import it here from another package.

public class TestAppConstant {

	public static void main(String[] args) {
		
		double salary = 40000;
		double tax = salary * AppConstants.TAX_RATE;
		double surcharge = salary * AppConstants.SUR_CHARGE;
		

	}

}
