package exercise.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2016/7/7.
 */
public class Copy {
    public static void main(String[] args)throws IOException {
        IO.dump(
                new FileInputStream("d:/hi"),
                new FileOutputStream("d:/hello")
        );
    }
}
