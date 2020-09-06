public class Sorter {
    public static void main(String[] args) {
        // Create test array
        Item[] testArray = new Item[1000];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = new Item("item" + i);
        }

        // Sort test array
        Item.bubbleSort(testArray);

        // Print test array
        for (Item i : testArray) {
            System.out.println(i);
        }
    }
}