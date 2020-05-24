import java.util.Scanner;

public class BinarySearch {
    int[] data;

    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        b.Search();
    }

    public void Search() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int key = sc.nextInt();
        this.data = new int[num];
        for (int i = 0; i < num; i++) {
            data[i] = sc.nextInt();
        }
        int low = 0;
        int high = num - 1;
        while (true) {
            int mid = (low + high) / 2;
            if (data[mid] == key) {
                System.out.print(mid+1);
                break;
            } else if (data[mid] < key) {
                low = mid + 1;
            } else if (data[mid] > key) {
                high = mid - 1;
            }
            if (low > high) {
                System.out.print("-1");
                break;
            }
        }
    }
}
