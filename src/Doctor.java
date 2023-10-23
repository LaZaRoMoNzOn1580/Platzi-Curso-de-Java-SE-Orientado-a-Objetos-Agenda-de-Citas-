public class Doctor {

    int id;
    String name;
    String speciality;

    Doctor(String Name){
        this.name = Name;
    }

    // Comportamientos
    public void showName(){
        System.out.println(name);
    }

}
