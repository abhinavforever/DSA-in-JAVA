package Sorting;

import java.util.Arrays;
import java.util.Comparator;
public class merge_overlapping_intervals {

     static class Interval {
         private int start;
         private int end;

         public Interval(int start, int end) {
             this.start = start;
             this.end = end;
         }

         // Getters for start and end

         public int getStart() {
             return start;
         }

         public int getEnd() {
             return end;
         }

         @Override
         public String toString() {
             return "[" + start + ", " + end + "]";
         }
     }

    static void mergeIntervals(Interval arr[],int n){
        Arrays.sort(arr, (interval1, interval2) -> Integer.compare(interval1.getStart(), interval2.getStart()));

        int res=0;
        for (int i = 1; i < n; i++) {
            if(arr[res].end>=arr[i].start){
                arr[res].end=Math.max(arr[res].end,arr[i].end);
                arr[res].start=Math.min(arr[res].start,arr[i].start);
            }
            else{
                res++;arr[res]=arr[i];
            }
        }
        for (int i = 0; i <=res; i++) {
            System.out.println(arr[i].start+" "+arr[i].end);
        }
    }
        public static void main(String[] args) {
            Interval[] intervals = new Interval[4];

            intervals[0] = new Interval(5, 10);
            intervals[1] = new Interval(3, 15);
            intervals[2] = new Interval(18, 30);
            intervals[3] = new Interval(2,7);

            // Print the intervals
            for (Interval interval : intervals) {
                System.out.println(interval);
            }
            mergeIntervals(intervals,intervals.length);
        }

}