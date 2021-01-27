import java.io.*;

public class Test {


    public static void main(String[] args) throws IOException {
        int a = 8889;

        OutputStream outputStream11 = new FileOutputStream("C:\\Users\\123\\Downloads\\save.txt");
        OutputStream outputStream22 = new FileOutputStream("C:\\Users\\123\\Desktop\\Новый текстовый документ.txt");
        DoubleOutputStream doubleOutputStream = new DoubleOutputStream(outputStream11, outputStream22);
        doubleOutputStream.write(a);
        doubleOutputStream.toByteArray();
        Test.wl(outputStream11, outputStream22);

    }

    public static void wl(OutputStream outputStream11, OutputStream outputStream22) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream11));
        BufferedWriter bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(outputStream22));
        bufferedWriter.write("dgf");
        bufferedWriter1.write("uuu");
        bufferedWriter.newLine();
        bufferedWriter1.newLine();
        bufferedWriter.close();
        bufferedWriter1.close();
    }
}

