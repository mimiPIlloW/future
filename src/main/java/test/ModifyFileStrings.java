package test;

import java.io.*;

public class ModifyFileStrings {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Doliscinschii Ernest\\Desktop\\dropBase.txt";

        try {
            File fileToModify = new File(filePath);

            BufferedReader reader = new BufferedReader(new FileReader(fileToModify));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String modifiedLine = "DROP TABLE " + line + ";";
                    content.append(modifiedLine).append(System.lineSeparator());
                }
            }

            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileToModify));
            writer.write(content.toString());
            writer.close();

            System.out.println("Файл успешно изменен.");

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

