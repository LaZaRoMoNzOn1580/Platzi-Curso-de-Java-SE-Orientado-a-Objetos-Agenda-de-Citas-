public class Doctor {

    static int id = 0;
    String name;
    String speciality;

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

}
