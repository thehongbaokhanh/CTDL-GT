import java.util.Arrays;

public class Main {
    // Câu 1: Tìm kiếm tuyến tính.
    // Mã giả:
    // procedure linearSearch(A, valueToFind)
    //     for i = 0 to length(A) - 1
    //         if A[i] == valueToFind
    //             return i
    //     return -1
    public static int timKiemTuyenTinh(int[] mang, int giaTri) {
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == giaTri) {
                return i;
            }
        }
        return -1;
    }

    // Câu 2: Sắp xếp chèn tăng dần.
    // Mã giả:
    // procedure insertionSort(A)
    //     for i = 1 to length(A) - 1
    //         valueToInsert = A[i]
    //         holePosition = i
    //         while holePosition > 0 and A[holePosition - 1] > valueToInsert
    //             A[holePosition] = A[holePosition - 1]
    //             holePosition = holePosition - 1
    //         A[holePosition] = valueToInsert
    public static void sapXepChen(int[] mang) {
        for (int i = 1; i < mang.length; i++) {
            int giaTri = mang[i];
            int j = i - 1;
            while (j >= 0 && mang[j] > giaTri) {
                mang[j + 1] = mang[j];
                j--;
            }
            mang[j + 1] = giaTri;
        }
    }

    // Câu 3: Tính giai thừa bằng đệ quy (n từ 0 đến 20).
    // Mã giả:
    // procedure factorial(n)
    //     if n < 0 or n > 20
    //         error "n phải nằm trong khoảng từ 0 đến 20."
    //     if n == 0
    //         return 1
    //     return n * factorial(n - 1)
    public static long giaiThua(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n phải nằm trong khoảng từ 0 đến 20.");
        }
        if (n == 0) {
            return 1;
        }
        return n * giaiThua(n - 1);
    }

    public static void main(String[] args) {
        int[] mang = {12, 11, 13, 5, 6};
        int giaTriCanTim = 13;
        int chiSo = timKiemTuyenTinh(mang, giaTriCanTim);
        System.out.println("Câu 1: Tìm kiếm tuyến tính");
        System.out.println("Mảng: " + Arrays.toString(mang));
        if (chiSo == -1) {
            System.out.println("Không tìm thấy " + giaTriCanTim + " trong mảng.");
        } else {
            System.out.println("Tìm thấy " + giaTriCanTim + " tại chỉ số " + chiSo + " (tính từ 0).");
        }

        System.out.println("\nCâu 2: Sắp xếp chèn");
        sapXepChen(mang);
        System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(mang));
// 
        System.out.println("\nCâu 3: Tính giai thừa bằng đệ quy");
        int n = 5;
        System.out.println("Giai thừa của " + n + " là: " + giaiThua(n));
    }
}
