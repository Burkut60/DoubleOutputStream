import java.io.ByteArrayOutputStream;

import java.io.IOException;
import java.io.OutputStream;

public class DoubleOutputStream extends OutputStream {
    private final ByteArrayOutputStream byteArrayOutputStream1;
    protected OutputStream out1;
  //  protected OutputStream out2;

    public DoubleOutputStream(OutputStream out1) {
        this.out1 = out1;
      //  this.out2 = out2;
        this.byteArrayOutputStream1 = new ByteArrayOutputStream();
    }

    @Override
    public void write(int b) throws IOException {
        this.byteArrayOutputStream1.write(b);
        this.out1.write(b);
        //this.out2.write(b);
    }


    public byte[] toByteArray() {
        return this.byteArrayOutputStream1.toByteArray();
    }
}