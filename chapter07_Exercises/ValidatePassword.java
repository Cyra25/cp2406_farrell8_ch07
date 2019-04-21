import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args){
        int length;
        String password;
        int isUpper = 0;
        int isLower = 0;
        int isDigit = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the password containing at least two uppercase letter, at least two lowercase letters, and at least two digits");
        password = input.nextLine();
        length = password.length();
        while (isLower<2 || isDigit<2 || isUpper<2){
            isLower = 0;
            isUpper = 0;
            isDigit = 0;
            for (int i = 0; i<length; i++){
                if (Character.isLowerCase(password.charAt(i))){
                    ++isLower;
                }
                if (Character.isUpperCase(password.charAt(i))){
                    ++isUpper;
                }
                if (Character.isDigit(password.charAt(i))){
                    ++isDigit;
                }
            }
            if (isLower<2 || isDigit<2 || isUpper<2){
                if (isLower < 2){
                    System.out.println("There must be 2 or more Lowercase characters.");
                }
                if (isUpper < 2){
                    System.out.println("There must be 2 or more Uppercase characters.");
                }
                if (isDigit < 2){
                    System.out.println("There must be 2 or more Digits.");
                }
                System.out.println("Enter the password containing at least two uppercase letter, at least two lowercase letters, and at least two digits");
                password = input.nextLine();
                length = password.length();

            }

        }
        System.out.println("The password is valid. Success!!!");
    }
}
