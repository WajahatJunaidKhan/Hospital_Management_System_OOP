/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class medicine {
public String id;
public String name;
public String price;


public medicine(String id , String name , String price){
    this.id = id;
    this.name=name;
    this.price = price;
        
}

public static void getlist()
{   
    try{
        Scanner s= new Scanner(System.in);
        File fm= new File("C:\\Users\\3m\\Desktop\\project.java\\src\\project\\Medicine.txt");
        BufferedReader bm=new BufferedReader(new FileReader(fm)); 
        String Buffer;
        System.out.println("Medicine id\tMedicine Name\t\tMedicine price");
        while((Buffer=bm.readLine())!=null)
                {
                    String arr[]=Buffer.split(",");
                    System.out.printf("%-16s%-24s%-20s\n",arr[0],arr[1],arr[2]);
                }
    }
    catch(IOException e)
    {
        System.out.println(e);
    }
}
}
