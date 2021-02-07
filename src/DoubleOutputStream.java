import java.io.*;

public class DoubleOutputStream extends OutputStream {
    private final OutputStream out1;
    private final OutputStream out2;

    public DoubleOutputStream(OutputStream out1, OutputStream out2) {
        this.out1 = out1;
        this.out2 = out2;
    }

    @Override
    public void write(int b) throws IOException {

        this.out1.write(b);
        this.out2.write(b);
    }
}
