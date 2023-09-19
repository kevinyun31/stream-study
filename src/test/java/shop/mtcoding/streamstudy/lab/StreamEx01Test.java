package shop.mtcoding.streamstudy.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamEx01Test {

    @Test
    public void ex06() {
        List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);

        // 중복 제거, 정렬
        List<Integer> newList = list.stream()
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        // 값 출력하기
        newList.forEach(i -> System.out.print(i + " "));
    }

    // 중복을 제거하고, 오름차순 정렬하기
    @Test
    public void ex05() {
        List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        List<Integer> newList = new ArrayList<>();

        // 1. list -> newList에 깊은 복사하기
        for (Integer t : list) {
            newList.add(t);
        }

        // 2. newList에서 동일한 값 제거하기
        for (int i = 0; i < newList.size(); i++) {
            for (int j = i + 1; j < newList.size(); j++) {
                if (newList.get(i) == newList.get(j)) {
                    newList.remove(j);
                }
            }
        }

        // 3. 오름차순 정렬하기
        for (int i = 0; i < newList.size(); i++) {
            for (int j = 0; j < newList.size(); j++) {

            }
        }

    }

    // 중복 제거하기
    @Test
    public void ex04() {
        List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        List<Integer> newList = new ArrayList<>();

        // 1. list -> newList에 깊은 복사하기
        for (Integer t : list) {
            newList.add(t);
        }

        // 2. newList에서 동일한 값 제거하기
        for (int i = 0; i < newList.size(); i++) {
            for (int j = i + 1; j < newList.size(); j++) {
                if (newList.get(i) == newList.get(j)) {
                    System.out.print("i값 : " + newList.get(i) + ", ");
                    System.out.print("j값 : " + newList.get(j));
                    System.out.println();
                    newList.remove(j);
                }
            }
        }

        // 3. 값 출력하기
        for (Integer i : newList) {
            System.out.print(i + " ");
        }
    }

    @Test
    public void ex03() {
        List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        List<Integer> lowList = new ArrayList<>();
        List<Integer> highList = new ArrayList<>();

        // 얕은 복사
        lowList = list;

        // 깊은 복사
        for (Integer i : list) {
            highList.add(i);
        }

    }

    @Test
    public void ex02() {
        List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);

        Stream<Integer> stream = list.stream();
        stream.distinct().forEach(t -> {
            System.out.println(t);
        });
    }

    @Test
    public void ex01() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);

        Stream<Integer> stream = list.stream();
        stream.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println(t);
            }
        });
    }
}
