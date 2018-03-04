


import java.util.Arrays;
import java.util.Scanner;
//codigo sacado de https://gist.github.com/jayeshsolanki93/10404159
class MergeSort {
    private static Scanner sc;

    public static void main(String args[]) {
        sc = new Scanner(System.in);
        long estimatedTime = 0;
        long startTime = System.currentTimeMillis();
        
        System.out.println("INGRESE LA CANTIDAD DE NÚMEROS");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*20+0);
        }
    
        //System.out.println("El arreglo es: ");
        //System.out.println(Arrays.toString(arr));

        mergesort(arr);

        //System.out.println("El arreglo ordenado es: ");
        //System.out.println(Arrays.toString(arr));
        
        estimatedTime += System.currentTimeMillis() - startTime ;
        System.out.println("Tiempo: " + estimatedTime);
    }

    static void mergesort(int arr[]) {
        int n = arr.length;
        if (n < 2)
            return;
        int mid = n / 2;
        int left[] = new int[mid];
        int right[] = new int[n - mid];
        for (int i = 0; i < mid; i++)
            left[i] = arr[i];
        for (int i = mid; i < n; i++)
            right[i - mid] = arr[i];
        mergesort(left);
        mergesort(right);
        merge(arr, left, right);
    }

    public static void merge(int arr[], int left[], int right[]) {
        int nL = left.length;
        int nR = right.length;
        int i = 0, j = 0, k = 0;
        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[i];
                j++;
            }
            k++;
        }
        while (i < nL) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < nR) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}