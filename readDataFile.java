import java.io.*;
import java.util.*;

class readDataFile {


    String doctorName;
    String doctorTitle;
    String timeString;
    int time;
    String appointmentType;
    int day;

    ArrayList<Doctor> doctorInfo = new ArrayList<>();

    public void readDoctorData(){
        try(Scanner file = new Scanner(new File("doctor info.txt"))) {
            //System.out.println("Found.");
            //for intial starting of file
            String s = file.nextLine();
            String s2 = file.nextLine();
            String s3 = file.nextLine();
            while(file.hasNextLine()){
                Doctor d = new Doctor();

                doctorName = file.nextLine();
                String[] dName = doctorName.split("Doctor: ");
                doctorName = dName[1];// + " " + dName[2] + " " + dName[3];
                dName = doctorName.split(", ");
                doctorName = dName[0];
                doctorTitle = dName[1];
                //System.out.println(doctorTitle);
                //System.out.println(doctorName);
                d.setTitle(doctorTitle);
                d.setName(doctorName);

                String dayString = file.nextLine();

                timeString = file.nextLine();
                String[] dTime = timeString.split("Time: ");
                timeString = dTime[1];
                //System.out.println(timeString);
                //time = Integer.parseInt(timeString);

                switch(timeString){
                    case "8:00 AM":
                        //timeString = "8:00 AM";
                        time = 800;
                        break;
                    case "8:30 AM":
                        time = 830;
                        break;
                    case "9:00 AM":
                        //timeString = "9:00 AM";
                        time = 900;
                        break;
                    case "9:30 AM":
                        time = 930;
                        break;
                    case "10:00 AM":
                        //timeString = "10:00 AM";
                        time = 1000;
                        break;
                    case "10:30 AM":
                        time = 1030;
                        break;
                    case "11:00 AM":
                        //timeString = "11:00 AM";
                        time = 1100;
                        break;
                    case "11:30 AM":
                        time = 1130;
                        break;
                    case "12:00 PM":
                        //timeString = "12:00 PM";
                        time = 1200;
                        break;
                    case "12:30 PM":
                        time = 1230;
                        break;
                    case "1:00 PM":
                        //timeString = "1:00 PM";
                        time = 1300;
                        break;
                    case "1:30 PM":
                        time = 1330;
                        break;
                    case "2:00 PM":
                        //timeString = "2:00 PM";
                        time = 1400;
                        break;
                    case "2:30 PM":
                        time = 1430;
                        break;
                    case "3:00 PM":
                        //timeString = "3:00 PM";
                        time = 1500;
                        break;
                    case "3:30 PM":
                        time = 1530;
                        break;
                    case "4:00 PM":
                        //timeString = "4:00 PM";
                        time = 1600;
                        break;
                    case "4:30 PM":
                        time = 1630;
                        break;
                    case "5:00 PM":
                        //timeString = "5:00 PM";
                        time = 1700;
                        break;
                    case "5:30 PM":
                        time = 1730;
                        break;
                    case "6:00 PM":
                        //timeString = "6:00 PM";
                        time = 1800;
                        break;
                    case "6:30 PM":
                        time = 1830;
                        break;
                    case "7:00 PM":
                        //timeString = "7:00 PM";
                        time = 1900;
                        break;
                    case "7:30 PM":
                        time = 1930;
                        break;
                    case "8:00 PM":
                        //timeString = "8:00 PM";
                        time = 2000;
                        break;
                    default:
                        time = 0;
                }

                appointmentType = file.nextLine();

                //for extra spaces
                String s4 = file.nextLine();
                String s5 = file.nextLine();
                
                d.setName(doctorName);
                d.setTimeAvail(time);
                d.setTimeString(timeString);
                d.setAppointmentTypes(appointmentType);

                if(dayString.equals("Day: Sunday")){
                    day = 1;
                }else if(dayString.equals("Day: Monday")){
                    day = 2;
                }else if(dayString.equals("Day: Tuesday")){
                    day = 3;
                }else if(dayString.equals("Day: Wednesday")){
                    day = 4;
                }else if(dayString.equals("Day: Thursday")){
                    day = 5;
                }else if(dayString.equals("Day: Friday")){
                    day = 6;
                }else if(dayString.equals("Day: Saturday")){
                    day = 7;
                }

                d.setDay(day);

                doctorInfo.add(d);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    
        //file.close();
    
    }


    //prints out all of the doctors availabilites
    public void printDoctorAvail(){
        System.out.println("\nList of Available Doctors:");
        for(int i = 0; i < doctorInfo.size(); i++){
            Doctor d = doctorInfo.get(i);
            System.out.println(d.getName() + "\t\t " + d.getTimeString());
        }
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
