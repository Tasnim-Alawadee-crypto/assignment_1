package assignment_1;

import java.util.Arrays;

public class Q1_ArrayClone {

    // Q1: برنامج لعمل نسخة (Clone) من مصفوفة
    public static void main(String[] args) {

        int[] originalArray = {1, 2, 3, 4, 5};

        // عمل نسخة من المصفوفة
        int[] clonedArray = originalArray.clone();

        // طباعة المصفوفتين (بالإنجليزي)
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Cloned array:   " + Arrays.toString(clonedArray));
    }
}