package exercise;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 2016/7/10.
 */
public class Download {
    private static final String link = "http://www.vladstudio.com/zh/wallpapers/?skip=0";

    public static void main(String[] args) throws MalformedURLException {
        int counter = 0;
        URL url = new URL(link);
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("img")) {
                    String imgURL = line.substring(line.indexOf("http"), line.indexOf("\" alt"));

                    counter++;
                    save(imgURL,counter);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void save(String url, int a) throws MalformedURLException {
        URL link = new URL(url);
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(link.openStream());
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("d:/" + a+".jpg"))) {
            int b;
            while ((b = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

