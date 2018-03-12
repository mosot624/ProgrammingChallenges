package JavaWorks;

public class PasswordValidator {
    public static void main(String[] args){
        validator("IsThis£Allowed");
    }
    public static void validator(String c){
        char[] cToChar = c.toCharArray();

        boolean uppercace = false;
        boolean symbol = false;

        for(int i = 0; i< c.length(); i++ ){
            if(Character.getType(cToChar[i]) == Character.UPPERCASE_LETTER){
                uppercace = true;
            }
            if (!Character.isLetterOrDigit(cToChar[i])){
                symbol = true;
            }
        }

        if(uppercace == false){
            System.out.println("No uppercase letter in your password");
        }

        if(symbol == false){
            System.out.println("No symbol in your password");
        }

        else{
            System.out.println("Password Accepted");
        }


    }
}
