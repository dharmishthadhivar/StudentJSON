import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {
    public static void main(String[] args) {

        Student[] stlist = new Student[2];
        ArrayList<Student> stArr=new ArrayList<>();
        Student st = new Student();
        Scanner scid = new Scanner((System.in));
        for(int i=0;i<2;i++)
        {
            stlist[i]=new Student();
            System.out.println("enter id");
            String ID = scid.next();
            stlist[i].setID(ID);
            Scanner scnm = new Scanner((System.in));
            System.out.println("enter name");
            String name = scnm.next();
            stlist[i].setName(name);
            Scanner scadd = new Scanner((System.in));
            System.out.println("enter city");
            String scad = scadd.next();
            stlist[i].setCity(scad);
            System.out.println( stlist[i].getID()+stlist[i].getName()+stlist[i].getCity());
            stArr.add(stlist[1]);
        }

        //convert to json
        Gson gsStudent1=new Gson();
        String St_ObjTojson11 =gsStudent1.toJson(stlist);
        System.out.println(St_ObjTojson11);

        //convert to object
        final GsonBuilder g=new GsonBuilder();
        final Gson gg= g.create();
        Student[] stlist1 = new Student[1];
        stlist1 = gg.fromJson(St_ObjTojson11,Student[].class);
         for(int i=0;i<stlist1.length;i++)
         {
             System.out.println(stlist1[i].getID()+stlist1[i].getName()+stlist1[i].getCity());
         }


    }
}
