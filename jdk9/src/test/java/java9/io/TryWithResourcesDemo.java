package java9.io;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TryWithResourcesDemo {

    public void java7() {
        try (Resource resource = new Resource()) {
            System.out.print(resource);
        }
    }

    public void java9() {
        // variable range of 变量作用范围
        Resource resource = new Resource();
        try (resource) {
            System.out.print(resource);
        }

        System.out.print(resource); // Careful with this!
    }

    private class Resource implements AutoCloseable {

        @Override
        public void close() {

        }
    }

    //todo 方法调试报错 java9新特性九：InputStream的新方法:transferTo()
    @Test
    public void test5() {
        ClassLoader cl = this.getClass().getClassLoader();
        try (InputStream is = cl.getResourceAsStream("hello.txt");
             OutputStream os = new FileOutputStream("src\\hello1.txt")) {
            is.transferTo(os); // 把输入流中的所有数据直接自动地复制到输出流中
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
