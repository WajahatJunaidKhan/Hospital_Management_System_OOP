/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 3m
 */
public class staff extends Person{
    public static ArrayList<staff> slist=new ArrayList<staff>();
  
    public static int temp=0;
       Scanner s= new Scanner(System.in);  
    public staff(String y1,int _age,String _cnic,String _contactnumber)
    {
       temp++;
        id=temp;
        name=y1;
        age=_age;
        Cnic=_cnic;
        contactnumber=_contactnumber;
      
    }
    public String toString()
    {
       return("\n"+id+"\t\t"+name+"\t\t"+age+"\t"+Cnic+"\t"+contactnumber);
    }
}
