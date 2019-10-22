/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author User
 */
public class factorial {
    
    int fact(int n)
    {
    int result;
    if(n == 1) return 1;
    else result = fact(n-1)*n;
    return result;
    }
}
