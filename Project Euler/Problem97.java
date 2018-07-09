import java.io.*;
import java.util.*;

public class Problem97 {
    public static void main (String [] args){
        long lastTen=1L;
        for(int i=1; i<=7830457; i++){
            lastTen*=2;
            if(lastTen>10000000000L){
                lastTen=lastTen-10000000000L;
            }
        }
        lastTen=lastTen*28433+1;
        System.out.println(lastTen);
        //Inspect the last 10 digits to get the answer
    }
}
