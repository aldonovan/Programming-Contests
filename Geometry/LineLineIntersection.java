import java.util.*;
public class LineLineIntersection {
  public static void main(String [] args){
    //Finds intersection point of lines A1x+B1y=C1, A2x+B2y=C2


    Scanner input = new Scanner(System.in);
    System.out.print("Enter A1:");
    double a1=input.nextDouble();
    System.out.print("Enter B1:");
    double b1=input.nextDouble();
    System.out.print("Enter C1:");
    double c1=input.nextDouble();
    System.out.print("Enter A2:");
    double a2=input.nextDouble();
    System.out.print("Enter B2:");
    double b2=input.nextDouble();
    System.out.print("Enter C2:");
    double c2=input.nextDouble();
    input.close();

    double determinant = a1*b2-a2*b1;
    if(determinant==0 && (c1/a1==c2/a2)){
      System.out.println("The lines coincide and intersect at an infinite number of points");
    } else if(determinant==0) {
      System.out.println("The lines are parallel and don't intersect");
    } else {
      double xcoordinate = c1*b2-c2*b1;
      double ycoordinate = a1*c2-a2*c1;
      System.out.println("The lines intersect at "+"( "+xcoordinate+", "+ycoordinate+")");
    }
  }
}
