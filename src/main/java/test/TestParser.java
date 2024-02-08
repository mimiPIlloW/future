package test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class TestParser {
    public static void main(String[] args) {
        String url = "";
        String txtFilePath = "C:\\Users\\Doliscinschii Ernest\\Desktop\\parser.txt";

        HashSet<String> filesInTxt = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(txtFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                filesInTxt.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Document doc = Jsoup.connect(url).get();

            Elements fileNames = doc.select(".column.left:nth-child(1)");
            for (Element fileName : fileNames) {
                String[] files = fileName.text().split("\\.sql\\.gz");
                for (String file : files) {
                    String currentFile = file.trim() + ".sql.gz";
                    if (!filesInTxt.contains(currentFile)) {
                        System.out.println("File not found: " + currentFile);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

