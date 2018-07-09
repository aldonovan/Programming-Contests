import java.io.*;
import java.util.*;

public class Problem45 {
    public static void main (String [] args){
        boolean done=false;
        long i=143L;
        HashSet<Long> triangular=new HashSet<Long>();
        HashSet<Long> pentagonal=new HashSet<Long>();
        HashSet<Long> hexagonal=new HashSet<Long>();
        while(!done){
            i++;
            triangular.add(i*(i+1)/2);
            pentagonal.add(i*(3*i-1)/2);
            hexagonal.add(i*(2*i-1));
            System.out.println(i);
            if(pentagonal.contains(i*(i+1)/2) && hexagonal.contains(i*(i+1)/2)){
                done=true;
            }
        }
        System.out.println(i);
    }
}
