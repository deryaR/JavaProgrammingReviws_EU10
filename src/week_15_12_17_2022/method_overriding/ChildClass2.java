package week_15_12_17_2022.method_overriding;

//Human
public class ChildClass2 extends ParentClass{


    @Override
    protected void move() {
        System.out.println("Humans are walking");
    }
}