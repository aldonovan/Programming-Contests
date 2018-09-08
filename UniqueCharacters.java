import java.util.*;
public class UniqueCharacters {
  //Checks if any characters are the same, uppercase and lowercase considered equivalent
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = input.nextLine();
    input.close();
    System.out.println(isUnique(str));
    System.out.println("The string with duplicated characters removed is "+removeDuplicates(str));
  }
  public static boolean isUnique (String s){
    s=s.toLowerCase();
    boolean[] characters = new boolean[256];
    for (int i=0; i<s.length(); i++){
      int index = s.charAt(i);
      if(characters[index]) return false;
      characters[index]=true;
    }
    return true;
  }
  public static String removeDuplicates (String s){
    s=s.toLowerCase();
    String newString="";
    boolean[] characters = new boolean[256];
    for(int i=0; i<s.length(); i++){
      int index = s.charAt(i);
      if(!characters[index]) newString+=s.charAt(i);
      characters[index]=true;
    }
    return newString;
  }
}
