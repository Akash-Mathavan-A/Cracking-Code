public class LastDigit{
    public static void main(String[] args) {
        String a = "3";
        String b = "10";
        int value = getLastDigit(a , b);
        System.out.println(value);
    }

    /*
     * You are given two integer numbers, the base a and the index b. 
     * You have to find the last digit of ab.
     */

     public static int getLastDigit(String a, String b) {
        if(a.length() == 1 && a.charAt(0) == '0')
        return 0;
        
        if((b.length() == 1 && b.charAt(0) == '0') || (a.length() == 1 && b.length() == 1 && a.charAt(0) == '0' && b.charAt(0) == '0'))
        return 1;

        int A = a.charAt(a.length() - 1) - '0';    

        int valB = convertB(b , 4);

        int B = (valB % 4 == 0) ? 4 : valB % 4;

        return power(A , B);
     }

     public static int power(int a , int b){
        int result = 1;

        for(int i = 0; i < b; i++){
            result *= a;
        }

        return result % 10;
     }

     public static int convertB(String b , int mod){
        int convert = 0;

        for(int i = 0; i < b.length(); i++){
            convert = (convert * 10) + (b.charAt(i) - '0');
            convert %= mod;
        }
        
        return convert;
     }
}