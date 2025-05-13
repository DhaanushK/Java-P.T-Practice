public class RightSidedTriangle {
    public static void main(String[] args) {
        int n = 5;
        int i,j;
        for(i=1; i<=n; i++){
            for(j=i; j<=n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
