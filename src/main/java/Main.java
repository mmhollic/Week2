public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        HospitalDB hdb=new HospitalDB();
        hdb.addDoctor("Harry Sullivan","7878","RSM3.08");
        hdb.addPatient("Martin Holloway","876","London");
        hdb.addPatient("Jem Godfery","456","Birmingham");
        hdb.contactAll("Visiting time is over");
    }
}
