public class Point3d extends Point2d{
private double zCoord;
public Point3d(double x, double y, double z) {
	super(x, y);
	zCoord = z;
	}
public Point3d() {
	this (0,0,0);
	}
public double getZ() {
	return zCoord;
}
public void setZ(double val) {
	zCoord = val;
}
//@Override
//public boolean equals(Object obj) {
//	if(this == obj)
//	if(!(obj instanceof Point3d)) return false;
//	Point3d dot = (Point3d)obj;
//}
public boolean equals(Point3d secondPoint) {
    return super.getX() == secondPoint.getX() && super.getY() == secondPoint.getY() && zCoord == secondPoint.getZ();

}
public double distanceTo(Point3d secondPoint) {
	return Math.sqrt(Math.pow(this.getX() - secondPoint.getX(), 2) + Math.pow(this.getY() - secondPoint.getY(), 2) + Math.pow(zCoord - secondPoint.getZ(), 2));
}
}