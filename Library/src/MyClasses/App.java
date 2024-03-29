/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;
import Entity.Book;
import Entity.Author;
import Entity.History;
import Entity.Reader;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.Scanner;


/**
 *
 * @author user
 */
public class App {
    private Scanner scanner =new Scanner(System.in);
    private Book[] books = new Book[10];
    private Reader[] readers = new Reader[10];
    private History[] histories = new History[10];
    
    public void run(){
        
        String repeat = "r";
        
        do{
            System.out.println("Выберите номер задачи:");
            System.out.println("0: Закончить программу");
            System.out.println("1: Добавить книгу");
            System.out.println("2: Список книг");
            System.out.println("3: Добавить читателя");
            System.out.println("4: Список читателей");
            System.out.println("5: Выдать книгу читателю");
            System.out.println("6: Вернуть книгу");
            
            int task = scanner.nextInt();
            scanner.nextLine();
            
            switch (task){
                case 0:
                    repeat = "q";
                    System.out.println("Пока!");
                    break;
                
                case 1:
                    System.out.println("--- Добавление книги ---");
                    for(int i=0; i<books.length; i++){
                    if (books[i]== null){
                        books[i]=addBook();
                        break;
                        }
                    }
                    break;
                    
                case 2:
                    System.out.println("--- Список книг ---");
                    for (int i=0; i<books.length;i++){
                        if(books[i] != null){
                            System.out.println(books[i].toString());
                        }
                    }
                    System.out.println("-------------------");
                    break;
                    
                case 3:
                    System.out.println("--- Добавление читателя ---");
                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] == null) {
                            readers[i] = addReader();
                            break;
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("--- Список читателей ---");
                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] != null) {
                            System.out.println(readers[i].toString());
                        }
                    }
                    
                    System.out.println("-------------------");
                    break;
                
                case 5:
                    System.out.println("--- Выдать книгу читателю ---");
                    for (int i=0; i<histories.length;i++){
                        if(histories[i] == null){
                            histories[i]= addHistory();
                            System.out.println("Книга "+histories[i].getBook().getBookName()
                                                +" выдана читателю "+histories[i].getReader().getName()
                                                +" "+ histories[i].getReader().getFamilyname());
                            break;
                        }
                    }
                    System.out.println("-------------------");
                    
                    break;
                    
                case 6:
                    System.out.println("--- Вернуть книгу ---");   
                    System.out.println("Список читаемых книг:");
                    int n = 0;
                    for (int i = 0; i < histories.length; i++) {
                        if(histories[i] != null && histories[i].getReturnedDate() == null){
                            System.out.println(i+1+". Книгу "
                                    +histories[i].getBook().getBookName()
                                    +" читает "+histories[i].getReader().getName()
                                    +" "+histories[i].getReader().getFamilyname()
                            );
                            n++;
                        }
                    }
                    if(n < 1){
                        System.out.println("Нет читаемых книг!");
                        System.out.println("-------------------");
                        break;
                    }
                    System.out.print("Выберите номер возврщаемой книги: ");
                    int numberHistory = scanner.nextInt(); scanner.nextLine();
                    Calendar c = new GregorianCalendar();
                    histories[numberHistory - 1].setReturnedDate(c.getTime());
                    System.out.println("Книга "
                            +histories[numberHistory - 1].getBook().getBookName()
                            +" возвращена в библиотеку"
                    );
                    System.out.println("-------------------");
                    break;
                    
                    
                    
                default:
                    System.out.println("Выберите цифру из списка!");
                    

            }
            
        }
        while("r".equals(repeat));
        
    }
    
    private Book addBook(){
        Book book = new Book();
        System.out.print("Введите название книги: ");
        book.setBookName(scanner.nextLine());
        System.out.print("Введите год издания книги: ");
        book.setPublishedYear(scanner.nextInt());scanner.nextLine();
        System.out.println("Введите автора книги ");
        System.out.print("Сколько авторов у книги: ");
        int countAuthors = scanner.nextInt();scanner.nextLine();
        Author[] authors = new Author[countAuthors];
        for (int i = 0; i < authors.length; i++) {
            Author author = new Author();
            System.out.println("Имя автора "+(i+1)+": ");
            author.setName(scanner.nextLine());
            System.out.println("Фамилия автора: ");
            author.setLastname(scanner.nextLine());
            authors[i] = author;
            }
        
        book.setAuthors(authors);
        return book;
    }
    
    
    private Reader addReader(){
        Reader reader = new Reader();
        System.out.println("Имя читателя");
        reader.setName(scanner.nextLine());
        System.out.println("Фамилия читателя");
        reader.setFamilyname(scanner.nextLine());
        System.out.println("Телефон читателя");
        reader.setTelephone(scanner.nextLine());
        return reader;
    }
    
    private History addHistory(){
        History history= new History();
        System.out.println("Список книг:");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                StringBuilder sbAuthorNames = new StringBuilder();
                for (int j = 0; j < books[i].getAuthors().length; j++) {
                    sbAuthorNames.append(books[i].getAuthors()[j].getName())
                            .append(" ")
                            .append(books[i].getAuthors()[j].getLastname())
                            .append(". ");
                }
                System.out.println(i+1
                        +". "+books[i].getBookName()
                        +". "+books[i].getPublishedYear()
                        +". "+sbAuthorNames.toString());
            }
        }
        System.out.print("Выберите номер книги: ");
        int numberBook= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Список читателей:");
        for (int i = 0; i < readers.length; i++) {
            if (readers[i] != null) {
                System.out.println(i+1+". "+readers[i].toString());
            }
        }
        System.out.print("Выберите номер читателя: ");
        int numberReader=scanner.nextInt();
        scanner.nextLine();
        history.setBook(books[numberBook-1]);
        history.setReader(readers[numberReader-1]);
        Calendar c = new GregorianCalendar();
        history.setGivenDate(c.getTime());
        
        return history;
    }
   
    
}

   
    
    
    

