class Doctor {

    String name;
    String title;
    String timeAvail;
    String appointmentTypes;
    int day;


    public Doctor() {
        name = " ";
        title = " ";
        timeAvail = " ";
        day = 0;
        appointmentTypes = " ";
    }

    public Doctor(String n, int d, String tI, String tA, String a){
        name = n;
        title = tI;
        timeAvail = tA;
        appointmentTypes = a;
        day = d;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        n = name;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String t){
        t = title;
    }

    public int getDay(){
        return day;
    }

    public void setDay(int d){
        d = day;
    }

    public String getTimeAvail(){
        return timeAvail;
    }

    public void setTimeAvail(String t){
        t = timeAvail;
    }

        public String getAppointmentTypes(){
        return appointmentTypes;
    }

    public void setAppointmentTypes(String a){
        a = appointmentTypes;
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