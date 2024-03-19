/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author 3m
 */
public class Bed {
     public String wardname;
    public int  bednumber;
    public boolean occupied;
    public int bedcharges=5200;
    public static ArrayList <Bed> blist=new ArrayList<Bed>();
    static
    {
        for(char i='A';i<='C';i++)
        {
            for(int j=1;j<=5;j++)
            {
                blist.add(new Bed(Character.toString(i),j));
                
            }
        }
    }
    public Bed(String wnum,int bnum)
    {
        this.bednumber=bnum;
        this.wardname=wnum;
        this.occupied=false;
    }
    public String toString()
    {
        return ("\n"+wardname+"\t\t"+bednumber+"\t"+occupied);
    }
}
