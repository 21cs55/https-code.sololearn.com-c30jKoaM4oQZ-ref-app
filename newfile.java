// Java Program for taking user
// input using BufferedReader Class
import java.io.*;

class GFG

{

	// Main Method
	public static void main(String [] args) throws IOException {
		// Creating BufferedReader Object
		// InputStreamReader converts bytes to
		// stream of character
		BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

		// Asking for input from user
		System.out.println("Enter String : ");
		System.out.println("Enter Integer : ");

		// String reading internally
		String str = bfn.readLine();

		// Integer reading internally
		int it = Integer.parseInt(bfn.readLine());

		// Printing String
		System.out.println("Entered String : " + str);

		// Printing Integer
		System.out.println("Entered Integer : " + it);

	}

}