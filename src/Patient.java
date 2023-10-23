public class Patient {
    int id;
    private String name;
    private String email;
    private String address;
    private String birthday;
    private double weight;
    private double height;
    private String blood;
    private String phoneNumber;

    Patient(String name,String email){
        this.name = name;
        this.email = email;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 9){
            System.out.println("El numero de telefono debe ser de 9 digitos maximo");
        } else if (phoneNumber.length() == 9) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("El numero de telefono debe tener 9 digitos");
        }
    }
}
