/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema17;

import java.util.Scanner;

/**
 *
 * @author Enano
 */
public class PP2Problema17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        print(comDiv(getInf()));
    }
    public static int[] getInf() //Se recibe la información
    {
        int[]num=new int[2];
        for(int i=0;i<num.length;i++)
        {
            Scanner in =new Scanner (System.in);
            System.out.println("Ingrese el número "+(i+1)+" :");
            num[i]=in.nextInt();            
        }
        return num;
    }
    public static int comDiv(int[] nums) //Se consigue el comun divisor.
    {
        int maxComDiv=1; //Se inicializa con 1, porque no se puede dividir entre 0.
        if(nums[0]>nums[1]) //Si el primer número es mayor, se tomará como referencia tal.
        {
            for(int i=1;i<=nums[0];i++)
            {
                if(nums[0]%i==0&&nums[1]%i==0)
                {
                    maxComDiv=i;
                }
            }
        }       
        if(nums[0]<nums[1]) //Si el segundo número es mayor, se tomará como referencia tal.
        { 
            for(int i=1;i<=nums[1];i++) //Se intenta con cada número, hasta el número menor.
            {
                if(nums[1]%i==0&&nums[0]%i==0)//Si puede dividir a ambos números...
                {
                    maxComDiv=i;  //Se toma como común divisor.
                }
            }
        }
        return maxComDiv; //Si no hay un común divisor, se utiliza el 1, con el cual se inicializo.
    }
    public static void print (int maxComDiv) //Se imprime.
    {
        System.out.println("El máximo común divisor de esos números es: "+maxComDiv);
    }
}
