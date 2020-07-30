import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class wpmProgram {
	
	public static void main(String[] args) throws InterruptedException {
		printCountdown();
		printStringToType();
		
		Scanner scan = new Scanner(System.in);
		String typedWords = scan.nextLine();
		
		System.out.println(typedWords);
		
		scan.close();
	}
	
	
	
	

	
	public static void printCountdown() throws InterruptedException {
		System.out.println("3");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);
	}
	
	
	public static void printStringToType() {
		String[] words = { 
				"envelope", "cantelope", "the", "hello", "microphone",
				"elephant", "biscuit", "hammer", "went", "cap" 
		};
		
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(words[random.nextInt(9)] + " ");
		}
		System.out.println();
	}
}
