/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2.pkg3;

import java.util.Scanner;


public class Bol23 {

   
    public static void main(String[] args) {
       float euro,dolar = 1.1162f;
       Scanner obx = new Scanner(System.in);
        System.out.println("teclea euro :");
        euro = obx.nextFloat();
        System.out.println("resultado ="+euro*dolar);
    
    }
    
}
