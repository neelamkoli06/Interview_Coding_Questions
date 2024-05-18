//--------code1 (swapping with using third variable------------)

// public class Swapping {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         int temp = 0;

//         System.out.println("Before swapping the numbers are: ");
//         System.out.println("value of a: "+ a);
//         System.out.println("vaue of b: "+ b);

//         temp = a;
//         a = b;
//         b = temp;

//         System.out.println("After swapping the numbers are: ");
//         System.out.println("value of a: " + a);
//         System.out.println("vaue of b: " + b);
//     }
// }



// --------code2 (swapping without using third variable------------)

class Swapping {
    public static void main(String[] args) {
        int a =10;
        int b = 20;

        System.out.println("Before swapping the numbers are: ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("After swapping the numbers are: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
// -----------------------------------------------------------
// output:-

// Before swapping the numbers are: 
// a = 10
// b = 20
// After swapping the numbers are: 
// a = 20
// b = 10