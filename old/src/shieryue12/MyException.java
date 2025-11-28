package shieryue12;

/**
 * @author Hs
 * @Date 2021/12/22 14:05
 */
public class MyException extends RuntimeException{
    //@Override
    //public synchronized Throwable fillInStackTrace() {
    //    return super.fillInStackTrace();
    //}
    @Override
    public  Throwable fillInStackTrace() {
        return this;
    }
}
