import java.util.ArrayList;

public class PasswordsAndUnitTest {

	static ArrayList<String> passwords = new ArrayList<String>();

	public static boolean addPassword(String password) {

		if (password.contains(" ")) {
			return false;

		}

		if (password.length() >= 7 && password.length() <= 12 && password.length() != 0 && password.matches(".*[0-9].*")
				&& (!password.matches(".*6.*")) && capitalVowels(password) && !passwords.contains(password)
				|| password.equalsIgnoreCase("admin") && !passwords.contains(password)
				|| password.equalsIgnoreCase("mod") && !passwords.contains(password)) {

			return storePasswordAndReturnTrue(password);

		} else {
			return false;

		}

	}

	public static boolean capitalVowels(String password) {
		int count = 0;

		for (char v : password.toCharArray()) {
			if(v == 'A' || v == 'E' || v == 'I' || v == 'O' || v == 'U' || v == 'Y') {
				count++;
				if(count == 2) {
					return true;
				}
			}
		}
		
		return false;

	}

	private static boolean storePasswordAndReturnTrue(String password) {
		passwords.add(password);
		System.out.println(passwords);
		return true;

	}

}
