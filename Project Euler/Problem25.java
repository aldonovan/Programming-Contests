import java.io.*;
import java.util.*;

public class Problem25 {
    public static void main (String [] args){
        ArrayList<String> fibs=new ArrayList<String>();
        fibs.add("1");
        fibs.add("1");
       
        String[] fibos=new String[100000];
        fibos[0]="1";
        fibos[1]="1";
        
        boolean done=false;
        int index=1;
        while(!done){
            index++;
            fibos[index]=addition(fibos[index-1],fibos[index-2]);
            if(fibos[index].length()>=1000){
                done=true;
            }
        }
        //Add 1 since I indexed the Fibonacci numbers differently
        System.out.println(index+1);
        
    }
    //Method to add two strings with carrying in order to bypass BigInteger
    public static String addition (String a, String b){
        //345 + 123
        
        int maxStringLength=Math.max(a.length(), b.length());
        int minStringLength=Math.min(a.length(), b.length());
        
        String max;
        String min;
        if(a.length()==maxStringLength){
            max=a;
            min=b;
        } else {
            max=b;
            min=a;
        }
        
        int[] sum=new int[maxStringLength+1];
        
        int carry=0;
        for(int i=1; i<=minStringLength; i++){
            sum[sum.length-i]=Integer.parseInt(a.substring(a.length()-i, a.length()-i+1))+Integer.parseInt(b.substring(b.length()-i,b.length()-i+1))+carry;
            if(sum[sum.length-i]>=10){
                carry=1;
                sum[sum.length-i]-=10;
            } else {
                carry=0;
            }
        }
        for (int i=minStringLength+1; i<=maxStringLength; i++){
            sum[sum.length-i]=Integer.parseInt(max.substring(max.length()-i,max.length()-i+1))+carry;
            if(sum[sum.length-i]>=10){
                carry=1;
                sum[sum.length-1-i]-=10;
            } else {
                carry=0;
            }
        }
        String sandwich="";
        if(carry==1){
            sandwich="1";
        }
        
        
        for (int i=1; i<sum.length; i++){
            sandwich+=sum[i]+"";
        }
        
        return sandwich;
    }
}
