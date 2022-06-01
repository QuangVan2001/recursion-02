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
public class Demo6 {
    public static double max(int []a, int n){
        if(n==1){
            return a[0];
        }
        return Math.max(a[n-1], max(a,n-1));
    }
    public static void main(String[] args) {
        int a[] = { 1, 5, 9, 7, 2, 19,10 };
        System.out.println(max(a, 7));
    }
}
