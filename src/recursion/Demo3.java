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
public class Demo3 {
     public static int Nth_of_AP(int a,
                                int d,
                                int N)
    {
        // using formula to find the Nth
        // term t(n) = a(1) + (n-1)*d
        return ( a + (N - 1) * d );
    }
 
    // Driver code
    public static void main(String[] args)
    {
        // starting number
        int a = 2;
         
        // Common difference
        int d = 1;
         
        // N th term to be find
        int N = 5;
 
        // Display the output
        System.out.print("The "+ N +
                         "th term of the series is : " +
                          Nth_of_AP(a, d, N));
    }
}
