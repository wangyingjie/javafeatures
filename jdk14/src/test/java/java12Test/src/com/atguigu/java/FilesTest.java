package java12Test.src.com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author shkstart
 * @create 2019 ���� 8:46
 */
public class FilesTest {

    //ʹ��IDEA�ĵ�Ԫ���Է�����Ĭ�ϵ����·�����ڵ�ǰmodule��
    //IO : File
    //NIO 2 : Files���������ļ��Ĺ�����  �� Path:�滻ԭ�е�File ; Paths :ʵ����Path
    @Test
    public void testFilesMismatch() throws IOException {
        FileWriter fileWriter = new FileWriter("tmp\\a.txt");
        fileWriter.write("a");
        fileWriter.write("b");
        fileWriter.write("c");
        fileWriter.close();

        FileWriter fileWriterB = new FileWriter("tmp\\b.txt");
        fileWriterB.write("a");
        fileWriterB.write("b");
        fileWriterB.write("c");
        fileWriterB.close();

        System.out.println(Files.mismatch(Path.of("tmp/a.txt"),Path.of("tmp/b.txt")));
    }

}
