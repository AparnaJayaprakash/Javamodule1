package source.use.mod;

import source.mod.HelloWorld;

public class UseHelloWorld {
	
	public static void main(String[] args) {
		
		
		var x = "aparna";                  //type inference
		var y = 23.75;
		var z = 'c';
		
		//var a; a = 20;      //not possible
		//x = 20;             //one time written cannot be changed
		System.out.println(x.length());
		
		try {
			HelloWorld world = new HelloWorld();
			world.message();
		
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
	
	

}
