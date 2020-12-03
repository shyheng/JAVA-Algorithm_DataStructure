import java.util.Arrays;

public class BubbleText {
    public static void bubbleSort(int[] args) {
        //1 包含所有参与游戏的人
        for (int i = args.length-1; i > 0; i--) {
            //2、控制交换手绢的过程
            for (int j = 0; j < i; j++) {
                //3、设置交换手绢的条件
                if (args[j] > args[j+1]) {
                    int temp = args[j];
                    args[j] = args[j+1];
                    args[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] a = new int [] {9,65,5,6,59,59,546,565,44,4,8,1,52,23,6,0,131};
        BubbleText.bubbleSort(a);
        //打印展示排序结果
        Arrays.stream(a).forEach(System.out::println);

    }
}
