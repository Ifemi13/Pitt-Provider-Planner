import java.io.*;
import java.util.*;


class readCalendarFile{

    ArrayList<Student> studentInfo = new ArrayList<>();

    public void readCalender(){
        try(Scanner file = new Scanner(new File("student schedule info.txt"))){
            System.out.println("Found");

            while(file.hasNextLine()){
                Student s = new Student();

                String commitment = file.nextLine();
                String location = file.nextLine();
                String dayString = file.nextLine();
                String time = file.nextLine();

                //for extra spaces
                String s1 = file.nextLine();
                String s2 = file.nextLine();

                s.setNameOfCommitment(commitment);
                s.setLocation(location);
                
            }


        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }

    
}