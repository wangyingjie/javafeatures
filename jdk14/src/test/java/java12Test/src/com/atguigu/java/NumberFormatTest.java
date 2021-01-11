package java12Test.src.com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author shkstart
 * @create 2019 ���� 8:03
 */
public class NumberFormatTest {
    //֧��ѹ�����ָ�ʽ��
    @Test
    public void testCompactNumberFormat(){
        var cnf = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        System.out.println(cnf.format(1_0000));
        System.out.println(cnf.format(1_9200));
        System.out.println(cnf.format(1_000_000));
        System.out.println(cnf.format(1L << 30));
        System.out.println(cnf.format(1L << 40));
        System.out.println(cnf.format(1L << 50));
    }
}
