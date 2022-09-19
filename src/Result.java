public class Result {
    private int requestNumber;
    private int price;
    private int deadline;
    private int guaranteePeriod;
    public Result(int requestNumber, int price, int deadline, int guaranteePeriod){
        this.requestNumber = requestNumber;
        this.price = price;
        this.deadline = deadline;
        this.guaranteePeriod = guaranteePeriod;
    }
    public Result(){

    }

    public void setRequestNumber(int requestNumber) {
        this.requestNumber = requestNumber;
    }

    public int getRequestNumber() {
        return requestNumber;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRequestPrice() {
        return price;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public int getRequestDeadline() {
        return deadline;
    }

    public void setGuaranteePeriod(int guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public String ResultMessage() {
        String resultMessage;
        resultMessage = "За ремонт, який тривав " + this.deadline + "днів, необхідно сплатити " + this.price +
                " грн. \nНадається гарантійний період в " + this.guaranteePeriod + " р.";

        return resultMessage;
    }
}
