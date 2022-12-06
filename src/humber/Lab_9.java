package humber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab_9 {
    
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1013, "WILSON"));
        students.add(new Student(1072, "SMITH"));
        students.add(new Student(1033, "FERNANDEZ"));
        students.add(new Student(1025, "MAY"));
        students.add(new Student(1011, "BROCK"));
        
        sort(students);

        //   Collections.sort(students, Student.ID);
        Collections.sort(students, ID);
        System.out.println(students);

//        System.out.println(Student.ID.compare(students.get(0), students.get(1)));
    }
    
    public static <E extends Comparable<E>> void sort(List<E> myList) {
        for (int i = 1; i < myList.size(); i++) {
            E current = myList.get(i);
            int k;
            for (k = i - 1; k >= 0 && myList.get(k).compareTo(current) > 0; k--) {
                myList.set((k + 1), myList.get(k));
                
            }
            // Insert the current element into list[k + 1]
            myList.set(k + 1, current);
        }
    }
    
    public static <E> void bubbleSort(List<E> bubbleList, Comparator<E> comparator) {
        int n = bubbleList.size();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (comparator.compare(bubbleList.get(j - 1), bubbleList.get(j)) > 0) {
                    E current = bubbleList.get(n);
                    bubbleList.set((int) current, bubbleList.get(j - 1));
                    bubbleList.set(j - 1, bubbleList.get(j));
                    bubbleList.set(j, bubbleList.get((int) current)); 
                }
            }
            
        }
    }
    
    public static Comparator<Student> ID = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getId().compareTo(s2.getId());
        }
    };
    
    public static int binarySearch(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == array[mid]) {
                return mid;
            } else if (key > array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    
}
