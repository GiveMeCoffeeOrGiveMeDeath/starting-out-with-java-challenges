
public class BubbleSort {

    public static void main(String[] args) {

        int[] num = new int[] { 6, 3, 7, 2, 1 };
        int temp;

        for (int i = 0; i < num.length - 1; i++) {
            for (int x = 0; x < num.length - 1; i++) {

                if (num[x] > num[x + 1]) {
                    temp = num[x];
                    num[x] = num[x + 1];
                    num[x + 1] = temp;
                }
            }
        }

        int j;
        for (j = 0; j < num.length - 1; j++) {
            System.out.println(num[j]);
        }
        // System.out.print(num);
    }

}
