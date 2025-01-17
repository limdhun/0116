package org.example.ex2;

import java.util.Scanner;

//로직 위주의 객체
//인스턴스 변수 - 조력자/협력자
//실제 객체가 뭔진 모르고, 외부에서 나한테 찔러 주는게 의존성 주입
public class CalcUI {
    Calculator calculator;

    public CalcUI(Calculator calculator){
        this.calculator = calculator;
    }

    public void startUI(){
        System.out.println(Calculator.key);// 이건 됨
        //Calculator.key=1;  //public이어도 이건 안됨. 인터페이스에 선언한 값은 고정,.


        Scanner scanner = new Scanner(System.in);
        System.out.println("num1");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("num2");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println(calculator.add(num1, num2));


    }
}
