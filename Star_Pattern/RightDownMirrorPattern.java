public class RightDownMirrorPattern {
    public static void main(String[] args) {
        for(int i=5; i>0;i--){
            for(int j=7;j>i;j--){ 
                System.out.print( " ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//------------------------------------------------------------
//output
//   *****
//    ****
//     ***
//      **
//       *