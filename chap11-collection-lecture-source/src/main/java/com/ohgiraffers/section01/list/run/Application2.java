package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDto;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        // 리스트계열에 데이터를 추가 : add()
        //              데이터를 조회 : get(index)
        //              데이터를 수정 : set(index, value)
        //              데이터를 삭제 : remove(index)

        // BookDto 객체를 여러개 다룬다
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDto(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDto(3, "동의보감", "허준", 40000));
        bookList.add(new BookDto(4, "삼국사기", "김부식", 40000));
        bookList.add(new BookDto(5, "삼국유사", "일연", 58000));

        System.out.println("bookList: " + bookList);
        //bookList: [
        // BookDto{number=1, title='홍길동전', author='허균', price=50000},
        // BookDto{number=2, title='목민심서', author='정약용', price=30000},
        // BookDto{number=3, title='동의보감', author='허준', price=40000},
        // BookDto{number=4, title='삼국사기', author='김부식', price=40000},
        // BookDto{number=5, title='삼국유사', author='일연', price=58000}
        // ]

        /* 향상된 for문을 이용해서 출력 */
        for(BookDto book : bookList) {
            System.out.println(book);
        }
        //BookDto{number=1, title='홍길동전', author='허균', price=50000}
        //BookDto{number=2, title='목민심서', author='정약용', price=30000}
        //BookDto{number=3, title='동의보감', author='허준', price=40000}
        //BookDto{number=4, title='삼국사기', author='김부식', price=40000}
        //BookDto{number=5, title='삼국유사', author='일연', price=58000}


        /**
         *  정렬 (오름차순/내림차순)
         * */

        /* 오름차순 (클래스를 만들어서 구현 해봤다) */
        // Collections.sort() 는 Comparable이 있어서 쓸 수 있었다
        // 그러나 BookDto에는 없기 때문에 AscendingPrice클래스에서
        // Comparator<BookDto> 인터페이스를 확장하고 compare()를 오버라이딩하여
        // .sort()를 사용할 수 있게 만든다
        bookList.sort(new AscendingPrice());
        System.out.println("가격 오름차순 정렬 =======");
        for(BookDto book : bookList) {
            System.out.println(book);
        }
        //가격 오름차순 정렬 =======
        //BookDto{number=2, title='목민심서', author='정약용', price=30000}
        //BookDto{number=3, title='동의보감', author='허준', price=40000}
        //BookDto{number=4, title='삼국사기', author='김부식', price=40000}
        //BookDto{number=1, title='홍길동전', author='허균', price=50000}
        //BookDto{number=5, title='삼국유사', author='일연', price=58000}


        /* 내림차순 (익명 클래스를 만들어서 구현해봤다) */
        /**
         * 익명 클래스
         * 클래스와 동일한데 이름이 없는 클래스
         * -> 이름이 없다보니 다른곳에서 불러다가 사용할 수 없다 (1회용)
         */
        bookList.sort(new Comparator<BookDto>() {
            @Override
            public int compare(BookDto o1, BookDto o2) {
                // 내림차순이라 o2가 크면 바꾼다
                return o1.getPrice() >= o2.getPrice() ? -1 : 1;
            }
        });
        System.out.println("가격 내림차순 정렬 =======");
        for(BookDto book : bookList) {
            System.out.println(book);
        }
        //가격 내림차순 정렬 =======
        //BookDto{number=5, title='삼국유사', author='일연', price=58000}
        //BookDto{number=1, title='홍길동전', author='허균', price=50000}
        //BookDto{number=4, title='삼국사기', author='김부식', price=40000}
        //BookDto{number=3, title='동의보감', author='허준', price=40000}
        //BookDto{number=2, title='목민심서', author='정약용', price=30000}

        // 제목 오름차순
        bookList.sort(new Comparator<BookDto>() {
            @Override
            public int compare(BookDto o1, BookDto o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        System.out.println("책 제목 오름차순 정렬 ==========");
        for(BookDto book : bookList) {
            System.out.println(book);
        }
        //책 제목 오름차순 정렬 ==========
        //BookDto{number=3, title='동의보감', author='허준', price=40000}
        //BookDto{number=2, title='목민심서', author='정약용', price=30000}
        //BookDto{number=4, title='삼국사기', author='김부식', price=40000}
        //BookDto{number=5, title='삼국유사', author='일연', price=58000}
        //BookDto{number=1, title='홍길동전', author='허균', price=50000}

        // 제목 내림차순
        bookList.sort(new Comparator<BookDto>() {
            @Override
            public int compare(BookDto o1, BookDto o2) {
                return o2.getTitle().compareTo(o1.getTitle());
                // o1, o2 순서 바꿈
            }
        });
        System.out.println("책 제목 내림차순 정렬 ==========");
        for(BookDto book : bookList) {
            System.out.println(book);
        }
        //책 제목 내림차순 정렬 ==========
        //BookDto{number=1, title='홍길동전', author='허균', price=50000}
        //BookDto{number=5, title='삼국유사', author='일연', price=58000}
        //BookDto{number=4, title='삼국사기', author='김부식', price=40000}
        //BookDto{number=2, title='목민심서', author='정약용', price=30000}
        //BookDto{number=3, title='동의보감', author='허준', price=40000}

        /**
         * 위의 코드를 "람다" 형태로 표현
         * 축약 시키기
         */
        bookList.sort((BookDto o1, BookDto o2) -> o2.getTitle().compareTo(o1.getTitle()));
        System.out.println("책 제목 내림차순 정렬 ==========");
        for(BookDto book : bookList) {
            System.out.println(book);
        }
        //책 제목 내림차순 정렬 ==========
        //BookDto{number=1, title='홍길동전', author='허균', price=50000}
        //BookDto{number=5, title='삼국유사', author='일연', price=58000}
        //BookDto{number=4, title='삼국사기', author='김부식', price=40000}
        //BookDto{number=2, title='목민심서', author='정약용', price=30000}
        //BookDto{number=3, title='동의보감', author='허준', price=40000}








    }
}
