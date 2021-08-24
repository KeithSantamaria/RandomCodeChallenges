public class App {

    public static boolean isValidCreditCard(String cardNumber){
        if( cardNumber.length() < 14 || cardNumber.length() > 19){
            return false;
        }
        Integer checkNumber = 
            Integer.parseInt(
                cardNumber.substring( cardNumber.length() - 1, cardNumber.length())
            );
        System.out.println(checkNumber);
        StringBuilder check = new StringBuilder( 
            cardNumber.substring( 0 , cardNumber.length() - 1)
        );
        check.reverse();
        
        int finalSum = 0;

        for( int i = 0; i < check.length(); i++){
            Character tempChar = check.charAt(i);
            Integer temp =  Integer.parseInt( tempChar.toString() );
            // since iteration starts at 0, we make it even instead of odd.
            if( i % 2 == 0 ){
                temp *= 2;
                if( temp / 10 > 0){
                    temp = (temp % 10) + 1;
                }
            }
            finalSum += temp;
        }
        
        if( ( 10 - finalSum % 10) == checkNumber ){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(isValidCreditCard("1234567890123456"));
        System.out.println(isValidCreditCard("1234567890123452"));
    }
}
