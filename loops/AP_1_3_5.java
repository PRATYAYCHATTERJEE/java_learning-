package loops;




  
public class AP_1_3_5 {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the series
        int firstTerm = 1; // First term of the series
        int commonDifference = 2; // Common difference between terms

        System.out.println("The first " + n + " terms of the series are:");
        for (int i = 0; i < n; i++) {
            int term = firstTerm + (i * commonDifference);
            System.out.print(term + " ");
        }
    }
}