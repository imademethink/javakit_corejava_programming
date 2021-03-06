package package01_MapInterfaceHashMap;

import java.security.SecureRandom;
import java.util.Random;

class AnyId{
	// random alphanumeric string generator - static method
	public static String getRandomAlphanumericAnyId(){
		Random objRandom 		= new SecureRandom();
		String strAlphabets 	= "abcdefghjkmnpqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ0123456789";
		String strRandomString 	= "";
		// generate 10 character alphanumeric key
		// consists of upper case characters, lower case characters, numerical characters, no special characters
		for (int i=0; i<10; i++){
          int nRandomIndex 		= (int)(objRandom.nextDouble() * strAlphabets.length());
          strRandomString 	   += strAlphabets.charAt(nRandomIndex);
	    }
		return strRandomString;
	}
}
