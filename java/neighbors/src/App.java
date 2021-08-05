import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] test = new int[] { 1, 0, 0, 0, 0, 1, 0, 0 };
        int[] test2 = new int[] { 1, 1, 1, 0, 1, 1, 1, 1 };
        int[] res = neighbors(test, 1);
        int[] res2 = neighbors(test2, 2);
        System.out.println("Caso de prueba #1");
        System.out.println(Arrays.toString(res));
        System.out.println("\nCaso de prueba #2");
        System.out.println(Arrays.toString(res2));
    }

    public static int[] neighbors(int[] houses, int days) {
        int[] housesCopy = houses.clone();

        for (int day = 0; day < days; day++) {
            for (int j = 1; j < housesCopy.length - 1; j++) {
                if ((housesCopy[j - 1] == 1 && housesCopy[j + 1] == 1)
                        || (housesCopy[j - 1] == 0 && housesCopy[j + 1] == 0)) {
                    houses[j] = 0;
                } else {
                    houses[j] = 1;
                }
            }

            // Vecinos limite
            houses[0] = (housesCopy[1] == 0) ? 0 : 1;
            houses[7] = (housesCopy[6] == 0) ? 0 : 1;
            // Nuevo dia
            housesCopy = houses.clone();
        }
        
        return houses;
    }
}
