package lambdaexeptiondemo;

import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author lomov
 */
public interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}
