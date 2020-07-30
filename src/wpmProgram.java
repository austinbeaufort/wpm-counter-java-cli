import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class wpmProgram {
	
	public static void main(String[] args) throws InterruptedException {
		printCountdown();
		printStringToType();
		
		double start = LocalTime.now().toNanoOfDay();
		String typedWords = getTypedWords();
		double end = LocalTime.now().toNanoOfDay();
		
		double secondsElapsed = getSecondsElapsed(start, end);
		
		int wpm = calculateWPM(secondsElapsed, typedWords);
		
		System.out.println("Your typing speed: " + wpm + " wpm!");
		
	}
	
	
	
	public static double getSecondsElapsed(double start, double end) {
		double elapsedTime = end - start;
		double seconds = elapsedTime / 1000000000.0;
		return seconds;
	}
	
	
	public static int calculateWPM(double seconds, String typedWords) {
		int numChars = typedWords.length();
		int wpm = (int) (((double) numChars / 5) / seconds * 60);
		return wpm;
	}
	
	
	public static String getTypedWords() {
		Scanner scan = new Scanner(System.in);
		String typedWords = scan.nextLine();
		scan.close();
		return typedWords;
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
