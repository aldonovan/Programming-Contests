import java.util.*;
public class Rotation {
  public static void main(String [] args){
    Scanner input=new Scanner(System.in);
    System.out.println("This program will rotate one point (x1,y1) around another point (x2,y2)");
    System.out.print("Enter the x-coordinate of the first point: ");
    double x1=input.nextDouble();
    System.out.print("Enter the y-coordinate of the first point: ");
    double y1=input.nextDouble();
    System.out.print("Enter the x-coordinate of the second point: ");
    double x2=input.nextDouble();
    System.out.print("Enter the y-coordinate of the second point: ");
    double y2=input.nextDouble();
    System.out.print("Enter the number of degrees to rotate the first point around the second point (counterclockwise): ");
    double degrees=input.nextDouble();
    input.close();

    //Rotate a point around another point a certain number of degrees clockwise
    //Initially the point is at (x1, y1), other point is at (x2,y2)
    //Rotating by x radians is same as multiply by e^ix
    //e^ix is cos(x)+isin(x)
    //(x+iy)*(cosx+isin(x))=(xcos(x)-ysin(x))+(ycos(x)+xsin(x))i

    double radians=degrees*Math.PI/180;
    double xDiff=x1-x2;
    double yDiff=y1-y2;
    double xRotate=xDiff*Math.cos(radians)-yDiff*Math.sin(radians);
    double yRotate=yDiff*Math.cos(radians)+xDiff*Math.sin(radians);
    double finalX=xRotate+x2;
    double finalY=yRotate+y2;

    System.out.println("Rotating the point ("+x1+", "+y1+") around the point ("+x2+", "+y2+") by "+degrees+" degrees counterclockwise results in the point ("+(Math.round(finalX*1000)/1000.0)+", "+(Math.round(finalY*1000)/1000.0)+")");
  }
}
