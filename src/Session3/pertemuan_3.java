package Session3;

import java.util.ArrayList;
import java.util.Collections;

public class pertemuan_3 {
    public static void main(String[] args){
        int[] arr = new int[100];
        arr[0] = 0;
        int[][] duaD = new int[10][10];
        ArrayList<Integer> score = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            score.add((int)(Math.random() * 1000));
        }
//        score.set(5, 5);
//        score.sort((a, b) -> a > b ? 1 : a < b ? -1 : 0); //sorting ascending
//        score.sort((a, b) -> a > b ? -1 : a < b ? 1 : 0); //sorting descending
        Collections.sort(score);
        for (int i = 0; i < 100; i++) {
            System.out.println(score.get(i));
        }
        score.remove(0); //first index
        score.remove(score.size() -1); //last index
        System.out.println(score.get(0));
        System.out.println("Size: " + score.size());
        score.clear();
        System.out.println("Size: " + score.size());
    }
}
