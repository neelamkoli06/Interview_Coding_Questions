class LargestNumber {
    public static void main(String[] args) {
        int a=1, b=2, c=3;

        if(a > b && a > c){
            System.out.println(a + "means a is greater!");
        }
        else if(b > a && b > c){
            System.out.println(b + " means b is greater");
        }
        else{
            System.out.println(c + " c is greater");
        }
    }
}
//-------------------------------------------------------
// output:-
// 3 c is greater