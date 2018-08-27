//Doesn't work yet, debug the equations of perpendicular bisectors
import java.util.*;
public class ThreePointCircleEquation {
  public static void main(String [] args){
      //Finds the equation of the circle containing three distinct (non-collinear) points
      Scanner input=new Scanner(System.in);
      System.out.print("Enter the x coordinate of the first point: ");
      double x1 = input.nextDouble();
      System.out.print("Enter the y coordinate of the first point: ");
      double y1 = input.nextDouble();
      System.out.print("Enter the x coordinate of the second point: ");
      double x2 = input.nextDouble();
      System.out.print("Enter the y coordinate of the second point: ");
      double y2 = input.nextDouble();
      System.out.print("Enter the x coordinate of the third point: ");
      double x3 = input.nextDouble();
      System.out.print("Enter the y coordinate of the third point: ");
      double y3 = input.nextDouble();

      //Finds equations of the lines of perpendicular bisectors
      //a1x+b1y=c1, a2x+b2y=c2

      double[] perpBisector1= findPerpendicularBisector(x1, y1, x2, y2);
      double[] perpBisector2= findPerpendicularBisector(x2, y2, x3, y3);
      double determinant = perpBisector1[0]*perpBisector2[1]-perpBisector1[1]*perpBisector2[0];
      if(determinant==0){
        System.out.println("Points are not distinct and non-collinear");
      } else {
        double xcoordinate = perpBisector1[2]*perpBisector2[1]-perpBisector2[2]*perpBisector1[1];
        double ycoordinate = perpBisector1[0]*perpBisector2[2]-perpBisector2[0]*perpBisector1[2];
        System.out.println("The center of the circle is at "+"( "+xcoordinate+", "+ycoordinate+")");
      }


  }
  public static double[] findPerpendicularBisector(double xOne, double yOne, double xTwo, double yTwo){
    //3 element-array containing a1, b1, c1 s.t. a1x+b1y=c1
    double[] lineInfo=new double[3];
    if(yTwo==yOne){
      lineInfo[0]=1;
      lineInfo[1]=0;
      lineInfo[2]=(xOne+xTwo)/2.0;
    } else if(xTwo==xOne){
      lineInfo[0]=0;
      lineInfo[1]=1;
      lineInfo[2]=(yOne+yTwo)/2.0;
    } else {
      double slope=(-1)/((yTwo-yOne)/(xTwo-xOne));
      //Point-slope form y-y1=m(x-x1)--> mx-y=(mx1-y1)
      lineInfo[0]=slope;
      lineInfo[1]=-1;
      lineInfo[2]=slope*((xOne+xTwo)/2.0)-((yOne+yTwo)/2.0);
    }
    return lineInfo;
  }
}
