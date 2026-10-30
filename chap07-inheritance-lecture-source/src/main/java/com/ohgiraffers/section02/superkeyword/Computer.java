package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {

    /**
     * computer는 하나의 product이다 (IS-A)
     * Product는 computer이다 (x)
     */

    private String cpu;
    private int ssd;
    private int ram;
    private String operationSystem;

    public Computer() {
        System.out.println("Computer클래스의 기본 생성자 호출");
    }

    /**
     * 지금 생성해 놓은 매개변수 있는 생성자는 Computer라는 인스턴스를 생성 할 때
     * Coumputer클래스 내부에 생성한 필드의 값만 초기화하고, 부모 (Product)클래스의 필드는
     * JVM이 제공하는 기본값으로 채워 넣겠다
     *
     * @param cpu
     * @param ssd
     * @param ram
     * @param operationSystem
     */
    public Computer(String cpu, int ssd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    /**
     * 현재 생성한 매개변수 있는 생성자는
     * 내가 가지고 있는 필드도 초기화하고 부모가 가지고 있는 필드의 값도 다 같이 초기화해서
     * 인스턴스를 생성하겠다는 의미로 사용
     *
     * @param code
     * @param brand
     * @param name
     * @param price
     * @param manufacturingDate
     * @param cpu
     * @param ssd
     * @param ram
     * @param operationSystem
     */
    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int ssd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        // this(cpu, ssd, ram, operationSystem); (x)
        /*
        위에 처럼 사용하고 싶지만 this()로 인해 작성한 생성자를 호출한다는 의미는
        super()를 두번 호출하는 것과 같기 때문에 허용되지 않는다
        why? 부모 인스턴스를 두 개 생성 할 수 없기 때문에 부모 생성자는 한번만 호출한다
         */
    }

    /**
     * setter와 getter는 부모 필드의 메소드에 대해서는 자신의 것처럼 사용 가능하기 때문에
     * 따로 작성 할 필요없이 부모 클래스에 작성한 것을 사용 할 수 있다
     * 따라서 자식 클래스에 추가된 필드에 대해서만 setter/getter를 사용할 수 있다
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInformation() {
        /**
         * super.getInformation() : 정상적으로 부모의 메소드를 호출
         * this.getInformation() : 본인의 getInformation()을 호출하기 때문에 재귀호출(본인을 계속 호출)이 일어나며
         *                          stackoverflow가 발생한다
         * getInformation()     : this.가 자동 추가되어 동일하게 에러가 난다
         * 따라서 이런 경우 super.을 명시적으로 사용해야 한다.
         */

        return super.getInformation() + ", cpu = " + this.cpu + ", ssd = " + this.ssd + ", ram = " + this.ram + ", operationSystem = " + this.operationSystem;
    }
}
