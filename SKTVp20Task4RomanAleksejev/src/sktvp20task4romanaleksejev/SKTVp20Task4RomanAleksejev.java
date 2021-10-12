/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sktvp20task4romanaleksejev;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author user
 */
public class SKTVp20Task4RomanAleksejev {
    
   
    public static void main(String[] args) {
        // Создать программу, которая выводит в консоль одномерный массив 
        //(new int[100]) нечетных случайных чисел от 0 до 100 
        //(выводить в консоль по десять чисел в одном ряду). 
        //Отсортировать массив и посчитать среднее арифметическое всех чисел 
        //массива.
        
        int [] nums = new int[100];
        int min = 0, max = 100;
        for(int i=0; i<nums.length;i++){
                if(min%2 ==0)++min;
                nums[i]=min + 2*ThreadLocalRandom.current().nextInt((max-min)/2+1);
            
        }
        
        for (int i = 1; i < 1+nums.length; i++) {
                
                System.out.printf("%4d",nums[i-1]);
                if (i%10==0){
                System.out.println();
                }
        }
        
        System.out.println("С сортировкой");
        Arrays.sort(nums);
        for (int i = 1; i < 1+nums.length; i++) {
                
                System.out.printf("%4d",nums[i-1]);
                if (i%10==0){
                System.out.println();
                }
        }
        
        System.out.println("среднее арифметическое всех чисел массива.");
        double srednee=0;
        for (int i = 0; i < nums.length; i++) {
                srednee+=nums[i];
        }
        srednee/=100;
                System.out.println(srednee);
                
                
                
        
        
        
    }
    
}
