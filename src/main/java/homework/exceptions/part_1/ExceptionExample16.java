package homework.exceptions.part_1;

public class ExceptionExample16 {
    public static void main(String[] args) {
        try {
            System.out.println(1);
            try {
                System.out.println(3);
                throw new RuntimeException();
            } catch (Error e) {                 //неподходящий catch
                System.out.println(4);
            }
        } catch (Exception e) {                 //будет отловлен RuntimeException
            System.out.println(2);
        }
    }

}
