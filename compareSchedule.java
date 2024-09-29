import java.util.*;

public class compareSchedule{
    int day;
    int time; 
    public boolean isClashing(int inDay,int inTime){
        if((this.day == inDay) && (this.time == inTime))
            return true;
        else
            return false;
    }


    HashMap<String, ArrayList<String>> studentAvail = new HashMap<>();
    public void getStudentAvailability(Student s){



    }

    HashMap<String, ArrayList<String>> doctorAvail = new HashMap<>();
    public void getDoctor(Doctor d){
        
    }


    public ArrayList<Doctor> availableDoctors(Doctor d, Student s){
        ArrayList<Doctor> availDocs = new ArrayList<>();



        return availDocs;
    }
}
