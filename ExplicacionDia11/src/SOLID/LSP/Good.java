package SOLID.LSP;

abstract class Bird{}

class flyingBird extends Bird{
    public void fly(){
        System.out.println("Volando....");
    }
}

class Peguin extends Bird{
    public void swim(){
        System.out.println("Nadando...");
    }
}