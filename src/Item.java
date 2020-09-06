public class Item implements Comparable<Item> {
    private String itemName;

    public Item(String name) {
        this.itemName = name;
    }

    // Sorting method
    public static void bubbleSort(Item[] testArray) {
        for (int i = 0; i < testArray.length; i++) {
            for(int j = 1; j < (testArray.length-i); j++) {
                // Swap two elements if one is larger than other
                if (testArray[j-1].compareTo(testArray[j]) > 0) {
                    // Create temporary item
                    Item temp = testArray[j-1];
                    // Swap items
                    testArray[j-1] = testArray[j];
                    testArray[j] = temp;
                }
            }
        }
    }

    public String toString() {
        return itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String name) {
        this.itemName = name;
    }

    // Check if character is a digit
    public static boolean isDigit(char ch) {
        int asciiVal = (int) ch;
        if (asciiVal >= 48 && asciiVal <= 57) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Item item) {
        // Convert item names to char arrays
        char[] name1 = this.getItemName().toCharArray();
        char[] name2 = item.getItemName().toCharArray();
        // Initialize i
        int i = 0;
        // While i is less than both names' lengths,
        while (i < name1.length && i < name2.length) {
            // If the character at position i is a digit in both names
            if (isDigit(name1[i]) && isDigit(name2[i])) {
                // If name1's digit is bigger than name2's digit return 1
                if (Character.getNumericValue(name1[i]) > Character.getNumericValue(name2[i])) {
                    return 1;
                    // If name1's is smaller than name2's return -1
                } else if (Character.getNumericValue(name1[i]) < Character.getNumericValue(name2[i])) {
                    return -1;
                }
            }
            // Increment i
            i++;
        }
        return 0;
    }
}