import java.util.Scanner;

/**
 * Made to offer easy use of Scanner even if nextLine is used after nextInt.
 * Should completely replace any use of any instance of java.util.Scanner
 * @author User
 *
 */
public class UIScannerGuard {

	private Scanner scanner;
	private boolean hasReadInt;
	
	public UIScannerGuard() {
		scanner = new Scanner(System.in);
		hasReadInt = false;
	}
	
	public boolean isHasReadInt() {
		return hasReadInt;
	}
	
	public Scanner getScanner() {
		return scanner;
	}
	
	
	/**
	 * Show message and prompt user for string
	 * @param message
	 * @return
	 */
	public String readLine(String message) {
		System.out.println(message);
		
		if(hasReadInt) {
			scanner.nextLine();
		}
		
		hasReadInt = false;//reading string here
		return scanner.nextLine();
	}
	
	/**
	 * Show message and prompt user for an int
	 * @param message
	 * @return int
	 */
	public int readInt(String message) {
		System.out.println(message);
		hasReadInt = true;
		return scanner.nextInt();
	}
	/**
	 * Show message and prompt user for a long
	 * @param message
	 * @return long
	 */
	public long readLong(String message) {
		System.out.println(message);
		hasReadInt = true;
		return scanner.nextLong();
	}
	/**
	 * Show message and prompt user for a float
	 * @param message
	 * @return
	 */
	public float readFloat(String message) {
		System.out.println(message);
		return scanner.nextFloat();
	}
	/**
	 * Show message and prompt user for an double
	 * @param message
	 * @return
	 */
	public double readDouble(String message) {
		System.out.println(message);
		return scanner.nextDouble();
	}
	/**
	 * Show message and prompt user for a boolean ('true' or 'false')
	 * @param message
	 * @return
	 */
	public boolean readBoolean(String message) {
		System.out.println(message);
		return scanner.nextBoolean();
	}
	
}
