package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass {

    /* 메소드명, 리턴타입, 매개변수 개수&타입&순서 일치해야 한다 */
    @Override
    public void method(int num) {}

//    @Override
//    public void method(String str) {} (x)
//    public int method(int num) {} (x)
//    public void method2(int num) {} (x)
//    public void method2(int num2) {}

    /* private 메소드 오버라이딩 불가 */
//    @Override
//    private void method(int num) {} (x)

    /* final 메소드 오버라이딩 불가 */
//    @Override
//    public final void method(int num) {} (x)

    /* protected -> default로 변경 : 보다 좁은 범위로 변경하는 것은 불가능 */

    @Override
    protected void protectedMethod() {}
//    @Override
//    void protectedMethod() {} (x)

    /* protected -> public로 변경 : 보다 넓은 범위로 변경하는 것은 가능 */
//    @Override
//    public void protectedMethod() {} (o)




}
