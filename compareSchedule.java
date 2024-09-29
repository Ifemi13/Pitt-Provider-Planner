import java.util.*;

public class compareSchedule {

    public static int convertTimeToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return (hours * 60) + minutes;
    }

    public boolean isClashing(int startTime1, int startTime2, int endTime1, int endTime2, String day1, String day2) {
        if (!day1.equals(day2)) {
            return false; 
        }
        return startTime1 < endTime2 && startTime2 < endTime1; 
    }

    HashMap<String, ArrayList<String>> studentAvail = new HashMap<>();
    

    public void getStudentAvailability(ArrayList<Student> studentInfo) {
        for (Student student : studentInfo) {
            String day = getDayString(student.getDay());
            String timeSlot = student.getStartTime() + "-" + student.getEndTime();
            studentAvail.computeIfAbsent(day, k -> new ArrayList<>()).add(timeSlot);
        }
    }

    HashMap<String, ArrayList<String>> doctorAvail = new HashMap<>();
    
    public void getDoctorAvailability(ArrayList<Doctor> doctorInfo) {
        for (Doctor doctor : doctorInfo) {
            String day = getDayString(doctor.getDay());
            String timeSlot = doctor.getTimeString();
            doctorAvail.computeIfAbsent(day, k -> new ArrayList<>()).add(timeSlot);
        }
    }

    private String getDayString(int day) {
        switch (day) {
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            default: return "Invalid Day";
        }
    }

    public ArrayList<String> availableDoctors(Doctor d, Student s) {
        ArrayList<String> availDocs = new ArrayList<>();
        String day = getDayString(d.getDay()); 

        if (studentAvail.containsKey(day)) {
            ArrayList<String> doctorSlots = doctorAvail.get(day);
            ArrayList<String> studentSlots = studentAvail.get(day);

            for (String doctorSlot : doctorSlots) {
                boolean isClashing = false;
                String[] doctorTimes = doctorSlot.split("-");
                int docStartTime = convertTimeToMinutes(doctorTimes[0]);
                int docEndTime = convertTimeToMinutes(doctorTimes[1]);

                for (String studentSlot : studentSlots) {
                    String[] studentTimes = studentSlot.split("-");
                    int studStartTime = convertTimeToMinutes(studentTimes[0]);
                    int studEndTime = convertTimeToMinutes(studentTimes[1]);

                    if (isClashing(docStartTime, studStartTime, docEndTime, studEndTime, day, day)) {
                        isClashing = true;
                        break; 
                    }
                }

                if (!isClashing) {
                    availDocs.add("Available Slot: " + doctorSlot + " on " + day);
                }
            }
        }

        return availDocs;
    }
}
