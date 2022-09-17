import java.util.stream.Stream;

public class Application {
    private String repairMan;
    private int deadline;
    private int requestNumber;

    public Application (String repairMan,int deadline, int requestNumber)
    {
        this.deadline = deadline;
        this.repairMan = repairMan;
        this.requestNumber = requestNumber;
    }
    public int getRequestNumber() {
        return requestNumber;
    }
    public int getDeadline() {
        return deadline;
    }
    public String getRepairMan ()
    {
        return repairMan;
    }
    public void setRequestNumber (int requestNumber)
    {
        this.requestNumber=requestNumber;
    }
    public void setRepairMan (String repairMan)
    {
        this.repairMan=repairMan;
    }
    public void setDeadline (int deadline)
    {
        this.deadline = deadline;
    }
}