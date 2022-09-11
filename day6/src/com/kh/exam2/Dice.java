package com.kh.exam2;

public class Dice {

    //맴버 필드
    private int faceValue; // 주사위 눈의 상태값

    public Dice(){
        this.faceValue = 1;
    }

    //맴버 메소드
    //주사위를 굴리는 행위
    //this : new 생성자메소드()로 생성될 인스턴스(객체)
    public void roll() {
        this.faceValue = (int) Math.floor(Math.random() * 6 + 1);
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void SetFaceValue(int num) {
        if (num >= 1 && num <= 6) {
            this.faceValue = num;
        }
    }
}
