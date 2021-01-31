import java.io.*;

public class Test {


    public static void main(String[] args) throws IOException {
        int a =1111331;

        OutputStream outputStream11 = new FileOutputStream("C:\\Users\\123\\Downloads\\save.txt");
        OutputStream outputStream22 = new FileOutputStream("C:\\Users\\123\\Desktop\\Новый текстовый документ.txt");

DoubleOutputStream1 doubleOutputStream1 = new DoubleOutputStream1(outputStream11,outputStream22);
doubleOutputStream1.write(a);
doubleOutputStream1.close();
    }
}

