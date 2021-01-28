
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class DoubleOutputStream1 extends OutputStream {

    protected OutputStream output1;
    protected OutputStream output2;

    public DoubleOutputStream1(OutputStream output1, OutputStream output2) {
        this.output1 = output1;
        this.output2 = output2;
    }

    public void printWriter(String a) {

        PrintWriter print = new PrintWriter(output1);
        PrintWriter print2 = new PrintWriter(output2);
        print.print(a);
        print2.print(a);
        print.close();
        print2.close();
    }

    @Override
    public void write(int b) throws IOException {

    }
}
