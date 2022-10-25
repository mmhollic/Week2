package DatabaseEntities;

public abstract class Person {
    // Superclass of all people in the hospital
    protected String name;
    protected String num;
    public Person(String name, String num){
        this.name=name;
        this.num=num;
    }
    public String getLoc(){
        return "St Nettles's Hospital";
    }

}
