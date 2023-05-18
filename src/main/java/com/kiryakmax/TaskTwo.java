package main.java.com.kiryakmax;

import java.util.*;

public class TaskTwo {
    private int[] array;
    private ArrayList<Integer> arrayList;

    public TaskTwo() {}
    public TaskTwo(int[] array) {
        this.array = array;
    }
    public TaskTwo(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }
    public TaskTwo(int[] array, ArrayList<Integer> arrayList) {
        this.array = array;
        this.arrayList = arrayList;
    }

    public boolean hasDuplicatesArray() {
        for (int i = 0; i < this.array.length; i++) {
            for (int j = i; j < this.array.length; j++) {
                if (this.array[i] == this.array[j]) return true;
            }
        }
        return false;
    }
    public boolean hasDuplicatesArray(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if(Arrays.binarySearch(Arrays.copyOfRange(array, i + 1, array.length + 1), array[i]) >= 0) return true;
        }
        return false;
    }
    public boolean hasDuplicatesArrayList() {
        this.arrayList.sort(Comparator.naturalOrder());
        for (int i = 1; i < this.arrayList.size(); i++) {
            if (Objects.equals(this.arrayList.get(i - 1), this.arrayList.get(i))) return true;
        }
        return false;
    }
    public boolean hasDuplicatesArrayList(ArrayList<Integer> arrayList) {
        for (int i : arrayList) {
            if (Collections.frequency(arrayList, i) > 1) return true;
        }
        return false;
    }
}
