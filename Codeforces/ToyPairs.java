import java.io.*;
import java.util.*;
// https://codeforces.com/problemset/problem/1023/B
public class ToyPairs {
  public static void main(String [] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    long numToys=Long.parseLong(st.nextToken());
    long totalCost=Long.parseLong(st.nextToken());

    if(totalCost>=(2*numToys) || totalCost<=1L){
      out.print("0");
    } else {
      long smallestValue = (totalCost>numToys) ? totalCost-numToys : 1L;
      long largestValue = (totalCost%2==0) ? (totalCost/2L)-1 : totalCost/2L;
      out.print(largestValue-smallestValue+1);
    }
    out.close();
  }
}
