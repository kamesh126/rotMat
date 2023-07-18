import java.util.Arrays;
import java.util.Scanner;

public class RotateMat {
    public static void rotates(int A[][],int n){
        int temp=0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {

                temp=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;

            }
        }

    }
    public static void reverse(int[][] arr1, int n){
        int size=arr1.length;
        int size1=arr1[0].length-1;

        for(int x=0;x<size;x++) {
            int i=0;
            int j=size1;
            while(i<j) {
                int temp=arr1[x][i];
                arr1[x][i]=arr1[x][j];
                arr1[x][j]=temp;
                i++;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("row size ");
        int n = sc.nextInt();
        System.out.println("coloum size ");
        int m = sc.nextInt();
        int A[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("enter " + i + "," + j);
                A[i][j] = sc.nextInt();
            }
        }
        rotates(A,n);
        reverse(A, n);
        for(int[] value : A) {
            System.out.println(Arrays.toString(value));
        }
    }
}