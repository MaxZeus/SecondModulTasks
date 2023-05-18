package main.java.com.kiryakmax;

import java.util.*;

public class TaskOne {
    private int[] array;
    private ArrayList<Integer> arrayList;

    public TaskOne() {}
    public TaskOne(int[] array) {
        this.array = array;
    }
    public TaskOne(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int[] searchSumReturnArray(int number) {
        for (int i = 0; i < this.array.length; i++) {
            for (int j = i; j < this.array.length; j++) {
                if (number == this.array[i] + this.array[j]) {
                    this.array = new int[]{i, j};
                    break;
                }
            }
        }
        return this.array;
    }

    public static int[] searchSumReturnArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (number == array[i] + array[j]) {
                    array = new int[]{i, j};
                    break;
                }
            }
        }
        return array;
    }

    public ArrayList<Integer> searchSumReturnArrayList(int number) {
        for (int n : arrayList) {
            if (arrayList.contains(number - n)) {
                return new ArrayList<>(Arrays.asList(arrayList.indexOf(n), arrayList.indexOf(number - n)));
            }
        }
        return null;
    }

    public static ArrayList<Integer> searchSumReturnArrayList(ArrayList<Integer> list, int number) {
        for (int i : list) {
            if (list.contains(number - i)) {
                return new ArrayList<>(Arrays.asList(list.indexOf(i), list.indexOf(number - i)));
            }
        }
        return null;
    }

    public void searchIndexConsoleOutputArray() {
        System.out.println(Arrays.toString(array));
    }

    public void searchIndexConsoleOutputArrayList() {
        System.out.println(arrayList);
    }
}
