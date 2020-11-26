import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,8,1,7,6,9,4,3,8};

        int[] sor = SelectionSort.sel(arr);
        System.out.println(Arrays.toString(sor));
    }

    private static int[] sel(int[] a) {
        int[] ru = a;
        int temp;
        int time = 0;
        for (int i = 0; i < ru.length; i++) {
            for (int j = i+1; j < ru.length; j++) {
                if (ru[i]>ru[j]){
                    temp=ru[i];
                    ru[i]=ru[j];
                    ru[j]=temp;
                }
            }
            System.out.println(Arrays.toString(ru));
        }
        return ru;
    }
}
