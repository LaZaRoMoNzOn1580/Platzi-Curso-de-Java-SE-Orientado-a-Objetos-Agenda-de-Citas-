import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctorLarry = new Doctor("Larry");
        myDoctorLarry.showName();
        myDoctorLarry.showId();

        Doctor myDoctorLion = new Doctor("Lion");
        myDoctorLion.showName();
        myDoctorLion.showId();

        showMenu();

    }


}
