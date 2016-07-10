package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 2016/7/10.
 */
public class Download {
    private static final String link="http://www.vladstudio.com/zh/wallpapers/?skip=0";

    public static void main(String[] args) throws MalformedURLException {
        URL url=new URL(link);
        try(BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(url.openStream()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("img")) {
                   String imgURL=line.substring(line.indexOf("http"),line.indexOf("\" alt"));
                    System.out.println(imgURL);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
