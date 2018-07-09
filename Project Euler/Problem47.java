import java.io.*;
import java.util.*;
public class Problem47 {
    public static void main (String [] args){
        boolean found=false;
        int n=646;
        while(!found){
            n++;
            if((numPrimeFactors(n)==4)&&(numPrimeFactors(n+1)==4)&&(numPrimeFactors(n+2)==4)&&(numPrimeFactors(n+3)==4)){
                found=true;
            }
        }
        System.out.println(n);
    }
    public static int numPrimeFactors (int n){
        int numPrimes=0;
        for (int i=2; i<=n; i++){
            if(n%i==0){
                numPrimes++;
            }
            while(n%i==0){
                n=n/i;
            }
        }
        return numPrimes;
    }
}
