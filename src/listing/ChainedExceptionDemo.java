package listing;

public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void method1()
            throws Exception {
        try {
            method2();

        } catch (Exception ex) {
            throw new Exception("New info from method1", ex);
        }

    throw  Exception; {
            throw  new Exception("new info from method2");
        }

            throw new Exception("New info from method2");
    }
    private static void method2() {
    }
}