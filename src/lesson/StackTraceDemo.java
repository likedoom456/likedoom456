package lesson;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.net.URL;

/**
 * Created by Administrator on 2016/7/7.
 */
public class StackTraceDemo {
    public static void main(String[] args) {
        try
        {
            URL url=new URL(args[0]);
            InputStream src=url.openStream();
            OutputStream dest=new FileOutputStream(args[1]);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
