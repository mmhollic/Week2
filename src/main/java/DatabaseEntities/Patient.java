package DatabaseEntities;

public class Patient extends Person{
    private String ward;
    // Objects of this class hold all of the information for a patient and can contact them
    public Patient(String pname, String pnum, String ward){
        super(pname,pnum);
        this.ward=ward;
    }
    public void contact(String message){
        System.out.println("Calling "+name+" in ward "+ward+" on number"+num+" "+message);
    }
}
