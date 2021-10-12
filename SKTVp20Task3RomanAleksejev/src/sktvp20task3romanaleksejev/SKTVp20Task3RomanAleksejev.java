/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sktvp20task3romanaleksejev;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SKTVp20Task3RomanAleksejev {

    public static void main(String[] args) {
        // Запрос и вывод информации пользователя
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите имя...");
        String name = scanner.nextLine();
        
        System.out.println("Введите фамилию...");
        String surname = scanner.nextLine();
        
        System.out.println("Введите год рождения...");
        String year = scanner.nextLine();
        
        System.out.println("Введите месяц рождения...");
        String month = scanner.nextLine();
        
        System.out.println("Введите день рождения...");
        String day = scanner.nextLine();
        
        System.out.println(name+" "+surname+" родился "+day+
                " "+month+" "+year+" года.");
    }
    
}
