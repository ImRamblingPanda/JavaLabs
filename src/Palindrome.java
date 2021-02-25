public class Palindrome {
 public static void main(String[] args) {
	//Массив слов для проверки
	 String[] words = {"java", "Palindrome","madam","racecar","apple","kayak","song","noon"};//Массив слов для проверки
 for (int i = 0; i < words.length; i++) {//Цикл проверки каждого слова
	 if (isPalindrome(words[i]) == true) {
		 System.out.println(words[i] + " - Является Палиндромом");// Если являетя 
	 }
	 else System.out.println(words[i] + " - Не является Палиндромом");// Если не является
}
 }
 //Функция проверки слов
public static boolean isPalindrome(String s) {
	String palindrome = ""; // Пустая строка для обратного слова
	for (int i = s.length() - 1; i >= 0; i--) { // Цикл для замены символов 
		palindrome = palindrome + s.charAt(i);
	}
	if (palindrome.equals(s)){ //Проверка на соответствие с исходным словом
		return true;
	}
	else return false;
	}
}
