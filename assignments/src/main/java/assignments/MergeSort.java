package assignments;

public class MergeSort {

	/*
	 * public static void main(String[] args) { int[]
	 * arr1={1,3,7,10,13,15,22,34}; int[] arr2={1,2,5,8,10,12,15};
	 * System.out.println(toString(mergeSort(arr1, arr2))); }
	 */
	public int[] mergeSort(int[] arr1, int[] arr2) {

		int[] merge = new int[(arr1.length + arr2.length)];
		int i, j = 0, temp = 0, count = 0;
		for (i = 0; i < arr1.length; i++) {
			for (j = count; j < arr2.length; j++) {
				if (arr1[i] <= arr2[j]) {
					merge[temp] = arr1[i];
					temp++;
					break;
				} else if (arr1[i] >= arr2[j]) {
					merge[temp] = arr2[j];
					temp++;
					count++;
				}
			}
			if (j == arr2.length) {
				merge[temp] = arr1[i];
				temp++;
			}
		}
		for (j = count; j < arr2.length; j++) {
			merge[temp] = arr2[j];
		}
		return merge;
	}

	public String toString(int[] arr) {
		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i] + " ";
		}
		if (str.endsWith(" "))
			str.trim();
		return str + "]";
	}
}
