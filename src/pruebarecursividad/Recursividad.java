/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebarecursividad;

/**
 *
 * @author nicol
 */
public class Recursividad {
    
    public static long fibonacci(int n) {
    
    if (n == 0) {
        return 0; 
    }
    if (n == 1) {
        return 1; 
    }
    
    return fibonacci(n - 1) + fibonacci(n - 2); 
    }
    public static int mcd(int a, int b) {
       
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }
    public static int count(Object dato[], int n, Object o){
        if (n<=0) {
            return 0; 
        }
        if (dato[n-1].equals(o)) {
            return 1 + count(dato, n-1, o);
            
        }else{
            return count(dato, n-1, o);
        }
    }
    public static void reverse(Object datos[], int inicio, int fin){
        if (inicio >= fin) {
            return;
        }
        Object temp = datos[inicio];
        datos[inicio]=datos[fin];
        datos[fin]= temp;
        
        reverse(datos, inicio + 1, fin - 1);
    }
   
}
