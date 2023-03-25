package SolidPrinciples.v3;

public class Hen extends Bird implements IFlyable{
    public void fly(){
        FlyingBehaviour flyingBehaviour = new LowFlyingBehaviour();
        flyingBehaviour.fly();
    }
}
