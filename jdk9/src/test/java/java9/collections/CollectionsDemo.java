package java9.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author wangyingjie5
 * @date 2021/1/6 14:17
 */
@DisplayName("CollectionsDemo")
public class CollectionsDemo {

    // todo Test Generate ImmutableCollections.ListN/SetN/MapN

    @DisplayName("testCollectionList")
    @Test
    public void testCollectionList() {
        //Immutable：不可变的 ；mutable：可变的

        List<Integer> listN = List.of(1, 2, 3);
        System.out.println(listN.getClass() + "====" + listN);

        Assertions.assertThrows(UnsupportedOperationException.class, () -> listN.add(4));
    }

    @DisplayName("testCollectionSet")
    @Test
    public void testCollectionSet() {
        Set<Integer> setN = Set.of(1, 2, 3);
        System.out.println(setN.getClass() + "====" + setN);

        Assertions.assertThrows(UnsupportedOperationException.class, () -> setN.add(4));
    }

    @DisplayName("testMap")
    @Test
    public void testMap() {
        Map<Integer, String> stringMap = Map.of(
                1, "a",
                2, "b",
                3, "c"
        );
        System.out.println(stringMap.getClass() + "====" + stringMap);

        Assertions.assertThrows(UnsupportedOperationException.class, () -> stringMap.put(4, "c"));
    }

    @DisplayName("testMapPut")
    @Test
    public void testMapPut() {
        Map<Integer, String> stringMap = Map.of(
                1, "a",
                2, "b",
                3, "c"
        );
        System.out.println(stringMap.getClass() + "====" + stringMap);

        stringMap.put(4, "c");
    }

    @DisplayName("testMapOfEntries")
    @Test
    public void testMapOfEntries() {
        Map<Integer, String> stringMap = Map.ofEntries(
                Map.entry(1, "a"),
                Map.entry(2, "b"),
                Map.entry(3, "c")
        );

        System.out.println(stringMap.getClass() + "====" + stringMap);

        stringMap.put(4, "c");
    }

}
