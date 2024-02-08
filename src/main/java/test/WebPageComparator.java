package test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebPageComparator {

    public static void main(String[] args) {
        String url = ""; // Замените на реальный URL
        String filePath = "C:\\Users\\Doliscinschii Ernest\\Desktop\\testing.txt"; // Замените на путь к вашему файлу

        try {
            // Парсинг HTML с помощью Jsoup
            Document doc = Jsoup.connect(url).get();

            // Находим элементы с заголовком "File name"
            Elements fileNameHeaders = doc.select("h2:containsOwn(File name)");

            // Если элементы найдены, извлекаем данные из первого
            if (!fileNameHeaders.isEmpty()) {
                Element fileNameHeader = fileNameHeaders.first();

                // Получаем следующий элемент <p>, который содержит данные
                Element dataElement = fileNameHeader.nextElementSibling();

                // Проверяем, что элемент <p> с данными существует
                if (dataElement != null) {
                    // Получение текста из элемента
                    String data = dataElement.text();

                    // Разбиение строк на отдельные элементы по символу переноса строки
                    String[] linesHTML = data.split("\\n");

                    // Создание списка для хранения данных с веб-страницы
                    List<String> webPageData = new ArrayList<>();

                    // Добавляем строки из HTML в список, удаляя лишние пробелы
                    for (String line : linesHTML) {
                        webPageData.add(line.trim());
                    }

                    // Чтение данных из файла
                    List<String> fileData = new ArrayList<>();
                    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                        String fileLine;
                        while ((fileLine = reader.readLine()) != null) {
                            fileData.add(fileLine.trim());
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    // Вывод различий между HTML и файлом
                    // Вывод различий между HTML и файлом
                    for (String lineFromWeb : webPageData) {
                        String[] htmlElements = lineFromWeb.split(" ");
                        for (String htmlElement : htmlElements) {
                            if (!fileData.contains(htmlElement)) {
                                System.out.println("Различие обнаружено в HTML: " + htmlElement);
                            }
                        }
                    }

                    // Вывод различий между HTML и файлом
                    for (String lineFromFile : fileData) {
                        boolean foundInHTML = false;
                        for (String lineFromWeb : webPageData) {
                            if (lineFromWeb.contains(lineFromFile)) {
                                foundInHTML = true;
                                break;
                            }
                        }
                        if (!foundInHTML) {
                            System.out.println("Различие обнаружено в файле: " + lineFromFile);
                        }
                    }

                    for (String lineFromWeb : webPageData) {
                        boolean foundInFile = false;
                        for (String lineFromFile : fileData) {
                            if (lineFromWeb.contains(lineFromFile)) {
                                foundInFile = true;
                                break;
                            }
                        }
                        if (!foundInFile) {
                            System.out.println("Различие обнаружено в HTML: " + lineFromWeb);
                        }
                    }


                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
