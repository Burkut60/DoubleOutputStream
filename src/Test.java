import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        int a = 8889;

        OutputStream outputStream11 = new FileOutputStream("C:\\Users\\123\\Downloads\\save.txt");
        OutputStream outputStream22 = new FileOutputStream("C:\\Users\\123\\Desktop\\Новый текстовый документ.txt");
        DoubleOutputStream doubleOutputStream = new DoubleOutputStream(outputStream11, outputStream22);
        doubleOutputStream.write(a);
        doubleOutputStream.toByteArray();
    }
}
