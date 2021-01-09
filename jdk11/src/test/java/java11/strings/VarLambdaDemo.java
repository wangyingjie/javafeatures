package java11.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * jdk11 为 long term support => LTS 版本
 * Lambda 中支持 var 变量
 */
public class VarLambdaDemo {

    public static void main(@Deprecated String... args) {
        var list = List.of("a", "b", "c");

        list.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());

        list.stream()
                .map((var s) -> s.toLowerCase()) // doesn't make much sense
                .collect(Collectors.toList());

        Optional.of("2").isEmpty();
        list.stream()
                .map((@NotNull var s) -> s.toLowerCase()) //maybe makes sense
                .collect(Collectors.toList());

        // stream support var variable
        var numbers = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] subset = Arrays.stream(numbers).filter((var a) -> a > 5).toArray();
        for (int i = 0; i < subset.length; i++) {
            System.out.println(subset[i]);
        }
    }

    private @interface NotNull {

    }
}
