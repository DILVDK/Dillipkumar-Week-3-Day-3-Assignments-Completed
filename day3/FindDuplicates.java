package week3.day3;

public class FindDuplicates {
	
	public static void main(String[] args) {
        int[] num = {2, 5, 7, 7, 5, 9, 2, 3};

        System.out.println("Duplicate elements are:");
        // Outer loop picks each element
        for (int i = 0; i < num.length; i++) {
            // Inner loop checks for duplicates
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.println(num[i]);
                    break; // avoid printing same duplicate again
                }
            }
        }
	}
}