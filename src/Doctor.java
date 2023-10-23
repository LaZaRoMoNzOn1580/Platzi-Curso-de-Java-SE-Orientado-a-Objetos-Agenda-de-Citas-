import java.util.ArrayList;
import java.util.Date;

public class Doctor {

    static int id = 0;
    private String name;
    private String email;
    private String speciality;

    Doctor(String Name, String Speciality){
        this.name = Name;
        this.speciality = Speciality;
        id++;
    }

    // Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println(id);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableApoointment(Date date,String time){
        availableAppointments.add(new AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public static class AvailableAppointment {
        private int id_availableAppointment;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId_availableAppointment() {
            return id_availableAppointment;
        }

        public void setId_availableAppointment(int id_availableAppointment) {
            this.id_availableAppointment = id_availableAppointment;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}
