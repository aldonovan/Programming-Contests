import java.io.*;
import java.util.*;

public class Problem7 {
    public static void main (String [] args){
        int[] primes=new int[10001];
        primes[0]=2;
        primes[1]=3;
        
        int counter=2;
        for (int i=4; counter<=10000; i++){
            boolean prime=true;
            for(int j=0; j<counter; j++){
                if(i%primes[j]==0) prime=false;
            }
            if(prime){
                primes[counter]=i;
                counter++;
            }
        }
        System.out.println(primes[10000]);
    }
}
