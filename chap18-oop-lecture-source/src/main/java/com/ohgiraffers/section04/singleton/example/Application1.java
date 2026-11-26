package com.ohgiraffers.section04.singleton.example;

public class Application1 {
    public static void main(String[] args) {

        /* 이른 초기화 싱글톤 패턴 */
        EagerSingleton first = EagerSingleton.getInstance();
        EagerSingleton second = EagerSingleton.getInstance();
        // EagerSingleton third = new EagerSingleton(); (x)
        // -> 생성자의 접근제한자를 private로 하였기 때문에 생성 불가

        System.out.println("같은 객체인지 확인 : " + (first == second));
        //같은 객체인지 확인 : true

        /* 싱글톤 없이 만든 설정 클래스 */
        PlainSettings settingScreen = new PlainSettings();   // 설정 화면이 만든 객체
        PlainSettings homeScreen = new PlainSettings();      // 홈 화면이 만든 객체

        settingScreen.setTheme("어둡게");
        System.out.println("설정 화면 테마: " + settingScreen.getTheme());
        System.out.println("홈 화면 테마: " + homeScreen.getTheme());
        //설정 화면 테마: 어둡게
        //홈 화면 테마: 밝게
        //-> 설정 화면에서 테마를 어둡게로 바꿨는데 홈 화면은 밝게를 출력한다


    }
}
