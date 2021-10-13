/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;
import java.util.Scanner;

public class App {
    
    private Scanner scanner =new Scanner(System.in);
    
    public void run(){
        
        String repeat = "r";
        
        do{
            
            System.out.println("Выберите номер задачи:");
            System.out.println("0: Закончить программу");
            System.out.println("1: Список товара на складе");
            System.out.println("2: Добавить товар на склад");
            System.out.println("3: Изменить стоимость товара");
            System.out.println("4: Список клиентов");
            System.out.println("5: Добавить клиента");
            System.out.println("6: Информация о клиенте");
            System.out.println("7: Выписать счет клиенту");
            System.out.println("8: Оплата счета клиентом");
            
            int task = scanner.nextInt();
            scanner.nextLine();
            
            switch (task){
                
                case 0:
                    repeat = "q";
                    System.out.println("Пока!");
                    
                    break;
                
                case 1:
                    System.out.println("Список товара на складе: ");
                    
                    break;
                   
                case 2:
                    System.out.println("Добавить товар на склад: ");
                    
                    break;
                    
                case 3:
                    System.out.println("Изменить стоимость товара: ");
                    
                    break;
                    
                case 4:
                    System.out.println("Список клиентов: ");
                    
                    break;
                    
                case 5:
                    System.out.println("Добавить клиента: ");
                    
                    break;
                    
                case 6:
                    System.out.println("Информация о клиенте: ");
                    
                    break;
                    
                case 7:
                    System.out.println("Выписать счет клиенту: ");
                    
                    break;
                    
                case 8:
                    System.out.println("Оплата счета клиентом: ");
                    
                    break;
                
                default:
                    System.out.println("Выберите цифру из списка!");
            }
        }
        while("r".equals(repeat));
    
    }
    
    

}
