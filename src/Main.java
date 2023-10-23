import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

       // showMenu();

        Doctor docLarry = new Doctor("Larry","lmonzongonzalez2019@gmail.com");
        Patient patLion = new Patient("Lion","lmonzongonzalez2019@gmail.com");

        docLarry.addAvailableApoointment(new Date(),"4pm");
        docLarry.addAvailableApoointment(new Date(),"1pm");
        docLarry.addAvailableApoointment(new Date(),"10am");

        /*
        for (Doctor.AvailableAppointment a: docLarry.getAvailableAppointments()) {
            System.out.println(a.getDate() + " " + a.getTime());
        }
        */

        System.out.println(docLarry.toString());

        Patient paciente = new Patient("Lazaro","feo@gmail.com");
        System.out.println(paciente.toString());

    }


}
