package num8_myException;
//定义自己的异常类

public class ScoreException extends Exception{
    public ScoreException(){};
    public ScoreException(String message){
        super(message);
    }
}
