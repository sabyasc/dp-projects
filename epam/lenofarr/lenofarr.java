// maximum length of an subarray

package lenofarr;

import java.util.Scanner;

public class lenofarr {

    public static int solve(int[] arr1, int[] arr2) {
        int[][] da = new int[arr1.length + 1][arr2.length + 1]; // da is diagonal array checking
        int result = 0; //store the result, initial value is 0
        
        for(int i = 1; i < da.length; i++){
            for(int j = 1; j < da[0].length; j++) {
                if(arr1[i - 1] == arr2[j - 1]){
                    da[i][j] = da[i-1][j-1] + 1;
                }
                result = Math.max(result, da[i][j]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<1; i++){
            arr1[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<1; i++){
            arr2[i] = scn.nextInt();
        }
        System.out.println(solve(arr1, arr2));
    }

}
