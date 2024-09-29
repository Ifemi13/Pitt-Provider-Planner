class Doctor {

    String name;
    String title;
    int timeAvail;
    String timeString;
    String appointmentTypes;
    int day;


    public Doctor() {
        name = " ";
        title = " ";
        timeAvail = 0;
        timeString = " ";
        day = 0;
        appointmentTypes = " ";
    }

    public Doctor(String n, int d, String tI, int tA, String a, String tS){
        name = n;
        title = tI;
        timeAvail = tA;
        appointmentTypes = a;
        day = d;
        timeString = tS;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String t){
        title = t;
    }

    public int getDay(){
        return day;
    }

    public void setDay(int d){
        day = d;
    }

    public int getTimeAvail(){
        return timeAvail;
    }

    public void setTimeAvail(int t){
        timeAvail = t;
    }

    public String getTimeString(){
        return timeString;
    }

    public void setTimeString(String tS){
        timeString = tS;
    }

    public String getAppointmentTypes(){
        return appointmentTypes;
    }

    public void setAppointmentTypes(String a){
        appointmentTypes = a;
    }

    // end of all of the get and set methods for the doctor class

/*
    public String[] toString(){
        String[] returnString = new Sttring[4];
        n;
        tI = title;
        tA = timeAvail;
        a = appointmentTypes;
    }
    */
    
}