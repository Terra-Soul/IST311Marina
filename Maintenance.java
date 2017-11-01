public class Maintenance {
    private String dateOfMaintenance;
    private String workDone;

    public Maintenance(){
        dateOfMaintenance = "";
        workDone = "";
    }

    public Maintenance(String date, String work){
        dateOfMaintenance = date;
        workDone = work;
    }

    public String getDateOfMaintenance(){
        return dateOfMaintenance;
    }

    public String getWorkDone(){
        return workDone;
    }

    public void setDateOfMaintenance(String date){
        dateOfMaintenance = date;
    }

    public void setWorkDone(String work){
        work = workDone;
    }

    public String toString(){
        return "Date of maintenance: " + dateOfMaintenance +"\n" +
                "Work Done: " + workDone;
    }
}
