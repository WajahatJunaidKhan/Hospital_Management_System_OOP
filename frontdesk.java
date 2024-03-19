/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * @author 3m
 */
public class frontdesk   {
    public static int temp=0;
    
    Scanner s=new Scanner(System.in);
    public void addpatient(String name,int age,String number ,String address,String in) throws IOException, InterruptedException
    {
         patient.plist.add(new patient(name,age,number,address,in));
         assign(++temp);
    }
    public void adddoctor(String x,String y,String _contactnumber){
        doctor.dlist.add(new doctor(x,y,_contactnumber));
    }
    public void assign(int patientId)
    {
        
        patient pat=patient.plist.stream().filter(p->p.id==patientId).findFirst().orElse(null);
        System.out.println("For Patient "+ pat.name);
        System.out.println("Available Doctors are : "+"\nID\tName\tSpecialization");        
        for(int i=0;i<doctor.dlist.size();i++)
        System.out.println(doctor.dlist.get(i).id+"\t"+doctor.dlist.get(i).name+"\t"+doctor.dlist.get(i).Dspec);
        doctor doc = null;
        Boolean notfound= true;
        while(notfound)
        {
            System.out.print("Enter Doctor id: \t");
            int id=s.nextInt();
        
        
            doc=doctor.dlist.stream().filter(d->d.id==id).findFirst().orElse(null);
        if(doc==null)
        {
            System.out.println("Invalid ID..please retry");
            
        }
        else
        {
        
            notfound=false;
        }
        }
        pat.AssignDoctor(doc);
        System.out.println("Patient name :" + pat.name + " has been assigned to doctor : "+pat.doc.name);
        
        for(int i=0;i<Bed.blist.size();i++)
        {
            if(Bed.blist.get(i).occupied==false)
            {
                Bed.blist.get(i).occupied=true;
                pat.assignbed(Bed.blist.get(i));
                break;
            }
        }
          System.out.println("-----------------------------------------------");
    }

  
public void dvisit(int i) throws FileNotFoundException, IOException
{
    
        patient pat=patient.plist.stream().filter(p->p.id==i).findFirst().orElse(null);
        System.out.println("For Patient :"+pat.name);
        pat.doc.nvisit++;
        medicine.getlist();
        pat.medprescribe();
}

    public void checkout(int x,String checkout) throws ParseException
    {
        patient pat=patient.plist.stream().filter(p->p.id==x).findFirst().orElse(null);
        pat.checkout=checkout;
        Date date1;
        Date date2;
        long sec;
      
                String a;
                int b;
                a=pat.bed.wardname;
                b=pat.bed.bednumber;
                for(int i=0;i<Bed.blist.size();i++)
                {
                    if(Bed.blist.get(i).wardname.equals(a) && pat.bed.bednumber==b)
                    {
                        date1=new SimpleDateFormat("dd/MM/yyyy").parse(pat.checkin);
                        date2=new SimpleDateFormat("dd/MM/yyyy").parse(pat.checkout);
                        sec=date2.getTime()-date1.getTime();
                        pat.ndays= sec  / (1000 * 60 * 60 * 24)% 365;
                        pat.bed.occupied=false;
                        calbill c=new calbill(x);
                        for(int y=0;y<patient.plist.size();y++)
                        {
                            if(x==pat.id)
                            {
                                
                                patient.plist.remove(y);
                            }
                        }
                        break;
                    }
                }
                
                
          
            }
        
}
