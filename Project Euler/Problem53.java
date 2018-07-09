import java.math.*;
import java.io.*;
import java.util.*;

public class Problem53 {
    public static void main (String [] args){
        int counter=0;
        BigInteger million=new BigInteger("1000000");
        for (int i=23; i<=100; i++){
            for (int j=4; j<=i-4; j++){
                if(nCr(i, j).compareTo(million)>=0){
                    counter++;
                }
            }
        }
        System.out.println(counter);
        System.out.println(nCr(98, 50));
    }
    public static BigInteger factorial (int n){
        BigInteger factorial=new BigInteger("1");
        
        
        for(int i=2; i<=n; i++){
            factorial=factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
    public static BigInteger nCr (int n, int r){
        BigInteger nfact=factorial(n);
        BigInteger rfact=factorial(r);
        
        BigInteger nrfact=factorial(n-r);
        
        BigInteger combination=nfact.divide(rfact.multiply(nrfact));
        return combination;
    }
}
