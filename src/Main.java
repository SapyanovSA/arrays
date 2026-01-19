//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0 ,0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[1]);
        int january = 0;
        System.out.println(weights[january]);

        int[] bigBox = {5, 6, 12};

        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }

        int weight = weights.length;
        System.out.println(weight);
    }
}