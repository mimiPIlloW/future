package test;

import java.io.FileWriter;
import java.io.IOException;

public class NumberGeneration {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("C:\\Users\\Doliscinschii Ernest\\Desktop\\test.txt", false)) {
            for (int a = 790000000; a <= 790500000; a++) {
                String result = "962" + String.valueOf(a);
                writer.write(result);
                writer.append("\r\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
