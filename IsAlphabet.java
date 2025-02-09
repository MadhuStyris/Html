import java.util.Scanner;
public class IsAlphabet{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a Character: ");
       char letter=sc.next().charAt(0);
       if((letter>='A'&&letter<='Z')||(letter>='a'&&letter<='z')){
        System.out.println(letter+" is an Alphabet");
       }
       else{
        System.out.println(letter+" is not an Alphabet");
       }
       sc.close();
    }
}