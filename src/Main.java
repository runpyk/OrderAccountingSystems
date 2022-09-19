import java.io.IOException;

import java.io.*;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException {

        Device gadJet = new Device("Dell","P75", 3, 21) ;
        String[] e = gadJet.getProblemType();
        System.out.println("Проблема: ");

        File file = new File("problem.txt");
        FileWriter writer = new FileWriter(file.getAbsolutePath(),true);
        writer.write("HASHSET");

        writer.close();
        FileReader reader = new FileReader(file.getAbsolutePath());
        BufferedReader bufferedReader = new BufferedReader(reader);
        String fileStrings;
        ArrayList<String> arrayList = new ArrayList<>();
        while( (fileStrings = bufferedReader.readLine()) != null) {
            arrayList.add(fileStrings);
        }
        for (int i = 0;i<3;i++)
        {
        System.out.println(e[i]);
        }
    }
    //yu
}
