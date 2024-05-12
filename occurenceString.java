class occurenceString {
    public static void main(String[] args) {
        
        String str1 = "elephant";
        char repeatAlphabate = 'e';

        int count = 0;

        for(int i=0; i<str1.length();i++){
            if(str1.charAt(i) == repeatAlphabate){
                count++;
            }
        }
       System.out.println(count);
    }
}
//-----------------------------------------------------------
// output:-
// 2