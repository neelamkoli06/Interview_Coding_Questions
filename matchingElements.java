//Basically here we are finding the duplicate element in the array

public class matchingElements {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,5,1,2,6,7};
        for(int i=0; i< a.length; i++){
            for(int j = i+1; j<a.length;j++){
                if(a[j]==a[i]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
//-----------------------------------------------------------------------
//output:-
// 1
// 2
// 5