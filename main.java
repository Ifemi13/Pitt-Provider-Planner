class PittPlanner {

    public static void main(String args[]){

        //System.out.println("Test");

        System.out.println("Welcome to Pitt Provider Planer!\n");

        readDataFile data = new readDataFile();
        data.readDoctorData();

        data.printDoctorAvail();

        

    }

}

//