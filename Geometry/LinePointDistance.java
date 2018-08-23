//Try to figure out a method of finding this with dot product
//Pick one point on the original line, connect it to the point
//Useful method of finding angle between lines:

//How to prove law of cosines: rewrite side lengths of inner right triangle
//in terms of cosines of other angles. Then use Pythagorean theorem and
//sin^2 + cos^2 = 1 to prove the theorem

//Dot product=x1y1+x2y2 by ABcos(theta) in conjunction with law of cosines
//The dot product is the product of one vector's projection on the other with
//the other's length; dividing the dot product by length yields the projection
//Equals 0 when two vectors are perpendicular, or 1 has length 0

//Cross product = AB sin theta * unit normal vector; direction of right hand rule
//Magnitude is the area of the parallelogram formed by A and B
//Not commutative
//a cross b = - b cross a, cross products are distributive
//Equals 0 when vectors are parallel, or 1 has length 0
//Because cross products are distributive, they can be broken into vectors
//(u1 i + v1 j + w1 k) cross (u2 i + v2 j + w2 k)
// u1u2 (i cross i) + u1v2 (i cross j) + u1w2 (i cross k) + u2v1 (i cross j)
//+ v1v2 (j cross j) + v1w2 (j cross k) + w1u2 (k cross i) + w1v2 (k cross j)
//+ w1w2 (k cross k)
//Since i cross i and similar are 0, left with
//
//Lesson: matrices are because of distributive property, superposition

//Use this for line-point distance
//Length: A cross B /|B|
//Given a point, create vector A from origin to the point
// x= 2a+ x1, y=1a + y1 , z=1a + z1
// x-x1/2 = y-y1 / 1 = z-z1/ 1
// x-x1/a1 = y-y1/a2 = z-z1/a3
//--> This all means that one point is (x1, y1, z1), parallel to (a1, a2, a3)


//Given line, given a point
//Connect point to a point on the line with vector A
//Line parallel to vector B
//Length is A cross B / |B|

//Another way: connect A to two points B and C on the lines
//AB cross AC is twice the area of ABC--> distance is AB cross AC / |BC|

//Proof of the shoestring formula: triangulate, use cross products
//Right hand rule cancels out the triangles outside the polygon, leaving formula




//Given points B and C on a line and point A, computes distance from A to the line
public class LinePointDistance {
  public static void main (String [] args){
    double [] B = {2.0, 3.0};
    double [] C = {3.0, 4.0};
    double [] A = {3.0, 4.1};
    double [] AB = new double[2];
    double [] BC = new double[2];
    for(int i=0; i<AB.length; i++){
      AB[i]=B[i]-A[i];
      BC[i]=C[i]-B[i];
    }

    double crossProduct = cross(AB, BC);
    double length=Math.sqrt(BC[0]*BC[0]+BC[1]*BC[1]);
    double linePointDistance=crossProduct/length;
    System.out.println(linePointDistance);

  }
  //Computing the dot product AB . BC
  public static double dot(double [] pointA, double [] pointB, double [] pointC){
    double[] AB = new double[pointA.length];
    double[] BC= new double[pointA.length];
    for(int i=0; i<pointA.length; i++){
      AB[i]=pointB[i]-pointA[i];
      BC[i]=pointC[i]-pointB[i];
    }
    double result=0;
    for(int i=0; i<AB.length; i++){
      result+=(AB[i]*BC[i]);
    }
    return result;
  }
  //Computes cross product A cross B
  public static double cross(double [] pointA, double [] pointB){
    return pointA[0]*pointB[1]-pointA[1]*pointB[0];
  }
}
