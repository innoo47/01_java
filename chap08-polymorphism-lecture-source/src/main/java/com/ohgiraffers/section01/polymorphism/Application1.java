package com.ohgiraffers.section01.polymorphism;

public class Application1 {
    public static void main(String[] args) {

        /**
         * 다형성
         *  : 하나의 인스턴스가 여러가지 타입을 가질 수 있다는 것을 의미
         */
        System.out.println("===== Animal 생성 =====");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();
        //===== Animal 생성 =====
        //동물이 먹이를 먹습니다
        //동물이 달려갑니다
        //동물이 울음소리를 냅니다

        System.out.println("===== Tiger 생성 =====");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();
        //===== Tiger 생성 =====
        //호랑이가 고기를 뜯어 먹습니다
        //호랑이는 웬만하면 달리지 않습니다 어슬렁
        //호랑이가 울부짖습니다
        //호랑이가 물어 뜯습니다

        System.out.println("===== Rabbit 생성 =====");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();
        //===== Rabbit 생성 =====
        //토끼가 풀을 뜯어먹고 있습니다
        //토끼가 달려갑니다
        //토끼가 울음소리를 냅니다
        //토끼가 점프합니다 점프

        /**
         * Rabbit과 Tiger는 Animal클래스를 상속 받았다
         * Rabbit은 Rabbit타입이기도 하면서 Animal 타입이기도 하다
         * Tiger은 Tiger타입이기도 하면서 Animal 타입이기도 하다
         */

        /* 부모 타입으로 자식 인스턴스 주소값을 저장 */
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

//        Rabbit animal3 = new Animal(); (x)

//        animal1.jump(); (jump가 없다;;; 현재 Animal)
        animal1.cry(); // 근데 이건 토끼꺼로 나옴
        //토끼가 울음소리를 냅니다

//        animal2.bite(); (얘도 안나옴)
        animal2.cry();
        //호랑이가 울부짖습니다
        /**
         * ====> 다형성 관련 메모리구조 PDF 확인 <====
         */

        //컴파일 에러(컴파일시 에러 바로 에러 알려줌), 런타임 에러(동작중에 에러)
        System.out.println("============> 동적바인딩");
        animal1.cry();
        animal2.cry();
        //============> 동적바인딩
        //토끼가 울음소리를 냅니다
        //호랑이가 울부짖습니다

        /**
         * 객체별로 고유한 기능을 동작시키기 위해서는 레퍼런스 변수를 형변환하여
         * Rabbit과 Tiger로 변경해야 메소드 호출이 가능하다
         * class type casting : 클래스 형변환
         * ====> 타입 형 변환 시 실제 인스턴스와 타입이 일치하지 않는 경우 ClassCastException이 발생할 수 있다.
         *
         * 클래스 형 변환은 up-casting과 down-casting으로 구분할 수 있다
         * up-casting : 상위 타입으로 형변환
         * down-casting : 하위 타입으로 형 변환
         */
        Animal animal3 = (Animal) new Rabbit(); // 업캐스팅(명시적 형변환)
        Animal animal4 = new Tiger();  // 업캐스팅(묵시적 형변환)

        Rabbit rabbit1 = (Rabbit) animal3;  // Animal-> Rabbit 다운캐스팅 (명시적 형변환)
//        Rabbit rabbit2 = animal4;         // 다운캐스팅은 묵시적 형변환 x
        rabbit1.jump(); // jump()가 된다
        //토끼가 점프합니다 점프


        /**
         *  instanceof 연산자 이용
         *  레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자
         *  true or false
         */
        System.out.println("instanceof 확인 =====");
        System.out.println("animal1이 Tiger 타입인지 확인 : " + (animal1 instanceof Tiger));
        System.out.println("animal1이 Rabbit 타입인지 확인 : " + (animal1 instanceof Rabbit));
        System.out.println("animal1이 Animal 타입인지 확인 : " + (animal1 instanceof Animal));
        System.out.println("animal1이 Object 타입인지 확인 : " + (animal1 instanceof Object));
        //instanceof 확인 =====
        //animal1이 Tiger 타입인지 확인 : false
        //animal1이 Rabbit 타입인지 확인 : true
        //animal1이 Animal 타입인지 확인 : true
        //animal1이 Object 타입인지 확인 : true

        // ***
        // 조건문 하위부터 해야 안걸림 ex) Tiger -> Rabbit -> Animal -> Object 하위는 Object를 포함하고 있기 때문에

        if(animal1 instanceof Rabbit){
            ((Rabbit)animal1).jump();
        }





    }
}
