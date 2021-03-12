import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class task_1{
	public static void main(String[] args) throws IOException {
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String a = reader.readLine();
//		String b = reader.readLine();
//		String c = reader.readLine();
//		double num_1 = Double.parseDouble(a);
//		double num_2 = Double.parseDouble(b);
//		double num_3 = Double.parseDouble(c);
		System.out.println(remainder(1,3));
		System.out.println(triArea(3,2));
		System.out.println(animals(2,3,5));
		System.out.println(profitableGame(0.2,50,9));
		System.out.println(operation(24,15,9));
		System.out.println(ctoa('m'));
		System.out.println(addUpTo(7));
		System.out.println(nextEdge(10,8));
		int[] A = {1,5,9};
		System.out.println(sumOfCubes(A));
		System.out.println(abcMath(5,2,1));
		
		
	}
public static int remainder(int num_1, int num_2) {
	return num_1%num_2;
}
public static int triArea(int c, int h) {
	return (c*h)/2;
}
public static int animals(int chickens, int cows, int pigs) {
	return chickens*2+cows*4+pigs*4;
}
public static boolean profitableGame(double prob, double prize, double pay) {
	if (prob*prize > pay) return true;
	else return false;
}
public static String operation(double num_1, double num_2, double num_3) {
	if (num_1+num_2==num_3) return "added";
	else if (num_1-num_2==num_3) return "subtracted";
	else if (num_1*num_2==num_3) return "multiplied";
	else if (num_1/num_2==num_3) return "divided";
	else return "none";
}
public static int ctoa(char letter) {
	return (int) letter;
}
public static int addUpTo(int n) {
	int sum = 0;
	for (int i = 0; i <= n; i++) {
		sum += i;
	}
	return sum;
}
public static int nextEdge(int a, int b) {
	return a+b-1;
}
public static int sumOfCubes(int[] A) {
	int sum = 0;
			for (int i = 0; i < A.length; i++) {
				sum +=  Math.pow(A[i],3);
			}
	return sum;
}
public static boolean abcMath(int a,int b,int c) {
	for (int i = 0; i <= b; i++) a += a;
	if (a%c == 0) return true;
	else return false;
}
}