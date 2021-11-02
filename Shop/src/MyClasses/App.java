/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;

import Entity.Customer;
import Entity.Item;
import Entity.Warehouse;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import tools.SaverToFiles;

public class App {
    
    private Scanner scanner =new Scanner(System.in);
    private List<Item> items = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<Warehouse> warehouseHistory = new ArrayList<>();
    private SaverToFiles saverToFiles = new SaverToFiles();
    
    public App(){
        items = saverToFiles.loadItems();
        customers = saverToFiles.loadCustomers();
        warehouseHistory = saverToFiles.loadWarehouseHistory();
    }
    
    public void run(){
        
        String repeat = "r";
        
        do{
            
            System.out.println("Выберите номер задачи:");
            System.out.println("1: Закончить программу");
            System.out.println("2: Добавить модель"); //item
            System.out.println("3: Список продаваемых моделей"); //warehouse
            System.out.println("4: Добавить покупателя"); //customer
            System.out.println("5: Список зарегистрированных покупателей"); //warehouse
            System.out.println("6: Покупка покупателем обуви"); // warehouse
            System.out.println("7: Доход магазина за все время работы"); // warehouse
            System.out.println("8: Добавить денег покупателю"); // customer
            
            
            int task = getNumber();
            
            
            switch (task){
                
                case 1:
                    repeat = "q";
                    System.out.println("Пока!");
                    
                    break;
                
                case 2:
                    System.out.println("Добавить модель: ");
                    
                    break;
                   
                case 3:
                    System.out.println("Список продаваемых моделей: ");
                    
                    break;
                    
                case 4:
                    System.out.println("Добавить покупателя: ");
                    
                    break;
                    
                case 5:
                    System.out.println("Список зарегистрированных покупателей: ");
                    
                    break;
                    
                case 6:
                    System.out.println("Покупка покупателем обуви: ");
                    
                    break;
                    
                case 7:
                    System.out.println("Доход магазина за все время работы: ");
                    
                    break;
                    
                case 8:
                    System.out.println("Добавить денег покупателю: ");
                    
                    break;

                
                default:
                    System.out.println("Выберите цифру из списка!");
            }
        }
        while("r".equals(repeat));
    
    }
    
    

}
