import java.util.Date;

public class Exception4{
    static class MyException extends Exception{
        private  int  id;
        Date time = new Date();
        MyException(int а) {
            id = а;
        }
        public String toString(){
            return id + " MyException " + time;
        }
    }
    public static void my_exc(int a) throws MyException {
        if (a >= 5) {
            throw new MyException(a);
        }
    }
}
