/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author 3m
 */
import java.text.ParseException;

public class admin extends Person {
    public admin(int _id,String _name,int _age,String _contactnumber,String _cnic)
    {
        this.name=_name;
        this.id=_id;
        this.age=_age;
        this.contactnumber=_contactnumber;
        this.Cnic=_cnic;
    }
    public void addstaff( String y,int _age,String _cnic,String _contactnumber)
    {
        staff.slist.add(new staff( y,_age,_cnic,_contactnumber));
    }
    
    public void showstaff()                                     //dispaly staffs
    {
        System.out.println("Staff id\tStaffname\tage\tcnic\t\tContactnumber");
        System.out.println(staff.slist);
        System.out.println("---------------------------------------------------");
    }
    public void showpat()                                     //display patients
    {
        System.out.println("Patienid\tpatientname\tage\tDr.name\t\twardname\tbednumber");
        System.out.println(patient.plist);
    }
    
    public void bedreport()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("Wardaname   Bednumber   Status");
        
    
        System.out.println(Bed.blist);
        System.out.println("--------------------------------------------------------");
    }

   
}
