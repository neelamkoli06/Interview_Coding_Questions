public class reverseArray{
    public static void main(String args[]){
        int[] b = new int[] {1,2,3,4,5,6,7,8};
        System.out.println("original array: ");

        for(int i=0; i<b.length;i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");

        for(int i=b.length-1; i>=0; i--){
            System.out.print(b[i] + " ");
        }
    }
}
//----------------------------------------------
//output:-
// original array: 
// 1 2 3 4 5 6 7 8 
// Array in reverse order: 
// 8 7 6 5 4 3 2 1