package main.java.com.kiryakmax;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TaskOne tskone1 = new TaskOne(new int[]{3, 8, 15, 17, 14});
        TaskOne tskone2 = new TaskOne(new ArrayList<>(Arrays.asList(3, 8, 15, 17, 14)));

        System.out.println(Arrays.toString(tskone1.searchSumReturnArray(23)));
        System.out.println(tskone2.searchSumReturnArrayList(23));

        System.out.println(Arrays.toString(TaskOne.searchSumReturnArray(new int[]{3, 8, 15, 17, 14}, 23)));
        System.out.println(TaskOne.searchSumReturnArrayList(new ArrayList<>(Arrays.asList(3, 8, 15, 17, 14)),23));

        System.out.println("\n===============================================================================================");
        System.out.println("===============================================================================================\n");

        TaskTwo tsktwo1 = new TaskTwo(new int[] {4,5,6,6,8});
        TaskTwo tsktwo2 = new TaskTwo(new ArrayList<Integer>(Arrays.asList(4,5,6,6,8)));

        System.out.println(tsktwo1.hasDuplicatesArray());
        System.out.println(tsktwo1.hasDuplicatesArray(new int[]{4,5,6,7,8}));

        System.out.println(tsktwo2.hasDuplicatesArrayList());
        System.out.println(tsktwo2.hasDuplicatesArrayList(new ArrayList<>(Arrays.asList(4,5,6,7,8))));
    }
}
