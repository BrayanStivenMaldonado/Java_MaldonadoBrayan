package PatronesDeDiseño_Estructurales.Decorator;

//Decorator
//Añade funcionalidades a un objeto sin modificar su estructura.

//Ejemplo:
//Agregar características extras a un café
public class main {
    //Componente base
    interface Coffee{
        String getDescription();
        double cost();
    }
    
    //Implementación base
    static class SimpleCoffee implements Coffee{
        public String getDescription(){
            return "Café simple";
        }
        
        public double cost(){
            return 5.0;
        }
    }
        
    //Decorador abstracto
    static abstract class CoffeeDecorator implements Coffee{
        protected Coffee coffee;
        
        public CoffeeDecorator(Coffee coffee){
            this.coffee = coffee;
        }
        
        public String getDescription(){
            return coffee.getDescription();
        }
        
        public double cost(){
            return coffee.cost();
        }
    }
    
    //Decorador Concreto
    static class MilkDecorator extends CoffeeDecorator{
        public MilkDecorator(Coffee coffee){
            super(coffee);
        }
        
        public String getDescription(){
            return coffee.getDescription() + ", con leche";
        }
        
        public double cost(){
            return coffee.cost()+1.5;
        }
    }
    
    //Uso del patrón decorador
    public static void main(String[] args) {
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription()+ " $" +myCoffee.cost());
        
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription()+ " $" +myCoffee.cost());
    }
    
}
