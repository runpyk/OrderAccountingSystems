public class Device {
    private String name;
    private String model;
    private String problemType;
    private int requestNumber;

    public String getName ()
    {
        return name;
    }
    public String getModel ()
    {
        return model;
    }
    public String getProblemType()
    {
        return problemType;
    }
    public int getRequestNumber()
    {
        return requestNumber;
    }
    public void setRequestNumber(int requestNumber)
    {
        this.requestNumber=requestNumber;
    }
    public void setName (String name)
    {
        this.name=name;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public void setProblemType(String problemType)
    {
        this.problemType = problemType;
    }

}
