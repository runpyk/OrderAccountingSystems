public class Main {
    public static void main(String[] args) {
        //Employee massage = new Employee("Дмитрук О.В ", " Інженер");
       // Employee massage2 = new Employee("Гуцалюк А.В ", " Інженер");
        // System.out.println(massage.PQ());
       // System.out.println(massage2.PQ());
        Device gadJet = new Device("Dell","P75", 3, 21) ;
        String[] e = gadJet.getProblemType();
        for (int i = 0;i<3;i++)
        {
        System.out.println(e[i]);
        }
    }

}
