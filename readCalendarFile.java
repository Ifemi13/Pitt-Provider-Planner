import java.io.*;
import java.util.*;


class readCalendarFile{

    ArrayList<Student> studentInfo = new ArrayList<>();

    public void readCalender(){
        try(Scanner file = new Scanner(new File("student schedule info.txt"))){
            System.out.println("Found");
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }

    
}