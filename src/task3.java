import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class task3{
	public static void main (String[] args) {
		String[][] cityMass = {{"Nice","942208"},{"Abu Dhabi","1482816"},{"Naples","2186853"},{"Vatican","572"}};
		millionsRounding(cityMass);
		for(int i = 0; i < cityMass.length; i++) {
			for(int j = 0; j < cityMass[i].length; j++) {
				System.out.print(cityMass[i][j] + " ");
			}
			System.out.println();
		}
		double[] sidesMass = new double[2];
		sidesMass = otherSides(1);
		for(int i = 0; i < sidesMass.length; i++) {
			System.out.print(sidesMass[i] + " ");
		}
		System.out.println();
		System.out.println(rps("paper","rock"));
		int [] mass = {2, 3, 2, 3};
		System.out.println(warOfNumbers(mass));
		System.out.println(reverseCase("Happy Birthday"));
		System.out.println(inator("fffa"));
		System.out.println(doesBrickFit(1, 1, 1, 1, 1));
		System.out.println(totalDistance(36.1, 8.6, 3, true));
		int[] array = {6, 5};
		System.out.println(mean(array));
		System.out.println(parityAnalysis(243));
	}
	public static String[][] millionsRounding(String[][] cityMass) {
		double roundedPopulation = 0;
		for (int i = 0; i < cityMass.length; i++) {
			int population = Integer.parseInt(cityMass[i][1]);
			roundedPopulation = Math.round(population/ Math.pow(10, 6)) * Math.pow(10, 6);
			cityMass[i][1] = String.valueOf(roundedPopulation);
		}
		return cityMass;
	}
	public static double[] otherSides(double a) {
		double[] sides = new double[2];
		sides[0] = Math.ceil(a * 2 * 100) / 100;
		sides[1] = Math.ceil(a * Math.sqrt(3) * 100) / 100;
		return sides;
	}
	public static String rps(String firstPlayer, String secondPlayer) {
		if ((firstPlayer == "rock")&&(secondPlayer == "scissors")
				||(firstPlayer == "paper")&&(secondPlayer == "rock")
				||(firstPlayer == "scissors")&&(secondPlayer == "paper")) {
			return "First player wins";
			
		}
		else if (firstPlayer == secondPlayer) {
			return "TIE";
		}
		else return "Second player wins";
	}
	public static int warOfNumbers (int[] mass) {
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i]%2 == 0) {
				sumEven += mass[i];
			}
			else sumOdd += mass[i];
		}
		if (sumOdd > sumEven) {
			return sumOdd - sumEven;
		}
		else return sumEven - sumOdd;
	}
	public static String reverseCase(String s) {
		char[] stringMass = s.toCharArray();
		for (int i = 0; i < stringMass.length; i++) {
			if (Character.isLowerCase(stringMass[i])) {
				stringMass[i] = Character.toUpperCase(stringMass[i]);
			}
			else stringMass[i] = Character.toLowerCase(stringMass[i]);
		}
		String newS = new String(stringMass);
		return newS;
//		for (int i = 0; i < s.length(); i++) {
//			if (Character.isLowerCase(s.charAt(i))) {
//				s = s.replace(s.charAt(i),Character.toUpperCase(s.charAt(i)));
//			}
//			else s = s.replace(s.charAt(i), Character.toLowerCase(s.charAt(i)));
//		}
//		return s;
	}
	public static String inator(String s) {
//		Pattern p = Pattern.compile("[aqeyuio]$");
//		Matcher m = p.matcher(s);
//		boolean found = m.matches();
		
		if (s.substring(s.length()-1).matches("[aeiouy]")) {
			return s + "-inator " + s.length() + "000";
		}
		else {
			return s + "inator " + s.length() + "000";
			}
	}
	public static boolean doesBrickFit(int a, int b, int c, int w, int h) {
		return (a <= h && (b <= w || c <= w));
	} 
	public static double totalDistance(double fuelTotal, double fuelConsumption, int passenger, boolean airConditioner) {
		if (airConditioner) {
			fuelConsumption += fuelConsumption*0.1;
		}
		return fuelTotal/(fuelConsumption + fuelConsumption * 0.05 * passenger) * 100; 	
		}
	public static double mean(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return (double) sum / array.length;
	}
	public static boolean parityAnalysis(int num) {
		int sum = 0;
		int digit = num;
		while (digit != 0) {
			sum += (digit % 10);
			digit /= 10;
		}
		if ((sum % 2 == 0) && (num % 2 == 0)|| (sum % 2 != 0) && (num % 2 != 0)) {
			return true;
		}
		else return false;
	}
	}
