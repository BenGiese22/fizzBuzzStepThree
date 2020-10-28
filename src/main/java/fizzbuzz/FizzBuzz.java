package fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(fizzBuzzStepThree());
	}

	// Solution to Real Fizz Buzz Step Three
	// Concatenates and returns a string to enable easier testing against the method. 
	public static String fizzBuzzStepThree() {
		String fizzBuzzStr = "";

		/*
		* NOTE TO READER: The simple solution is 5 integers, though these could be held in a simple array of length 5 and referenced that way. 
		* Though this way might be cleaner, it would reduce readability as it abstracts what we're doing here. Meaning I'd have to write a 
		* comment about what each place in the array represents. Benefit of this is if we pass it into a (helper) function as mentioned below
		* is we wouldn't have to list 5+ parameters and it's easily expanded upon. TLDR...neither are pretty.
		*/
		int fizzCount = 0;
		int buzzCount = 0;
		int fizzBuzzCount = 0;
		int luckyCount = 0;
		int intCount = 0;

		for (int i = 1; i <= 20; i++) {

			// If the number contains a "3" then the output should be "lucky", overwriting any other behavior
			if (String.valueOf(i).contains("3")) {
				fizzBuzzStr += "lucky ";
				luckyCount += 1;
			} else {
				// Normal Behavior
				if ((i % 15) == 0) { // If it is a multiple of 15, then fizzbuzz. Needs to be before 3 and 5
					fizzBuzzStr += "fizzbuzz ";
					fizzBuzzCount += 1;
				} else if ((i % 3) == 0) { // If it is a multiple of 3, then fizz
					fizzBuzzStr += "fizz ";
					fizzCount += 1;
				} else if ((i % 5) == 0) { // If it is a multiple of 5, then buzz
					fizzBuzzStr += "buzz ";
					buzzCount += 1;
				} else {
					fizzBuzzStr += i + " ";
					intCount += 1;
				}
			}
		}

		/*
		* NOTE TO READER: Could encapsulate this into a simple private helper method. Though with the simplicity of this task it would only lengthen
		* and move a section of the code. I also decided to use "String.format" as it prevents the consistent pluses ("+")
		*/
		fizzBuzzStr += "\n"; // add new line to seperate fizzbuzz line and its report
		fizzBuzzStr += String.format("fizz: %d\n", fizzCount);
		fizzBuzzStr += String.format("buzz: %d\n", buzzCount);
		fizzBuzzStr += String.format("fizzbuzz: %d\n", fizzBuzzCount);
		fizzBuzzStr += String.format("lucky: %d\n", luckyCount);
		fizzBuzzStr += String.format("integer: %d", intCount);

		return fizzBuzzStr;
	}

}
