package ohgiraffers.section04.wrapper;

public class Application2 {
    public static void main(String[] args) {

        /**
         * parsing : 문자열(string) 값을 기본자료형 값으로 변경하는 것
         */


        // 문자열 ===> 기본자료형
        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");      // <<===== 얘는 꼭 기억
        long l = Long.parseLong("8");       // 8l, 8L은 안됨
        float f = Float.parseFloat("3.14"); // 3.14f가 된다
        double d = Double.parseDouble("3.14");
        boolean bool = Boolean.parseBoolean("true");

        char c = "abc".charAt(0);               // char는 charAt() 사용


        // 기본자료형 ===> 문자열
        // =====> Application3.class

    }
}
