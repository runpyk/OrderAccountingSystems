public class Main {
    public static void main(String[] args) {
        //Employee massage = new Employee("Дмитрук О.В ", " Інженер");
       // Employee massage2 = new Employee("Гуцалюк А.В ", " Інженер");
        //Result massage = new Result(1, 1000, 32, 2 );
        // System.out.println(massage.PQ());
       // System.out.println(massage2.PQ());
        //Device deviceDell = new Device("Dell","P75", 3, 21) ;
        //String[] deviceDellProblemType = deviceDell.getProblemType();
        MainFrame myFrame = new MainFrame();
        Menu Menu = new Menu();
        Workers Workers = new Workers();
        //System.out.println(massage.ResultMessage());

        //System.out.println("Проблема: ");
        //for (int i = 0;i<3;i++)
        //{
        //System.out.println(deviceDellProblemType[i]);
        //}
        Multi m1 =new Multi("thread-1");
        m1.start();
        Multi m2 =new Multi("thread-2");
        m2.start();
        //DatabaseHanler dbHendler = new DatabaseHanler();
        //dbHendler.writeApp("Gutsal",10,5182);
    }

}
