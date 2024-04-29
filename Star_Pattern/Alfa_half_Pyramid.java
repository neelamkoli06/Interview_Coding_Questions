class Alfa_half_Pyramid {
    public static void main(String[] args) {
        char last = 'E',alphbet = 'A';

        for(int i=1; i<= (last - 'A' + 1); ++i){
            for(int j = 1; j <= i; ++j){
                System.out.print(alphbet + " ");
            }
            ++alphbet;
            System.out.println();
        }
    }
}