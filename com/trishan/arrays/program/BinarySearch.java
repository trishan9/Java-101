
public class BinarySearch {
  public static void main(String[] args) {
    int[] numbers = { 2, 4, 6, 8, 10, 12, 14, 16 };

    int target = 10;
    System.out.println(binarySearch(numbers, 0, numbers.length - 1, target));
  }

  // Similar to Dictionary, Needs Sorted Arrays
  // Time Complexity - O(log n)
  public static int binarySearch(int[] a, int s, int e, int target) {
    if (s <= e) {
      int mid = (s + e) / 2;
      if (target < a[mid]) {
        return binarySearch(a, s, mid - 1, target);
      } else if (target > a[mid]) {
        return binarySearch(a, mid + 1, e, target);
      } else {
        return mid;
      }
    }
    return -1;
  }
}
