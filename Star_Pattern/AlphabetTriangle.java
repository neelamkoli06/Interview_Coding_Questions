class AlphabetTriangle {
    public static void main(String[] args) {
        int n = 5;
        char currentChar = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(currentChar+" ");
                currentChar++;
            }
            System.out.println();
        }

    }
}