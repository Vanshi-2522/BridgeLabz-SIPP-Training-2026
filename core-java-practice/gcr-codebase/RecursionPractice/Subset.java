public class Subset {

    static void generateSubsets(int[] arr, int index, String current) {
        if (index == arr.length) {
            System.out.println("[" + current + "]");
            return;
        }

        generateSubsets(arr, index + 1, current);

        String newCurrent = current.isEmpty()
                ? String.valueOf(arr[index])
                : current + ", " + arr[index];

        generateSubsets(arr, index + 1, newCurrent);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        generateSubsets(arr, 0, "");
    }
}