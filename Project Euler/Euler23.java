import java.util.*;

public class Euler23 {
    public static void main (String [] args){
        ArrayList<Integer> abundantNumbers=new ArrayList<Integer>();
        for (int i=12; i<28123;i++){
            if(isAbundant(i)){
                abundantNumbers.add(i);
            }
        }
        
        HashSet<Integer> abundantSums=new HashSet<Integer>();
        
        for (int i=0; i<abundantNumbers.size(); i++){
            for(int j=i; j<abundantNumbers.size(); j++){
                abundantSums.add(abundantNumbers.get(i)+abundantNumbers.get(j));
            }
        }
        int sum=0;
        for(int i=1; i<28124; i++){
            if(!abundantSums.contains(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
        
    }
    public static boolean isAbundant (int n){
        int sum=1;
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                sum+=i+(n/i);
            }
        }
        if(sum>n){
            return true;
        }
        return false;
    }
}
