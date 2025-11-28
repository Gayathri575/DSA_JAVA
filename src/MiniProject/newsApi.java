package MiniProject;

import java.util.*;
import java.net.*;
import java.io.*;

public class newsApi {
    private static final String baseurl = "https://newsapi.org/v2/top-headlines?";
    private static final String apiKey = "_place_your_ApIkey";

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Category (sports, technology, business): ");
            String category = sc.nextLine();

            String apiUrl = baseurl + "category=" + category + "&language=en&apiKey=" + apiKey;

            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
            connection.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line, json = "";
            while ((line = br.readLine()) != null) json += line;
            br.close();

            int index = 0;
            while ((index = json.indexOf("\"title\":\"", index)) != -1) {
                int endIndex = json.indexOf("\"", index + 9);
                System.out.println("Title: " + json.substring(index + 9, endIndex));
                index = endIndex + 1;
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

