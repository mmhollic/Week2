import DatabaseEntities.Doctor;
import DatabaseEntities.Patient;

import java.util.ArrayList;

public class HospitalDB {
    // This class holds a list of doctor objects and a list of patient objects in the hospital
    private ArrayList<Doctor> doctors=new ArrayList<>();
    private ArrayList<Patient> patients=new ArrayList<>();
    public void addDoctor(String name, String pNum, String office){
        Doctor doc=new Doctor(name, pNum, office);
        doctors.add(doc);
    }
    public void addPatient(String name, String bNum, String ward){
        Patient pat=new Patient(name, bNum, ward);
        patients.add(pat);
    }
    public void contactAll(String message){
        // First contact all the doctors
        for (Doctor doc:doctors)
            doc.contact(message);
        // Now contact all the patients
        for (Patient pat:patients)
            pat.contact(message);
    }
}
