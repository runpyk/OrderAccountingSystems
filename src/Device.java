import java.util.Scanner;
public class Device {
    private String name;
    private String model;
    private String[] problemType;
    private int requestNumber;
    private int arraySize;

    public Device (String name, String model,int arraySize, int requestNumber)
    {
        this.name= name;
        this.requestNumber = requestNumber;
        this.model= model;
        this.problemType = new String[arraySize];
        this.arraySize = arraySize;
        for (int i = 0;i<arraySize;i++)
        {
            Scanner in = new Scanner(System.in);
            String problem = in.nextLine();
            problemType[i]=problem;
        }
    }
    public String getName ()
    {
        return name;
    }
    public String getModel ()
    {
        return model;
    }
    public String[] getProblemType()
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
    public void setProblemType(String[] problemType) {
        this.problemType = problemType;
    }

}
