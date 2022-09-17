public class Employee {
    private String PIB;
    private String qualification;

    public Employee(String PIB, String qualification){
        this.PIB = PIB;
        this.qualification = qualification;

    }
    public Employee(){

    }

    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    public String getPIB() {
        return PIB;
    }

    public void setQualification(String qualification) {
        this.PIB = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public String PQ() {
        String message;
        message = "ПІБ робітника: " + this.PIB + "Кваліфікація: " + this.qualification;

        return message;

    }
}