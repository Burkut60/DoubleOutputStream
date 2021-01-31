
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

    @Override
    public void write(int b) throws IOException {
this.output1.write(b);
this.output2.write(b);
    }
    
    public void close() throws IOException {
       this.output1.close();
       this.output2.close();
    }
}
