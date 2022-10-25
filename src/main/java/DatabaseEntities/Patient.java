package DatabaseEntities;

public class Patient extends Person implements Contactable, Locatable{
    private String ward;    // The ward name

    // Objects of this class hold all of the information for a patient and can contact them
    public Patient(String pname, String pnum, String ward){
        super(pname,pnum);
        this.ward=ward;
    }
    public void contact(String message){
        // Contacts patients on their bedphones
        System.out.println("Calling "+name+" in ward "+ward+" on number:"+num+":"+message);
    }
    public String getLoc(){
        return super.getLoc()+":"+ward;
    }
}
