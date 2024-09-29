import java.io.*;
import java.util.*;

class readDataFile {


    String doctorName;
    String doctorTitle;
    String time;
    String appointmentType;
    int day;

    ArrayList<Doctor> doctorInfo = new ArrayList<>();

    public void readDoctorData(){
        try(Scanner file = new Scanner(new File("doctor info.txt"))) {
            System.out.println("Found.");
            //for intial starting of file
            String s = file.nextLine();
            String s2 = file.nextLine();
            String s3 = file.nextLine();
            while(file.hasNextLine()){
                Doctor d = new Doctor();
                doctorName = file.nextLine();
                String dayString = file.nextLine();
                time = file.nextLine();
                appointmentType = file.nextLine();

                //for extra spaces
                String s4 = file.nextLine();
                String s5 = file.nextLine();
                
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

                d.setDay(day);

                doctorInfo.add(d);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
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
