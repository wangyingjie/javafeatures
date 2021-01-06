package java11.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("StringsDemo")
public class StringsDemo {

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
