import DatabaseEntities.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        /*HospitalDB hdb=new HospitalDB();
        hdb.addDoctor("Harry Sullivan","7878","RSM3.08");
        hdb.addPatient("Martin Holloway","876","London");
        hdb.addPatient("Jem Godfery","456","Birmingham");
        hdb.contactAll("Visiting time is over");*/

        Doctor doc=new Doctor("Harry Sullivan","7878","RSM3.08");
        Patient pat=new Patient("Martin Holloway","876","London");


        ArrayList<Locatable> llist=new ArrayList<>();
        ArrayList<Contactable> clist=new ArrayList<>();

        llist.add(doc);
        llist.add(pat);

        clist.add(doc);
        clist.add(pat);

        for(Locatable l:llist)
            System.out.println(l.getLoc());

        for(Contactable c:clist)
            c.contact("hello");




    }
}
