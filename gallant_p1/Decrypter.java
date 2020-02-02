package gallant_p1;

// decrypt the code and return the 4 digit code
// will have to convert the string into characters and characters into integers
// integers will be decrypted
// integers will then be converted back to characters and characters back to string, and the string will then be reordered 
public class Decrypter {
	
	public String decrypt(String fourDigitCode) {
		
		for(int i=0; i<4; i++) {
			char charHolder = fourDigitCode.charAt(i);
			int intHolder = Character.getNumericValue(charHolder);
			intHolder = (intHolder + 3) % 10;
			charHolder = (char)(intHolder + '0');
			
			if (i==0) {
				fourDigitCode = charHolder + fourDigitCode.substring(1, 4);
			}
			
			if(i==1) {
				fourDigitCode = fourDigitCode.substring(0, 1) + charHolder + fourDigitCode.substring(2, 4); 
			}
			
			if(i==2) {
				fourDigitCode = fourDigitCode.substring(0, 2) + charHolder + fourDigitCode.substring(3, 4);
			}
			
			if(i==3) {
				fourDigitCode = fourDigitCode.substring(0, 3) + charHolder;
			}
		}
		
		fourDigitCode = fourDigitCode.substring(2, 3) + fourDigitCode.substring(3, 4) + fourDigitCode.substring(0, 1) + fourDigitCode.substring(1, 2);
	
	
	
	return fourDigitCode;
	}

}
