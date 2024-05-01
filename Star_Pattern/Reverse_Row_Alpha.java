class Reverse_Row_Alpha {
    public static void main(String[] args) {
        int n = 5;
        char currentChar = 'A';
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i ;j++){
                System.out.print(currentChar + " ");
                currentChar++;
            }
            System.out.println();
        }
    }
}
//-------------------------------------------
//output:-
// A B C D E 
// F G H I 
// J K L 
// M N 
// O 