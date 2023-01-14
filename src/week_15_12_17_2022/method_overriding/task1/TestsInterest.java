package week_15_12_17_2022.method_overriding.task1;

import week_15_12_17_2022.method_overriding.task1.Akbank;

public class TestsInterest {

    public static void main(String[] args) {
        week15_12_17_2022.method_overriding.task1.Bank bank=new week15_12_17_2022.method_overriding.task1.Bank();
        bank.calculateTheInterest();
        System.out.println("=================");
        Akbank akbank=new Akbank();
        akbank.calculateTheInterest();

        System.out.println("=================");

        week15_12_17_2022.method_overriding.task1.GarantiBank garantiBank=new week15_12_17_2022.method_overriding.task1.GarantiBank();
        garantiBank.calculateTheInterest();

        System.out.println("=================");
        week15_12_17_2022.method_overriding.task1.INGBank ingBank=new week15_12_17_2022.method_overriding.task1.INGBank();
        ingBank.calculateTheInterest();
        TestsInterest testsInterest=new TestsInterest();

        System.out.println(testsInterest.getClass().getSimpleName());

    }
}