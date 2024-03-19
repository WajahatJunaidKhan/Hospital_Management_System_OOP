/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.io.*;
import java.io.BufferedWriter;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
public class calbill{

public  calbill(int i)
{
        patient pat=patient.plist.stream().filter(p->p.id==i).findFirst().orElse(null);
        
    File N= new File("C:\\Users\\3m\\Desktop\\project.java\\src\\project\\"+pat.name+".txt");
    try{
        
        if(N.createNewFile())
        {
            System.out.println("File created Successfully");
        }
        else
        {
            System.out.println("File Already Exists");
        }
    }catch(Exception e)
    {
        System.out.println(e);
    }
    
     
    try {
        double total=0;
       FileWriter Nw=new FileWriter(N,true);
        BufferedWriter  bw = new BufferedWriter (Nw );
        bw.write("\t\t\t\t"+admin.hosname);
        bw.write("\n--------------------------------------------------------------------------------");
        bw.write("\nPatient id:\t\t\t\t\t\t\t"+pat.id);
        bw.write("\nPatient Name:\t\t\t\t\t\t\t"+pat.name);
        bw.write("\nPatient Age :\t\t\t\t\t\t\t"+pat.age);
        bw.write("\nDoctor name :\t\t\t\t\t\t\t"+pat.doc.name);
        bw.write("\nDoctor visit charges:\t\t\t\t\t\t"+pat.doc.chargepervisit);
        bw.write("\nNo of Doctor visit:\t\t\t\t\t\t"+pat.doc.nvisit);
        bw.write("\nCheck in Date :\t\t\t\t\t\t\t"+pat.checkin);
        bw.write("\nCheck out :\t\t\t\t\t\t\t"+pat.checkout);
        bw.write("\nBed charges:\t\t\t\t\t\t\t"+pat.bed.bedcharges);
        bw.write("\nNo of days :\t\t\t\t\t\t\t"+pat.ndays);
        bw.write("\n--------------------------------------------------------------------------------");
        bw.write("\nMedicine Record:\n");
        bw.write("Medicine Id   \tMedicine Name\t  Medicine Quatity\t\tMedicine Price\n");
        for(int x=0;x<pat.meds.size();x++)
        {
           
             bw.write( String.format("%-16s%-18s%-30s%-18s",pat.meds.get(x).id,pat.meds.get(x).name,pat.quan.get(x),pat.meds.get(x).price)+"\n");
             total+=(parseInt(pat.meds.get(x).price)*pat.quan.get(x));
        }
        bw.write("\n--------------------------------------------------------------------------------\n");
        total+=(pat.doc.chargepervisit*pat.doc.nvisit)+(pat.bed.bedcharges*pat.ndays);
        bw.write("Total charges:\t\t\t\t\t\t\t"+total);
        bw.close();
        
    } catch (IOException ex) {
        Logger.getLogger(calbill.class.getName()).log(Level.SEVERE, null, ex);
    }
   
}
}
