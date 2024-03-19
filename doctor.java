/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 3m
 */
public class doctor extends Person{
    public static ArrayList<doctor> dlist=new ArrayList<doctor>();
    
    public static int temp=1000;
    public String Dspec;
    public String Username;
    public String pass;
    public int nvisit=0;
    public int chargepervisit=5000;
    public String domain="@xyx.pk";
    
    Scanner s=new Scanner(System.in);
    public  void assignid()
    {
        id=temp;
        temp++;
       
    }
    public doctor(String _name,String spec,String _contactnumber)
    {
        
        assignid();
        name=_name;
        Dspec=spec;
        Username=name+domain;
        pass=assignpass();
        contactnumber=_contactnumber;
        System.out.println("Dr."+name+" Username= "+Username+"\nDr."+name+" Password = "+pass);
        System.out.println("-----------------------------------");
    }
    public static String assignpass()
    {
                String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*";
		Random r = new Random();
		StringBuilder sb = new StringBuilder(5);
		for (int i = 0; i < 5; i++)
                sb.append(chars.charAt(r.nextInt(chars.length())));
		return sb.toString();
	
        
    }
    
}
