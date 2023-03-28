import java.util.ArrayList;
import java.util.Random;

public class SplitArrayProblem{
    // method which returns true if the avg of list B is equal to avg of list C, false otherwise
    public static boolean areEqual(double a, double b){
        return a == b;
    }
    public static void main(String[] args) {
        Random rd = new Random();

        int n = rd.nextInt(30)+1, sumA = 0;  //n is the number of elements of Array A, n = [1, 30]

        double avA;

        int[] A = new int[n];

        System.out.println(n + " integers" );
        for (int i = 0; i < n; i++) {
            A[i] = rd.nextInt(10000) + 1;  // the elements of A are in the range 0->10000
        }

        System.out.print("Array A: ");
        for(int i = 0;i<n; i++){
            System.out.print(A[i] + " ");
            sumA += A[i];
        }
        System.out.println();
       avA = (double) sumA / n;
        System.out.println("Average of A: " + avA); // get the sum and average of the elements of array A

        ArrayList<Integer> B = new ArrayList<Integer>();
        ArrayList<Integer> C = new ArrayList<Integer>();
        int sumB = 0, sumC = 0;
        double avB, avC;

        if(n<2){
            System.out.println("Cannot split the array"); //if the number of elements is less than 2, the array cannot be split
            return;
        }
        else{
            for (int i = 0; i < n; i++){
            if (sumB <= sumC) { //if the sum of elements in list B is less than the one of C, elements are added to B
                B.add(A[i]);
                sumB += A[i];

            } else { // or else, elements are added in list C
                C.add(A[i]);
                sumC += A[i];

            }
            }
        }
        System.out.print("Array B: ");
        for (int i = 0; i < B.size(); i++) {
            System.out.print(B.get(i) + " ");

        }
        System.out.println();
        System.out.print("Array C: ");
            for (int i = 0; i < C.size(); i++) {
            System.out.print(C.get(i) + " ");

        }
        System.out.println();
        avB = sumB/B.size(); //compute the average of B
        avC = sumC/C.size(); //compute the average of C

        System.out.println("Average of B:" + avB);
        System.out.println("Average of C:" + avC);
        boolean res = areEqual(avB, avC);
        System.out.println(res);
        }
    }
