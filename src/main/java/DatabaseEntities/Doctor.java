package DatabaseEntities;

public class Doctor extends Person implements Contactable, Locatable{
    private String office;  // The doctor's office - building and room number
    // Objects of this class hold all of the information for a patient and can contact them

    public Doctor(String name, String pNum, String office){
        super(name,pNum);
        this.office=office;
    }
    public void contact(String message){
        // Pages doctors using the special paging hardware system
        System.out.println("Paging "+name+" in office "+office+" on number:"+num+":"+message);
    }
    public String getLoc(){
        return super.getLoc()+":"+office;
    }

}
