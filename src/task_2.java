import java.io.IOException;

public class task_2{
	public static void main(String[] args) throws IOException {
		System.out.println(oppositeHouse(5, 46));
		System.out.println(nameShuffle("Rosie O'Donnell"));
		System.out.println(discount(1500, 50));
		int[] mass = {44, 32, 86, 19};
		System.out.println(differeceMinMax(mass));
		System.out.println(equal(3, 4, 3));
		System.out.println(reverse("Edabit is really helpful!"));
		System.out.println(programmers(147, 33, 526));
		System.out.println(getXO("ooXxm"));
		System.out.println(sameAscii("AA", "B@"));
		System.out.println(boomb("Hey, did you think there is a BOMB?"));
		System.out.println();
	}
	public static int oppositeHouse(int houseNum, int n) {
		return 2*n-(houseNum-1);
	}
	public static String nameShuffle(String name) {
		String reverseName = "";
		int shufflePoint = name.indexOf(" ");
		for (int i = shufflePoint+1; i < name.length(); i++) {
			reverseName += name.charAt(i);
		}
		reverseName += name.charAt(shufflePoint);
		for (int i = 0; i < shufflePoint; i++) {
			reverseName += name.charAt(i);
		}
		return reverseName;
	}
	public static double discount(int price, int discount) {
		return price-price*0.01*discount;
	}
	public static int differeceMinMax(int[] mass) {
		for (int step = mass.length / 2; step > 0; step /= 2) {
		    for (int i = step; i < mass.length; i++) {
		        for (int j = i - step; j >= 0 && mass[j] > mass[j + step] ; j -= step) {
		            int x = mass[j];
		            mass[j] = mass[j + step];
		            mass[j + step] = x;
		        }
		    }
		}
		return mass[mass.length-1]-mass[0];		
	}
	public static int equal(int a, int b, int c) {
		return 0;
	}
	public static String reverse (String string) {
	    String reverseString = "";
	    for (int i = string.length() - 1; i >= 0; i--) { 
	    	reverseString = reverseString + string.charAt(i);
	    }
	    return reverseString;
	}
	public static int programmers(int fPay, int sPay, int tPay) {
		return 0;
	}
	public static boolean getXO(String s) {
		int xCount = 0;
		int oCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == 'x')||(s.charAt(i) == 'X')) {
				xCount =+ 1;
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == 'o')||(s.charAt(i) == 'O')) {
				oCount =+ 1;
			}
		}
		if (xCount == oCount) return true;
		else return false;
	}
	public static boolean sameAscii( String first, String second) {
		int firstAscii = 0;
		int secondAscii = 0;
		for (int i = 0; i < first.length(); i++) {
			firstAscii += (int) first.charAt(i);
		}
		for (int i = 0; i < second.length(); i++) {
			secondAscii += (int) second.charAt(i);
		}
		if (firstAscii == secondAscii) {
			return true;
		}
		else return false;
		}
	public static String boomb(String s) {
		s = s.toLowerCase();
		if (s.indexOf("boomb") == -1) {
			return "DUCK!";
		}
		else return "Relax, there's no bomb.";
	}
	}