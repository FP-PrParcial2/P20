/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema020;
import java.util.*;
/**
 *
 * @author karen
 */
public class PPProblema020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i,suma=0, n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce primer número: ");
        n1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        n2 = sc.nextInt();
        for(i=1;i<n1;i++){  
             if(n1%i==0){
                suma=suma+i;
             }
        }
        
        if(suma==n2){
           suma=0;
           for(i=1;i<n2;i++){  
                if(n2%i==0){
                   suma=suma+i;
               }
           }
       
           if(suma==n1){
              System.out.println("Son Amigos");
           }else{
                   System.out.println("No son amigos");
           }
        }        
        else{
               System.out.println("No son amigos");
        }
    }
}
