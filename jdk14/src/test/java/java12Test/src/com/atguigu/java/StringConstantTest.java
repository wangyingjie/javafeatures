package java12Test.src.com.atguigu.java;

import java.util.Optional;

/**
 * @author shkstart
 * @create 2019 ���� 5:18
 */
public class StringConstantTest {

    private static void testDescribeConstable() {
        System.out.println("======test java 12 describeConstable======");
        String name = "�й��Java�߼�����ʦ";
        Optional<String> optional = name.describeConstable();
        System.out.println(optional.get());
    }

    public static void main(String[] args) {
        testDescribeConstable();
    }
}
