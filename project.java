/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 *
 * @author 3m
 */
public class project {

   
    public static void main(String[] args) throws ParseException, FileNotFoundException, IOException, InterruptedException {
    

   

    frontdesk f= new frontdesk();
     System.out.println("\n\n\n\n\n\n\n\n\n\n\t\t\t\t\tHOSPITAL MANAGEMENT SYSTEM\n\n\n\n\n\n\n\n\n\n\n\n");
    admin a = new admin(1,"Muhammad",15,"03400293434","421010101324");
    Thread.sleep(4000);
    f.adddoctor("Ali","Nephrologists","04544543454");
    f.adddoctor("Zain","Dermatologist","05434533453");
    f.adddoctor("Daniyal", "physcologist","05464504343");
    Thread.sleep(4000);
    f.addpatient("Rehman",22,"03400293232","A-3 xsrx","01/01/2000");
    f.addpatient("Zohaib",18,"03403293232","A-5 xsrx","05/05/2003");
    a.showpat();
    a.bedreport();
    f.dvisit(1);
    f.checkout(1,"05/01/2000");
    f.checkout(2,"15/05/2003");
    a.bedreport();
    a.addstaff("Dan",22,"421011618234","03400293434");
    a.showstaff();   
    
    
    }
    
}
