public class Maintenance {
    private String dateOfMaintenance;
    private String workDone;

    /**
     * Default constructor
     */
    public Maintenance(){
        dateOfMaintenance = "";
        workDone = "";
    }

    /**
     * Constructor of a maintenance slip
     * @param date The day the work was performed
     * @param work What the work consisted of
     */
    public Maintenance(String date, String work){
        dateOfMaintenance = date;
        workDone = work;
    }

    /**
     * Gets the date of the maintenance
     * @return dateOfMaintence
     */
    public String getDateOfMaintenance(){
        return dateOfMaintenance;
    }

    /**
     * Gets the description of the work that was done.
     * @return workDone
     */
    public String getWorkDone(){
        return workDone;
    }

    /**
     * Sets the day of the maintenance
     * @param date the day of the maintenance
     */
    public void setDateOfMaintenance(String date){
        dateOfMaintenance = date;
    }

    /**
     * Sets the description of the work done
     * @param work the description of the work done
     */
    public void setWorkDone(String work){
        work = workDone;
    }

    /**
     *
     * @return Date of maintenance, then on another line the description of the work done.
     */
    public String toString(){
        return "Date of maintenance: " + dateOfMaintenance +"\n" +
                "Work Done: " + workDone;
    }
}
