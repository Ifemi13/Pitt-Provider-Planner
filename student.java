class Student {
    String nameOfCommitment;
    String location;
    String startTime;
    String endTime;
    int day;

    public Student() {
        nameOfCommitment = " ";
        location = " ";
        startTime = " ";
        endTime = " ";
        day = 0;
    }

   public Student(String n, String l, String s, String e, int d){
        nameOfCommitment = n;
        location = l;
        startTime = s;
        endTime = e; 
        day = d;
    }

    public String getNameOfCommitment(){
        return nameOfCommitment;
    }

    public void setNameOfCommitment(String n){
        n = nameOfCommitment;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String l){
        l = location;
    }

    public String getStartTime(){
        return startTime;
    }

    public void setStartTime(String s){
        s = startTime;
    }

    public String getEndTime(){
        return endTime;
    }

    public void setEndTime(String e){
        e = endTime;
    }

    public int getDay(){
        return day;
    }

    public void setDay(int d){
        d = day;
    }
    
}