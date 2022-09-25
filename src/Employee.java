abstract class Employee {
     String PIB;
     String qualification;
     public abstract void Work();

    }
    abstract interface Worker{
      void doWork();
    }
    class Accept implements Worker{

        public void doWork() {

        }
    }
   class Repair implements Worker{

    public void doWork() {

    }
   }
    class Acceptor extends Employee{
    public Acceptor(String PIB){
        this.PIB = PIB;
        this.qualification = "Acceptor";
    }
    public void Work(){
        System.out.println("Робітник приймає заявку");

    }
    public void setPIB(String PIB) {
        this.PIB = PIB;
    }
    public String getPIB() {
        return PIB;
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

class Engineer extends Employee{
    public Engineer(String PIB){
        this.PIB = PIB;
        this.qualification = "Engineer";
    }
    public void Work(){
        System.out.println("Робітник ремонтує пристрій");
    }
    public void setPIB(String PIB) {
        this.PIB = PIB;
    }
    public String getPIB() {
        return PIB;
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
