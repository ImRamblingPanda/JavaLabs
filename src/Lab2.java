import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Lab2{
    public static void main(String[] args) {
        Point3d point1, point2, point3;
        point1 = input();
        point2 = input();
        point3 = input();
        
        if (point1.equals(point2) || point2.equals(point3) || point1.equals(point3)) {
            System.out.println("Есть равные друг другу точки");
            return;
        }
        else {
        double area = computeArea(point1, point2, point3);
        System.out.printf("Полученная площадь: %.2f\n", area);
        }
    }
    private static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
        double a = point1.distanceTo(point2);
        double b = point1.distanceTo(point3);
        double c = point2.distanceTo(point3);
        double perimeter = (a + b + c) / 2;
        return Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
    }
	private static Point3d input() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите координаты точки: ");
		System.out.println(" x : ");
		String x = null;
		try {
			x = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(" y : ");
		String y = null;
		try {
			y = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(" z : ");
		String z = null;
		try {
			z = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new Point3d(Double.parseDouble(x), Double.parseDouble(y), Double.parseDouble(z));
	}
}