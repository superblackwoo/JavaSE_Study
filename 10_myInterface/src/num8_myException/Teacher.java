package num8_myException;

public class Teacher {

    //使用自己的异常类
    public void checScore(int score) throws ScoreException{
        if(score<0 || score>100)
            //throw new ScoreException();
            throw new ScoreException("分数应该在0-100分之间");
    else {
            System.out.println("分数正常");
        }
    }
}
