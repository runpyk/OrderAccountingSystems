public class Main {
    public static void main(String[] args) {
        //Employee massage = new Employee("Дмитрук О.В ", " Інженер");
       // Employee massage2 = new Employee("Гуцалюк А.В ", " Інженер");
        Result massage = new Result(1, 1000, 32, 2 );
        // System.out.println(massage.PQ());
       // System.out.println(massage2.PQ());
        Device deviceDell = new Device("Dell","P75", 3, 21) ;
        String[] deviceDellProblemType = deviceDell.getProblemType();
        MainFrame myFrame = new MainFrame();
        //System.out.println(massage.ResultMessage());

        System.out.println("Проблема: ");
        for (int i = 0;i<3;i++)
        {
        System.out.println(deviceDellProblemType[i]);
        }
        

    }
    //o
}
