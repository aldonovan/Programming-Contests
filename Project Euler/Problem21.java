import java.io.*;
import java.util.*;

public class Problem21 {
    public static void main (String [] args){
        int count=0;
        for(int i=3; i<=10000; i++){
            if(factorSum(i)==i){
                continue;
            }
            if(factorSum(factorSum(i))==i){
                count+=i;
            }
        }
        System.out.println(count);
        
    }
    public static int factorSum (int n){
        int sum=0;
        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    //Ended up not being used at all
    public static boolean amicable (int m, int n){
        if(factorSum(m)==n && factorSum(n)==m){
            return true;
        }
        return false;
    }
}
