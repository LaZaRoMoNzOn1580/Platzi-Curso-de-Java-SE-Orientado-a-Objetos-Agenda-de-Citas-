import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

       // showMenu();

        Doctor docLarry = new Doctor("Larry","lmonzongonzalez2019@gmail.com");
        Patient patLion = new Patient("Lion","lmonzongonzalez2019@gmail.com");

        docLarry.addAvailableApoointment(new Date(),"4pm");
        docLarry.addAvailableApoointment(new Date(),"1pm");
        docLarry.addAvailableApoointment(new Date(),"10am");


        /*
        for (model.Doctor.AvailableAppointment a: docLarry.getAvailableAppointments()) {
            System.out.println(a.getDate() + " " + a.getTime());
        }
        */


        /*
        System.out.println(docLarry.toString());

        Patient paciente = new Patient("Lazaro","feo@gmail.com");
        System.out.println(paciente.toString());

        docLarry.showDataUser();
        paciente.showDataUser();
        */


    }


}
