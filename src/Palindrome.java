public class Palindrome {
 public static void main(String[] args) {
	 String[] words = {"java", "Palindrome","madam","racecar","apple","kayak","song","noon"}; 
 for (int i = 0; i < words.length; i++) {
	 if (isPalindrome(words[i]) == true) {
		 System.out.println(words[i] + " - Является Палиндромом");
	 }
	 else System.out.println(words[i] + " - Не является Палиндромом");
}
 }
public static boolean isPalindrome(String s) {
	String palindrome = "";
	for (int i = s.length() - 1; i >= 0; i--) {
		palindrome = palindrome + s.charAt(i);
	}
	if (palindrome.equals(s)){
		return true;
	}
	else return false;
	}
}
