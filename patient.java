/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 3m
 */
public class patient extends Person {
public static ArrayList<patient> plist=new ArrayList<patient>();
    Scanner s= new Scanner(System.in);     
    public static int temp=0;
    public String paddress;
    public doctor doc;
    public Bed bed;
    public String checkin;
    public String checkout;
    public long ndays;
    public ArrayList<Integer> quan= new ArrayList<Integer>();
    public ArrayList<medicine> meds=new ArrayList<medicine>();
    public void assignid()
    {
           temp++;
           id=temp;
    }
    
    public patient(String _name,int _age,String number ,String address,String checkin) throws IOException, InterruptedException{
   
        assignid();
        name=_name;
        age=_age;
        contactnumber=number;
        paddress=address;
        doc=null;
        this.checkin=checkin;
        
    }
    
    public void AssignDoctor(doctor doc){
        this.doc=doc;
    }
    public void assignbed(Bed b)
    {
        bed=b;
    }
    
    public void medprescribe() throws FileNotFoundException, IOException
    {

        File fm= new File("C:\\Users\\3m\\Desktop\\project.java\\src\\project\\Medicine.txt");
        Boolean pres= true;
        Boolean found = false;
        while(pres==true)
        {
            System.out.print("Enter Medicine id :\t");
            var mid=s.next();
            System.out.print("Enter Quantity :\t");
            int quantity = s.nextInt();
            BufferedReader bm=new BufferedReader(new FileReader(fm)); 
            String Buffer;
            while((Buffer=bm.readLine())!=null){
                    
                String arr[]=Buffer.split(",");
                if(arr[0].equals(mid))
                {
                    found = true;
                    meds.add(new medicine( arr[0], arr[1], arr[2]));
                    quan.add(quantity);
                    break;
                }
                    
            
            }
            
            if(!found){
                System.out.println("Medicine not foound....");
            }
            System.out.print("Want to add another medicine? : true/false:\t");
            pres=s.nextBoolean();
          
        }
          if(pres==false)
            {
                getMed();
            }
    }
    
        
    public void getMed() 
    {
        System.out.println("-------------------------------------------------------");
        
            System.out.println("Medicine Id\tMedicine Name\tMedicine Price\tMedicine Quantity ");
        for(int i=0;i<meds.size();i++)
        {   
            System.out.printf("%-16s%-16s%-17s%-14s\n",meds.get(i).id,meds.get(i).name,meds.get(i).price,quan.get(i));
        }
        System.out.println();
    }
        
        


    
public String toString()
    {
        return("\n"+id+" \t\t"+name+" \t\t"+age+" \t"+" Dr."+doc.name+" \t"+bed.wardname+" \t\t"+bed.bednumber);
    }

      
}
