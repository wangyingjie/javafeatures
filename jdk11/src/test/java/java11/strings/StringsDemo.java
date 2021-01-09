package java11.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("StringsDemo")
public class StringsDemo {

    /**
     * String 类中新的 API
     * JDK 11 中新增的 String API 包括：
     * public String strip() 去除前后的空格
     * public String stripLeading() 去除前面的空格
     * public String stripTrailing() 去除后面的空格
     * public boolean isBlank() 判断是否为空，或者只含有空格
     * public Stream lines() 依据 line terminators (\n \r \r\n) 来进行分割
     * public String repeat​(int count) 将字符串重复n次
     */
    @Test
    void shouldString() {
        System.out.println("\"\".isBlank() = " + "".isBlank());
        System.out.println("\"dog\".repeat(3) = " + "dog".repeat(3));
        System.out.println("\"  dog  \".strip() = " + "  dog  ".strip());
        System.out.println("\"  dog  \".stripTrailing() = " + "  dog  ".stripTrailing());
        System.out.println("\"  dog  \".stripLeading() = " + "  dog  ".stripLeading());

        "line1\nline2".lines()
                .forEach(System.out::println);

    }
}
