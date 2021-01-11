package java12Test.src.com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author shkstart
 * @create 2019 ���� 8:19
 */
public class StringTest {
    @Test
    public void testTransform(){
        String info1 = "  hello".transform(info -> info + "world  ");
        System.out.println(info1);
    }
    //   hello --> helloworld   -->   HELLOWORLD   --> HELLOWORLD
    //ӳ�䣺java 8 �� Stream API :map() \reduce()
    @Test
    public void testTransform1(){
        var info1 = "hello".transform(info -> info + "world").transform(String::toUpperCase).transform(String::trim);
        System.out.println(info1);
    }

    @Test
    public void testTransform2(){
        System.out.println("======test java 12 transform======");
        List<String> list1 = List.of("Java", " Python", " C++ ");
        List<String> list2 = new ArrayList<>();
        list1.forEach(element -> list2.add(element.transform(String::strip)
                .transform(String::toUpperCase)
                .transform(e -> "Hi," + e))
        );
        list2.forEach(System.out::println);
    }

    @Test
    public void testTransform3(){
        System.out.println("======test java 12 transform======");
        List<String> list1 = List.of("Java", " Python", " C++ ");
        Stream<String> strStream = list1.stream().map(word -> word.strip()).map(String::toUpperCase).map(word -> "hello," + word);
        List<String> list2 = strStream.collect(Collectors.toList());
        list2.forEach(System.out::println);
    }

    //String�е�indent()
    @Test
    public void testIndent() {
        System.out.println("======test java 12 indent======");
        String result = "Java\n Python\nC++".indent(3);
        System.out.println(result);
    }
}
