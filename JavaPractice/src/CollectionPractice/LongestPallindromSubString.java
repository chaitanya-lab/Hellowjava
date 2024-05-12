package CollectionPractice;

public class LongestPallindromSubString {

	public static void main(String args[]) {

		String str = "abbaab";
		String LPS = "";
		for (int i = 1; i < str.length(); i++) {

			int low = i;
			int high = i;
			while (str.charAt(low) == str.charAt(high)) {
				low--;
				high++;
				if (low == -1 || high == str.length())
					break;
			}
			String pallidrom = str.substring(low + 1, high);
			if (pallidrom.length() > LPS.length()) {
				LPS = pallidrom;
			}

			low = i - 1;
			high = i;

			while (str.charAt(low) == str.charAt(high)) {
				low--;
				high++;

				if (low == -1 || high == str.length())
					break;
			}
			pallidrom = str.substring(low + 1, high);
			if (pallidrom.length() > LPS.length()) {
				LPS = pallidrom;
			}
		}
		System.out.println("The longest Sub String - " + LPS);
	}

}
