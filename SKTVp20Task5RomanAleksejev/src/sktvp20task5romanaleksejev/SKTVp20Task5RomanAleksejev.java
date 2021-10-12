/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sktvp20task5romanaleksejev;

import java.util.Arrays;

import java.util.Random;
/**
 *
 * @author user
 */
public class SKTVp20Task5RomanAleksejev {

  
    public static void main(String[] args) {
        // Отсортировать по возрастанию зубчатый массив из 
        //5 строк с 3, 5, 7, 8, 9 - тью ячейками. Заполнить 
        //его случайными числами от 50 до 100 и отсортировать. 
        //Вывести в консоль массив несортированный и сортированный.
        
        Random random = new Random();
        int [][] nums = new int[5][];
        int min = 50, max = 100;
        
        nums[0]=new int[3];
        nums[1]=new int[5];
        nums[2]=new int[7];
        nums[3]=new int[8];
        nums[4]=new int[9];
        
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++){
                nums[i][j]=random.nextInt(max-min+1)+min;
                
            }      
        }

        
        System.out.println("Зубчатый массив без сортировки:");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
            System.out.printf("%4d",nums[i][j]);
            }   
        }
        System.out.println("");
        
        
        int numslength=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
            numslength++;   
            }   
        }
        
        int tempmass[]=new int[numslength];
        int tempint2=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                
                    tempmass[tempint2]=nums[i][j];
                    tempint2++;
            }
        }
        
        System.out.println("Временный одномерный массив ");
        System.out.println(Arrays.toString(tempmass));
        
        
        tempint2=0;
        Arrays.sort(tempmass);
        
        
        System.out.println("Временный одномерный массив с сортировкой ");
        System.out.println(Arrays.toString(tempmass));
        
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                
                    nums[i][j]=tempmass[tempint2];
                    tempint2++;
            }
        }
        
        System.out.println("Зубчатый массив с сортировкой");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
            System.out.printf("%4d",nums[i][j]);
            }   
        }
        
        
        
    }
    
}
