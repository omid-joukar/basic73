import java.util.Scanner;

/**
 * Created by KPS on 7/12/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a sentence");
        String s1 = scanner.nextLine();
        System.out.println("please enter a sentence");
        String s2 = scanner.nextLine();
        String result = "";
        char ch1 = s1.charAt(0);
        char ch2 = s2.charAt(0);
        if (ch1 == ' '&& ch2 == ' ' ){
            result="##";
        }
         if (ch1==' ' && Character.isWhitespace(ch2)==false){
            result="#"+String.valueOf(ch2);
        }else if (Character.isWhitespace(ch1)==false && ch2 == ' ' ){
            result = String.valueOf(ch1)+"#";
        }else if( Character.isWhitespace(ch2)==false &&  Character.isWhitespace(ch1)==false){
            result +=String.valueOf(ch1)+String.valueOf(ch2);
        }
        System.out.println(result);
    }
}
