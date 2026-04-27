package DSA.Arrays.PageReplacementAlgo;

import java.util.*;

public class FIFO_basedImplementation {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Enter no of frames : ");
        int frames = sc.nextInt();

        int[] page = new int[frames];
        Arrays.fill(page, -1);

        int faultCount = 0;
        int hitCount = 0;

        int[] pageReferenceStreamArr = {1,3,2,4,2,3,1,4,2,4,1,3};

        for (int i = 0; i < pageReferenceStreamArr.length; i++) {

            if (pageContains(page, pageReferenceStreamArr[i])) {
                hitCount++;
            } else {
                faultCount++;

                int insertPosition = hasEmptyFrame(page);

                if (insertPosition != -1) {
                    page[insertPosition] = pageReferenceStreamArr[i];
                    queue.add(pageReferenceStreamArr[i]);
                } else {
                    int oldpage = queue.poll();
                    replacePage(page, oldpage, pageReferenceStreamArr[i]);
                    queue.add(pageReferenceStreamArr[i]);
                }
            }

            System.out.println(Arrays.toString(page));
        }

        System.out.println("Hit Count : " + hitCount);
        System.out.println("Fault Count : " + faultCount);

        System.out.println("Hit Ratio : " + (double) hitCount / pageReferenceStreamArr.length);
        System.out.println("Fault Ratio : " + (double) faultCount / pageReferenceStreamArr.length);
    }

    static boolean pageContains(int[] page, int element) {
        for (int value : page) {
            if (value == element) return true;
        }
        return false;
    }

    static int hasEmptyFrame(int[] page) {
        for (int i = 0; i < page.length; i++) {
            if (page[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    static void replacePage(int[] page, int oldPage, int newPage) {
        for (int i = 0; i < page.length; i++) {
            if (page[i] == oldPage) {
                page[i] = newPage;
                return;
            }
        }
    }
}