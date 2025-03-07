package ej7;

import java.util.ArrayList;
import java.util.List;

//En este ejercicio se está violando el OCP (open/closed principle)
//ya que si se quisiera agregar un enemigo con arma, se tendría que modificar 
//el código principal, lo cual no es rentable.

public class Game {
    List<Enemy> enemies=new ArrayList<Enemy>();

    public void init() {
        enemies.add(new GunEnemy());
        enemies.add(new KnifeEnemy());
    }

    void run() {
        boolean endGame=false;
        while (!endGame) {
            for (Enemy enemy: enemies){
                enemy.atack();
            }
        }
    }
}
