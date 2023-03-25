package SolidPrinciples.v3;

public class Eagle extends Bird implements IFlyable {
    FlyingBehaviour flyingBehaviour = new HighFlyingBehaviour();
    public void fly(){
        flyingBehaviour.fly();
    }
}
