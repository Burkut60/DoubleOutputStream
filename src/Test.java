import java.io.*;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        OutputStream outputStream11 = new FileOutputStream("C:\\Users\\123\\Desktop\\Anagram.txt") ;
        OutputStream outputStream22 = new FileOutputStream("C:\\Users\\123\\Desktop\\Новый текстовый документ.txt") ;
   DoubleOutputStream doubleOutputStream = new DoubleOutputStream(outputStream11);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(doubleOutputStream.toByteArray());
        int b;
        while( (b = byteArrayInputStream.read())!=-1){
            System.out.println(b);
        }
    }
}
