public class Exception3 {
    public static void Exc3 (int a) throws Exception{
        if(a >= 0 && a < 10)
            throw new Exception("int " + a);
        if(a >= 10 && a < 15)
            throw new Exception("float " + a);
    }
}
