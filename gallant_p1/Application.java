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
		app.readInteger();
		app.encryptAndPrintEncrypt();
		app.decryptAndPrintDecrypt();
	}
	
	public void readInteger() {
		fourDigitCode = in.next();
		System.out.println(fourDigitCode);
	}
	
	public void encryptAndPrintEncrypt() {
		
		Encrypter en = new Encrypter();
		fourDigitCode = en.encrypt(fourDigitCode);
		
		System.out.println(fourDigitCode);
	}
	
	public void decryptAndPrintDecrypt() {
		Decrypter de = new Decrypter();
		fourDigitCode = de.decrypt(fourDigitCode);
		System.out.println(fourDigitCode);
	}
}	
