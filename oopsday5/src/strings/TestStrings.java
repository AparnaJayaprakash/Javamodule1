package strings;

public class TestStrings {

	public static void main(String[] args) {
		
		byte bytes[] = {65, 66, 67, 68, 69};
		
		String str = new String(bytes);
		System.out.println(str.length());
		System.out.println(str);
		
		str = "Welcome to UST Global";
		bytes = str.getBytes();
		for (byte b : bytes) {
			
			System.out.println(b);
		}
		
		char chars[] = {'U', 'S', 'T', ' ', 'G'};
		
		str = new String(chars);
		System.out.println(str);
		
		str.getChars(0, chars.length-1, chars, 0);
		for(char c : chars) {
			System.out.println(c);
		}
		
		String string = new String("She sells sea shells in sea shore ");
		int result = 0;
		for(int i=0; i<string.length();i++) {
			
			if(string.charAt(i) == 's') {
				result = result + 1;
			}
			else if (string.charAt(i) == 'S') {
				result = result +1;
			}
			}System.out.println(result);
			

		//String words[] = string.split("[.]");  // use this if want to split using fullstop.
		String words[] = string.split(" ");  // 
		System.out.println(words.length);
		
		for (String word: words) {
			System.out.println(word);
		}
		
		string = new String ("Cartoon");
		System.out.println(string.startsWith("Car"));
		System.out.println(string.endsWith("toon"));
		
		
		int apos = string.indexOf('a');
		int tpos = string.indexOf('t');
		
		String string2 = string.substring(apos, tpos+1);
		System.out.println(string2);          
		string2 = string.substring(tpos);    // this will with from that position till end
		System.out.println(string2);
		
		
		
		string = new String("madamdam");
		
		int dpos = string.lastIndexOf('d');
		System.out.println(dpos);
		string2 = string.substring(dpos,string.length());
		System.out.println(string2);
		
		
		String email = new String("Aparna.Jayaprakash@ust.com");
		
		int cpos = email.lastIndexOf('c');
		String email1 = email.substring(cpos, email.length());
		System.out.println(email1);
		
		
		String str1 = new String("Welcome");
		String str2 = new String("Welcome");
		
		boolean result1 = str1.equals(str2);
		System.out.println(result1);
		
		
		String str3 = new String("welcome");
		String str4 = new String("WeLCOME");
		
		boolean result2 = str3.equalsIgnoreCase(str4);
		System.out.println(result2);
		
		int val = str4.compareTo(str3);           // it gives the difference of askii value of first lower case and uppercase difference.
		System.out.println(val);
		
		string = "Diehard";
		System.out.println(string.toLowerCase());
		System.out.println(string.toUpperCase());
		System.out.println(string);    // gives the original assigned value because strings are immutable.
		
		
		// "16-11-477//6/A/3 Hyderabad 500036"
		
		
	   string = "16-11-477//6/A/3 Hyderabad 500036";
	   int count = 0;
	   int count1 = 0;
	   int count2 = 0;
	   int count3 = 0;
	   for(int i = 0; i<string.length();i++) {
		   if(Character.isDigit(string.charAt(i))) {
			   
			   count = count + 1;
			   
		   }
		   else if(Character.isAlphabetic(string.charAt(i))) {
			   
			   count1 = count1 + 1;
			   
		   }
		   else if(Character.isSpaceChar(string.charAt(i))) {
			   count2 = count2 + 1;
		   }
		   else if(Character.isDefined(string.charAt(i))){
			   count3 = count3 + 1;
		   }

	   }System.out.println(count);
	   System.out.println(count1);
	   System.out.println(count2);
	   System.out.println(count3);
	   
		
	
	
	
	
	
	
	}

	}


