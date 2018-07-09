import java.io.*;
import java.util.*;

public class Problem89 {
    public static void main(String [] args) throws FileNotFoundException {
        //We need to convert Roman numerals to numbers and numbers to minimum Roman numerals
        //Write one algorithm, romToNum and another, numToRom
        File file=new File("roman.txt");
        Scanner in=new Scanner(file);
        
        int difference=0;
        String rom;
        while(in.hasNextLine()){
            rom=in.nextLine();
            difference+=(rom.length()-numToRom(romToNum(rom),"").length());
        }
        System.out.println(difference);

    }
    public static int romToNum (String s){
        //Roman numerals are a bit complicated. If it's one character, just a simple switch statement
        //If more than one character, have to know if next character is higher in the hierarchy
        //We could convert all the characters into integer values and check increasing/non-decreasing
        
        int[] values=new int[s.length()];
        for(int i=0; i<s.length(); i++){
            switch(s.charAt(i)){
                case 'I': values[i]=1;
                    break;
                case 'V': values[i]=5;
                    break;
                case 'X': values[i]=10;
                    break;
                case 'L': values[i]=50;
                    break;
                case 'C': values[i]=100;
                    break;
                case 'D': values[i]=500;
                    break;
                case 'M': values[i]=1000;
                    break;
            }
        }
        int number=0;
        for(int i=0; i<values.length-1; i++){
            if(values[i+1]>values[i]){
                number-=values[i];
            } else {
                number+=values[i];
            }
        }
        number+=values[values.length-1];
        return number;
    }
    public static String numToRom (int n, String s){
        //Can take a recursive approach
        if(n>=1000){
            s+="M";
            return numToRom(n-1000, s);
        } else if (n>=900){
            s+="CM";
            return numToRom(n-900, s);
        } else if(n>=500){
            s+="D";
            return numToRom(n-500, s);
        } else if (n>=400){
            s+="CD";
            return numToRom(n-400, s);
        } else if (n>=100){
            s+="C";
            return numToRom(n-100, s);
        } else if (n>=90){
            s+="XC";
            return numToRom(n-90, s);
        } else if (n>=50){
            s+="L";
            return numToRom(n-50, s);
        } else if (n>=40){
            s+="XL";
            return numToRom(n-40, s);
        } else if (n>=10){
            s+="X";
            return numToRom(n-10, s);
        } else if (n==9){
            s+="IX";
            return s;
        } else if (n>=5){
            s+="V";
            return numToRom(n-5, s);
        } else if (n==4){
            s+="IV";
            return s;
        } else if(n>=1){
            s+="I";
            return numToRom(n-1, s);
        }
        return s;
    }
}
