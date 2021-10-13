/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class Goods {
    private int goodsID;
    private String goodsName;
    private String goodsLabel;
    private double goodsPrice;
    private int goodsАmount;

    public Goods() {
    }
    
    public void newGoods() {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
    
    public void addGoods(){
        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {

            writer.write("ID:"+goodsID+" Name:"+goodsName+" Label:"+goodsLabel+" Price:"+goodsPrice+" Amount:"+goodsАmount);             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    }
    
    
    public void readGoods(){
        try(FileReader reader = new FileReader("notes3.txt"))
        {
           // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                 
                System.out.print((char)c);
            } 
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }       
    }
    
    
    public int getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(int goodsID) {
        this.goodsID = goodsID;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsLabel() {
        return goodsLabel;
    }

    public void setGoodsLabel(String goodsLabel) {
        this.goodsLabel = goodsLabel;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoodsАmount() {
        return goodsАmount;
    }

    public void setGoodsАmount(int goodsАmount) {
        this.goodsАmount = goodsАmount;
    }
    
    
    
}
