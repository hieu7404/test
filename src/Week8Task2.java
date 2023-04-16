import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {

    public void nullPointerEx() throws NullPointerException {
        String s = null;
        int size = s.length();
    }

    /**
     * a.
     *
     * @return a
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array[6]);
    }

    /**
     * a.
     *
     * @return a
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    public void arithmeticEx() throws ArithmeticException {
        int a = 5 / 0;
    }

    /**
     * a.
     *
     * @return a
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    public void fileNotFoundEx() throws FileNotFoundException {
        FileReader file = new FileReader("abc.text");
    }

    /**
     * a.
     *
     * @return a
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    public void ioEx() throws IOException {
        fileNotFoundEx();
    }

    /**
     * a.
     *
     * @return a
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
}
