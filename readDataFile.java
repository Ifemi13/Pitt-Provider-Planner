import java.io.*;
import java.util.*;

class readDataFile {


    Doctor doctor;
    String doctorName;
    String doctorTitle;
    String time;
    String appointmentType;
    int day;

    static ArrayList<Doctor> doctorInfo = new ArrayList<>();

    public void readDoctorData(){
        try(Scanner file = new Scanner(new File("doctor info.txt"))) {
            System.out.println("Found.");
            while(file.hasNextLine()){
                Doctor d = new Doctor();
                doctorName = file.nextLine();
                String dayString = file.nextLine();
                time = file.nextLine();
                appointmentType = file.nextLine();
                
                d.setName(doctorName);
                d.setTimeAvail(time);
                d.setAppointmentTypes(appointmentType);

                if(dayString.equals("Sunday")){
                    day = 0;
                }else if(dayString.equals("Monday")){
                    day = 1;
                }else if(dayString.equals("Tuesday")){
                    day = 2;
                }else if(dayString.equals("Wednesday")){
                    day = 3;
                }else if(dayString.equals("Thursday")){
                    day = 4;
                }else if(dayString.equals("Friday")){
                    day = 5;
                }else if(dayString.equals("Saturday")){
                    day = 6;
                }
            }
        } catch (FileNotFoundException e) {
            //error
        }
    
        //file.close();
    
    }


}
/*
we need to use " filesplit(",") "

1. Doctor: Dr. John Smith, MD
   Day: Monday
   Time: 10:00 AM
   Appointment Type: Cardiology Consultation


2. Doctor: Dr. Emily Jones, DO
*/
