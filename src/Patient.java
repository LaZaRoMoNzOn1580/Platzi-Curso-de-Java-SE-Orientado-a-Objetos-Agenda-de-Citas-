public class Patient extends User {
    private String birthday;
    private double weight;
    private double height;
    private String blood;


    Patient(String name,String email){
        super(name,email);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return this.weight + " Kg.";
    }

    public void setHeight(double height){
        this.height = height;
    }
    public String getHeight() {
        return this.height + " M.";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

}
