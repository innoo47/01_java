package com.ohgiraffers.section01.ocp.basic.phoneplan.start;

public class SaverPlan implements PhonePlan{
    @Override
    public String getName() {
        return "알뜰 요금제";
    }

    @Override
    public int fee(int usedGb) {
        int result = usedGb * 3000;
        if(result > 30000){
            return 30000;
        }
        return result;
    }
}
