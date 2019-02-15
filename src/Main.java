public class Main {
    public static void main (String[] args) {
        Exception1.Exc1();
        Exception2.Exc2();
        try {
            Exception3.Exc3(9);
        } catch (Exception e) {
            System.out.println("Исключение: " + e);
        }
        try {
            Exception4.my_exc(7);
        }catch (Exception4.MyException e) {
            System.out.println("Исключение: " + e);
        }
    }
}
