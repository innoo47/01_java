package ohgiraffers.section01.object;

import ohgiraffers.section01.object.book.Book;

public class Application2 {
    public static void main(String[] args) {
        /**
         * Object 클래스의 equals() 메소드
         *
         * equals() 메소드 오버라이딩
         *
         * equals() 메소드는 매개변수로 전달 받은 인스턴스와 == 연산하여 true or false를 반환한다
         * 즉, 동일한 인스턴스인지를 비교하는 기능을 한다
         */

        /**
         * 동일객체와 동등객체
         * 동일 객체 : 주소가 동일한 인스턴스를 동일 객체라고 한다
         * 동등 객체 : 주소는 다르더라도 필드값이 동일한 객체를 동등 객체라고 한다
         */
        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("두 인스턴스의 == 연산 비교 : " + (book1 == book2));
        //두 인스턴스의 == 연산 비교 : false
        //동등객체 (주소값은 다르고 값은 같다)

        System.out.println("두 인스턴스의 equals() 비교 : " + (book1.equals(book2)));
        //두 인스턴스의 equals() 비교 : true

        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());
        //book1.hashCode() = 664223387
        //book2.hashCode() = 824909230
        // 여전히 주소값은 다르기 때문에 동등객체

        /* hashCode()를 오버라이딩 한 후에 결과 */
        //두 인스턴스의 == 연산 비교 : false
        //두 인스턴스의 equals() 비교 : true
        //book1.hashCode() = -1619022418
        //book2.hashCode() = -1619022418
        // 주소값이 같게 되면서 동일객체가 된다



    }
}
