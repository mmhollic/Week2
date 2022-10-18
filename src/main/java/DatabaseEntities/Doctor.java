package DatabaseEntities;

public class Doctor extends Person {
    private String office;
    public Doctor(String name, String pNum, String office){
        super(name,pNum);
        this.office=office;
    }
    public void contact(String message){
        System.out.println("Paging "+name+" in office "+office+" on number"+num+" "+message);
    }
}
