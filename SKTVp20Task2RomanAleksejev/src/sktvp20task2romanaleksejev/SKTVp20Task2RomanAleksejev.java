/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sktvp20task2romanaleksejev;


import java.util.Scanner;


public class SKTVp20Task2RomanAleksejev {

    public static void main(String[] args) {
        
    //Программа вычисляет сумму цифр трехзначного числа введенных в консоль
        
        System.out.print("Введите число... ");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        
        System.out.printf("Сумма цифр = "+
                ((userNum/100%100)+(userNum/10%10)+(userNum%10)));
        
        
        
        
    }
}
