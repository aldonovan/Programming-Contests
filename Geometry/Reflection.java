import java.util.*;
public class Reflection {
  public static void main (String [] args){
    //Given point and line, reflect the point across the lines
    Scanner input=new Scanner(System.in);

    System.out.println("This program will reflect a point across a line Ax+By=C");
    System.out.print("Enter the x coordinate of the point: ");
    double x=input.nextDouble();
    System.out.print("Enter the y coordinate of the point: ");
    double y=input.nextDouble();
    System.out.print("For line Ax+By=C, enter A: ");
    double a=input.nextDouble();
    System.out.print("For line Ax+By=C, enter B: ");
    double b=input.nextDouble();
    System.out.print("For line Ax+By=C, enter C: ");
    double c=input.nextDouble();
    input.close();

    //Perpendicular line to Ax+By=C is -Bx+Ay=D
    double d=-1*b*x+a*y;

    //Find intersection between lines Ax+By=C and -Bx+Ay=D
    double determinant=a*a+b*b;
    double intersectionX=(c*a-b*d)/determinant;
    double intersectionY=(a*d+c*b)/determinant;

    //Y' is Y+(Y-X)
    double reflectionX=intersectionX*2-x;
    double reflectionY=intersectionY*2-y;
    System.out.println("The reflected point is at ( "+reflectionX+", "+reflectionY+")");

  }
}
