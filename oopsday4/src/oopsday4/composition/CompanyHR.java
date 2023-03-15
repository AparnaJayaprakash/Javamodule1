package oopsday4.composition;

public class CompanyHR {

	public static void main(String[] args) {
		
		Address resAd = new Address("31","Mannath","Worli","Mumbai",4000344);
		
		Address commAd = new Address("32","Antela","Bandra","Mumbai",400032);
		
		Employee emp1 = new Employee("John Doe","Male",24,101,"Research",40000,resAd, commAd);
		System.out.println(emp1);
		
		Employee emp2 = new Employee("Jane Doe","Female",23,102,"Accounting",35000, resAd, commAd);
		System.out.println(emp2);
		
		Employee emp3 = new Employee("Jason Doe","Male",28,103,"Sales",10000, resAd, commAd);
		System.out.println(emp3);
		
		Employee emp4 = new Employee("jones Doe","Male",23,104,"Research",40000, resAd, commAd);
		System.out.println(emp4);
		
		Employee emp5 = new Employee("John Doe","Male",24,101,"Research",40000, resAd, commAd);
		System.out.println(emp5);
		
		if(emp1.equals(emp5)) 
			System.out.println("The object are same ");
		else
			System.out.println("The object are not same");
		}
	}


