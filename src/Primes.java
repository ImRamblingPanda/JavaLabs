public class Primes{
	public static void main(String[] args) {
		for (int num = 2; num <= 100; num++) { //Генерация цифр и их проверка
			if (isPrime(num) == true)//Вывод простых чисел 
				System.out.println(num);
		}

	}
	public static boolean isPrime(int num) { //Метод проверки 
		for (int i=2; i < num; i++) //Цикл проверки числа
		{
				if (num % i == 0) { //Условие простых чисел
					return false;
				}
		}
		return true;
	}
}