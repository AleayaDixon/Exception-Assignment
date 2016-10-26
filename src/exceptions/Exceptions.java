/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;
import java.util.Scanner;
import java.lang.ArithmeticException;

/**
 *
 * @author Aleaya
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b;
        int result = 0;
 
        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");
        
        try
        {
            a = input.nextInt();
            b = input.nextInt();
            result = a / b;
            System.out.println("Result = " + result);
        }catch(ArithmeticException e)
        {
            System.out.println("You cannot divide by zero");
        }              
    }
    
}
