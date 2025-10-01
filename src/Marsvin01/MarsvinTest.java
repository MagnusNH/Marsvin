package Marsvin01;

import java.io.*;

public class MarsvinTest {
    public static void main(String[] args) {

        File file = new File("Marsvin.csv");

        //Counting number of lines to put in array.
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.readLine() != null) {
                count++;
            }
        } catch (IOException e) {
            System.out.println("Fejl ved læsning: " + e.getMessage());
        }

        Marsvins[] marsvins = new Marsvins[count];

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    String name = parts[0];
                    String race = parts[1];
                    int food = Integer.parseInt(parts[2]);
                    marsvins[i] = new Marsvins(name, race, food);
                    i++;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


