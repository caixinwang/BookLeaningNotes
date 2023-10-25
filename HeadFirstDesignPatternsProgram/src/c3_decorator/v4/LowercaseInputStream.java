package c3_decorator.v4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
//继承FilterInputStream，这样我们也是一个具体的装饰器了
public class LowercaseInputStream extends FilterInputStream {

    public LowercaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c=super.read();
        return c==-1?-1:Character.toLowerCase((char)c);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int res= super.read(b, off, len);//一层层处理
        for (int i=off;i<off+len;i++){
            b[i]=(byte)Character.toLowerCase((char) b[i]);
        }
        return res;
    }
}
