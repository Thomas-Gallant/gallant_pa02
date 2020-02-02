package gallant_p1;

import gallant_p1.Decrypter;
import gallant_p1.Encrypter;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Application {
	
	private static Scanner in = new Scanner(System.in);
	
	
	public String fourDigitCode;
	
	public static void main(String[] args) {
		
		Application app = new Application();
		Decrypter de = new Decrypter();
		app.readInteger();
		app.encryptAndPrintEncrypt();
		de.decrypt();
		app.decryptAndPrintDecrypt();
	}
	
	public void readInteger() {
		fourDigitCode = in.next();
		System.out.println(fourDigitCode);
	}
	
	public void encryptAndPrintEncrypt() {
		
		Encrypter en = new Encrypter();
		en.encrypt(fourDigitCode);
		
		System.out.println(fourDigitCode);
	}
	
	public void decryptAndPrintDecrypt() {
		System.out.println(fourDigitCode);
	}
}	
