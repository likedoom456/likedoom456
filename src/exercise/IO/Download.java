package exercise.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * Created by Administrator on 2016/7/7.
 */
public class Download {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.taobao.com");
            InputStream src = url.openStream();
            OutputStream dest = new FileOutputStream("d:/index.html");
            IO.dump(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
