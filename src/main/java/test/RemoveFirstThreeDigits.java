package test;

import java.io.*;

public class RemoveFirstThreeDigits {
    public static void main(String[] args) {
        String file_path = "C:\\Users\\Doliscinschii Ernest\\Desktop\\bronumbers.txt";

        try {
            File file = new File(file_path);
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder output = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                if (line.length() >= 3 && line.substring(0, 3).equals("967")) {
                    String newLine = line.substring(3);
                    output.append(newLine).append("\n");
                } else {
                    output.append(line).append("\n");
                }
            }

            br.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(file_path));
            writer.write(output.toString());
            writer.close();

            System.out.println("Если были найдены строки с префиксом '967', то первые три цифры удалены из них.");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}