import java.util.*;

public class ThreeLetterAcronym {
    public static void main(String[] args){
        String message;
        int MAX = 0;
        StringBuilder characters = new StringBuilder();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the string");
        message = myObj.nextLine();
        characters.append(Character.toUpperCase(message.charAt(0)));
        MAX++;
        for (int i=0; MAX < 3; i++){

            if (message.charAt(i) == ' '){
                ++i;
                characters.append(Character.toUpperCase(message.charAt(i)));
                MAX++;
            }
        }
        System.out.println(characters);
    }
}
