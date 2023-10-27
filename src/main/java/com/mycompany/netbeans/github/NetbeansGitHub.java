
package com.mycompany.netbeans.github;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NetbeansGitHub {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
    	int x = scan.nextInt();
	System.out.println("Introduce el segundo número: ");
    	int y = scan.nextInt();
	int z = suma( x, y);
	System.out.println(z);
    }	
    static int suma(int a, int b) {
	return a+b;
    }
}
