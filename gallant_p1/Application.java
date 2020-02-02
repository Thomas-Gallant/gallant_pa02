package gallant_p1;

import gallant_p1.Decrypter;
import gallant_p1.Encrypter;

import java.util.Scanner;

public class Application {
	
	private static Scanner in = new Scanner(System.in);
	
	
	public String fourDigitCode;
	
	public static void main(String[] args) {
		
		Application app = new Application();
		app.readInteger();
		app.encryptAndPrintEncrypt();
		app.decryptAndPrintDecrypt();
	}
	
	// read in the 4 digit code to be encrypted
	public void readInteger() {
		System.out.println("What 4 Digit Code do you want to encrypt?");
		fourDigitCode = in.next();
	}
	
	// send the code to the encrypter class in order to encrypt
	// print out the encrypted code
	public void encryptAndPrintEncrypt() {
		
		Encrypter en = new Encrypter();
		fourDigitCode = en.encrypt(fourDigitCode);
		
		System.out.println("Here is the encrypted code!\n" + fourDigitCode);
	}
	
	// send the code to the decrypter class in order to decrypt
	// print out the decrypted code
	public void decryptAndPrintDecrypt() {
		Decrypter de = new Decrypter();
		fourDigitCode = de.decrypt(fourDigitCode);
		System.out.println("Here is the decrypted code!\n" + fourDigitCode);
	}
}	
