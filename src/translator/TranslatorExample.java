package translator;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import com.darkprograms.speech.translator.GoogleTranslate;

public class TranslatorExample {
	
	public static void main(String[] args) {
		
		//Read this ma bro :)
		//When you go on google translate website and you translate from English to Igbo for example
		//you can see the url is :
		// https://translate.google.com/#en/ig/How%20are%20you
		//so the code for IGBO is "ig"
		//see my examples below , i will make tutorial on youtube don't worry
		
		try {
			//English to IGBO
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ISO Code of the following language you want to convert??");
			System.out.println("Greek -- el, Hausa -- ha ,Yoruba -- yo, Spanish -- es, Punjabi -- pa, Hindi -- hi");
			String targetlang = sc.nextLine().toLowerCase();
			System.out.println("Enter the text: ");
			String text = sc.nextLine().toLowerCase();
			System.out.println(GoogleTranslate.translate(targetlang,text));
			
			//English to GREEK
			//System.out.println(GoogleTranslate.translate("el", "how are you"));
			
			//English to HAUSA
			//System.out.println(GoogleTranslate.translate("ha", "how are you"));
			
			//English to Yoruba
			//System.out.println(GoogleTranslate.translate("yo", "how are you"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
