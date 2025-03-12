package Thread2;

public class main {
    public static void main(String[] args) {
        Counter contador1 = new Counter();
        Counter contador2 = new Counter();
        
        contador1.start();
        contador2.start();
        
        System.out.println(contador1.value());
        System.out.println(contador2.value());
    }
}
