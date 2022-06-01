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
public class Demo4 {
    public static int Nth_of_GP(int a,
                                int r,
                                int N)
    {
        // using formula to find the Nth
        // term TN = a1 * r(N-1)
        return ( a * (int)(Math.pow(r, N - 1)) );
    }
 
    // Driver code
    public static void main(String[] args)
    {
        // starting number
        int a = 2;
         
        // Common ratio
        int r = 3;
         
        // N th term to be find
        int N = 5;
 
        // Display the output
        System.out.print("The "+ N + "th term of the" +
                " series is : " + Nth_of_GP(a, r, N));
    }
}
