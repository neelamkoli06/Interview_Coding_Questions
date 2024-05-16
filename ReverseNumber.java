public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234 ,reverse = 0;
        System.out.println("original number is: "+num);

        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse number is: " + reverse);
    }
}
//------------------------------------------------------------
// output:-

// original number is: 1234
// Reverse number is: 4321
