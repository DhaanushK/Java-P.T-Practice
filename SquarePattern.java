public class SquarePattern {
    public static void main(String[] args) {
        int n = 5;
        int i,j;
        for(i=1; i<=n; i++){
            for(j=1; j<=n-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
