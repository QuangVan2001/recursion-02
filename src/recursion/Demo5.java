/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author QUANG VAN
 */
public class Demo5 {
    static int arr[] = { 1, 2, 3, 4, 5 };
 
    // Return sum of elements in A[0..N-1]
    // using recursion.
    static int findSum(int A[], int N)
    {
        if (N <= 0)
            return 0;
        return (findSum(A, N - 1) + A[N - 1]);
    }
 
    // Driver method
    public static void main(String[] args)
    {
        System.out.println(findSum(arr, arr.length));
    }
}
