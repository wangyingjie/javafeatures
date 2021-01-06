package java10.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Set")
class SetTest {

    // same for Map.copyOf and Set.copyOf

    @Test
    void shouldCreateAnImmutableCopyOfASet() {
        // given
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Kotlin");
        set.add("Groovy");
        // when
        Set<String> result = Set.copyOf(set);
        // expect
        assertThrows(UnsupportedOperationException.class, () -> result.add("PHP"));

        System.out.println(set.getClass());
        System.out.println(result.getClass());
    }


    @Test
    void shouldImmutableList() {
        var mutableList = new ArrayList<>(List.of(1, 2, 3));
        System.out.println(mutableList.getClass());
        mutableList.add(4);

        var immutableList = mutableList.stream()
                .map(Integer::bitCount)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(immutableList.getClass());
//        immutableList.add(3); // error

        // same for toUnmodifiableMap, toUnmodifiableSet
    }

}
