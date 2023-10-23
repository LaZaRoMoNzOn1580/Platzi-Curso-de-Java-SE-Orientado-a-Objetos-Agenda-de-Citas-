package ui;

import model.Doctor;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
    public static void showPatientMeu() throws ParseException {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
            }
        }while (response!=0);
    }

    private static void showBookAppointmentMenu(){
        int response = 0;
        do {
            System.out.println("::Book an appointment");
            System.out.println("::Select a date");
            //Numeracion de la lista de fechas
            //Indice de la fecha seleccionada
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;

            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointment.size();i++){
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointment.get(i).getAvailableAppointments();

                Map<Integer,Doctor> doctorAppointments = new TreeMap<>();
                for(int j = 0; j < availableAppointments.size();j++){
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate() );
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointment.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }
            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected  = Integer.valueOf(sc.nextLine());
        } while (response != 0);
    }
}
