package DynamicProgramming.AdityaVermadp.RevisonsDp.MatrixChainMultiplication.EggDroping;

public class EggDroppingPerblom {

    public static int eggress(int e, int f) {

        if (f == 0 || f == 1) return f;
        if (e == 1) return f;

        int min = Integer.MAX_VALUE;

        for (int k = 1; k <= f; k++) {
            int temp = 1 + Math.max(
                    eggress(e - 1, k - 1),
                    eggress(e, f - k)
            );
            min = Math.min(min, temp);
        }

        return min;
    }

    public static void main(String[] args) {
        int floors = 4;
        int eggs = 2;
        System.out.println(
            "Number of trials when number of eggs is " + eggs +
            " and number of floors is " + floors + ": " +
            eggress(eggs, floors)
        );
    }
}
