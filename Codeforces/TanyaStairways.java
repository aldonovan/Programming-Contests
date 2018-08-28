import java.util.*;
import java.io.*;
// https://codeforces.com/problemset/problem/1005/A
public class TanyaStairways {
  public static void main(String [] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int numberOfStaircases = 0;
    ArrayList<Integer> staircases = new ArrayList<Integer>();
    int steps = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int lastStair=0;
    //Loop stores previous value, adds it to staircases when resets to 1, adds last value
    for(int i=0; i<steps; i++){
      int stairNumber = Integer.parseInt(st.nextToken());
      if(stairNumber == 1){
        numberOfStaircases++;
        if(i!=0){
          staircases.add(lastStair);
        }
      }
      lastStair = stairNumber;
    }
    staircases.add(lastStair);

    out.println(numberOfStaircases);
    out.print(staircases.get(0));
    for(int i=1; i<staircases.size(); i++){
      out.print(" "+staircases.get(i));
    }
    out.close();
  }
}
