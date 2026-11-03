package ohgiraffers.section02.string;

public class Application2 {
    public static void main(String[] args) {
        /**
         * 문자열 객체를 만드는 방법
         * ""리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다(singleton)
         * new String("문자열") : 매번 새로운 인스턴스를 생성한다
         */
        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        // 리터럴 형태로 생성한건 불변객체이다
        System.out.println("str1 == str2 : " + (str1 == str2));
        //str1 == str2 : true
        System.out.println("str1 == str3 : " + (str1 == str3));
        //str1 == str3 : false

        System.out.println("str1의 hashCode() : " + str1.hashCode());
        System.out.println("str2의 hashCode() : " + str2.hashCode());
        System.out.println("str3의 hashCode() : " + str3.hashCode());
        System.out.println("str4의 hashCode() : " + str4.hashCode());
        //str1의 hashCode() : 3254818
        //str2의 hashCode() : 3254818
        //str3의 hashCode() : 3254818
        //str4의 hashCode() : 3254818
        System.out.println("-------> : " + System.identityHashCode(str1));
        System.out.println("-------> : " + System.identityHashCode(str2));
        System.out.println("-------> : " + System.identityHashCode(str3));
        System.out.println("-------> : " + System.identityHashCode(str4));
        //-------> : 1534030866 // 리터럴로 생성
        //-------> : 1534030866 // 리터럴로 생성
        //-------> : 664223387  // heap에서 생성
        //-------> : 824909230  // heap에서 생성

        /**
         * 문자열은 불변이라는 특성을 가진다
         * 변경시 새로 할당 된다
         */


    }
}
