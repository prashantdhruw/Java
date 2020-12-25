
class NumberToWord {
	private int number;

	String[] units = { " ", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ",
			"Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ",
			"Nineteen " };

	String[] doublesMore = { "", "", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty",
			" Ninety" };

	public NumberToWord(int number) {
		this.number = number;
	}

	void NumToWord() {
		if (number < 20) {
			System.out.println(units[number]);
		} else if (number > 19 && number < 100) {
			System.out.println(doublesMore[number / 10] + " " + units[number % 10]);
		} else if (number < 1000 && number > 100) {
			if (number % 100 < 20) {
				System.out.println(units[number / 100] + " Hundred" + units[number % 100]);
			} else {
				System.out.println(
						units[number / 100] + "Hundred" + doublesMore[(number % 100) / 10] + " " + units[number % 10]);
			}
		} else if (number < 10000 && number > 999) {
			if (number % 100 < 20) {
				System.out.println(units[number / 1000] + "thousand " + units[(number / 100) % 10] + "Hundred "
						+ units[number % 100]);
			} else { 
				System.out.println(units[number / 1000] + "thousand " + units[(number / 100) % 10] + "Hundred"
						+ doublesMore[(number % 100) / 10] + " " + units[number % 10]);
			}
		}
	}
}

public class NumberToWordRunner {
	public static void main(String args[]) {
		NumberToWord num = new NumberToWord(1233);
		num.NumToWord();
	}
}
