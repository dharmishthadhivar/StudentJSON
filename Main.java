import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;


public class Main {
    public static void main(String[] args) {

        Student st = new Student();
        Scanner scid = new Scanner((System.in));
        System.out.println("enter id");
        String ID = scid.next();
        st.setID(ID);
        System.out.println("id is: " + st.getID());

        Scanner scnm = new Scanner((System.in));
        System.out.println("enter name");
        String name = scnm.next();
        st.setName(name);
        System.out.println("name is: " + st.getName());

        Scanner scct = new Scanner((System.in));
        System.out.println("enter city");
        String city = scct.next();
        st.setCity(city);
        System.out.println("city is: " + st.getCity());
         ArrayList<Object> aa = new ArrayList<Object>();
         aa.add(st);

         Gson gsStudent=new Gson();
         String St_ObjTojson =gsStudent.toJson(st);
         System.out.println(St_ObjTojson);

         Gson gs=new Gson();
         Student St_JsonToobj = gs.fromJson(St_ObjTojson,Student.class);
         System.out.println(St_JsonToobj.StId+  St_JsonToobj.StName+ St_JsonToobj.StCity);

    }
}
