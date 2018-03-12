import java.util.stream.*;
import java.text.NumberFormat.*;
import java.util.Locale.*;

public class PrintLn {
    public static void main(String args[]) {
        int mul =1;
        for(int i=1;i&lt;10;i++){
            mul= 8*i;
            System.out.printf(&quot;%d x %d = %d&#92;n&quot;, 8, i, mul);
        }
    }
}

