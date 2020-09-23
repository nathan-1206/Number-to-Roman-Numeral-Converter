import textio.TextIO;

public class Roman {

	// Converts numbers from 1 to 3999

	public static void main(String[] args) {

		int numInput;
		String romanNum = "";

		int numThousands;
		int numHundreds;
		int numTens;
		int numOnes;

		System.out.println();
		System.out.println("Enter a number BETWEEN 1 and 3999 that you would like to convert to roman numerals: ");
		numInput = TextIO.getInt();

		numThousands = (numInput/1000) % 10;
		numHundreds = (numInput/100) % 10;
		numTens = (numInput/10) % 10;
		numOnes = numInput % 10;


		if (numInput < 1 || numInput > 3999) {
			System.out.println(numInput + " is outside the range for this converter. Try a number from 1 to 3999.");
		} else {

			if (numThousands == 1) {
				romanNum += "M";
			} else if (numThousands == 2) {
				romanNum += "MM";
			} else if (numThousands == 3) {
				romanNum += "MMM";
			}

			if (numHundreds == 1) {
				romanNum += "C";
			} else if (numHundreds == 2) {
				romanNum += "CC";
			} else if (numHundreds == 3) {
				romanNum += "CCC";
			} else if (numHundreds == 4) {
				romanNum += "CD";
			} else if (numHundreds == 5) {
				romanNum += "D";
			} else if (numHundreds == 6) {
				romanNum += "DC";
			} else if (numHundreds == 7) {
				romanNum += "DCC";
			} else if (numHundreds == 8) {
				romanNum += "DCCC";
			} else if (numHundreds == 9) {
				romanNum += "CM";
			}

			if (numTens == 1) {
				romanNum += "X";
			} else if (numTens == 2) {
				romanNum += "XX";
			} else if (numTens == 3) {
				romanNum += "XXX";
			} else if (numTens == 4) {
				romanNum += "XL";
			} else if (numTens == 5) {
				romanNum += "L";
			} else if (numTens == 6) {
				romanNum += "LX";
			} else if (numTens == 7) {
				romanNum += "LXX";
			} else if (numTens == 8) {
				romanNum += "LXXX";
			} else if (numTens == 9) {
				romanNum += "XC";
			}

			if (numOnes == 1) {
				romanNum += "I";
			} else if (numOnes == 2) {
				romanNum += "II";
			} else if (numOnes == 3) {
				romanNum += "III";
			} else if (numOnes == 4) {
				romanNum += "IV";
			} else if (numOnes == 5) {
				romanNum += "V";
			} else if (numOnes == 6) {
				romanNum += "VI";
			} else if (numOnes == 7) {
				romanNum += "VII";
			} else if (numOnes == 8) {
				romanNum += "VIII";
			} else if (numOnes == 9) {
				romanNum += "IX";
			}

			System.out.println(numInput + " converted into roman numerals is : " + romanNum);
		}

		System.out.println();
	}
}
