package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType){
        //userType = 1 Doctor
        //userType = 2 Patient
        ArrayList<Doctor> Doctors = new ArrayList<>();
        Doctors.add(new Doctor("Larry","larry@gmail.com"));
        Doctors.add(new Doctor("Manuel","Manu@gmail.com"));
        Doctors.add(new Doctor("Lion","Lion@gmail.com"));

        ArrayList<Patient> Patients = new ArrayList<>();
        Patients.add(new Patient("Roberto","Rob@gmail.com"));
        Patients.add(new Patient("Pepe","Pep@gmail.com"));
        Patients.add(new Patient("Carlos","Carl@gmail.com"));

        boolean emailCorrect  = false;
        do{
            System.out.println("Insert your emeil: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (userType == 1){
                for(Doctor doc: Doctors){
                    if (doc.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario logueado
                        doctorLogged = doc;
                        //ShowDoctorMenu

                    }
                }
            }

            if (userType == 2){
                for(Patient pat: Patients) {
                    if (pat.getEmail().equals(email)) {
                        emailCorrect = true;
                        //Obtener el usuario logueado
                        patientLogged = pat;
                        //ShowPatientMenu
                    }
                }

            }

        }while (!emailCorrect);
    }

    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for(int i = 0;i < 3; i++){
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
