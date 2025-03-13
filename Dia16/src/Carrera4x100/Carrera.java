package Carrera4x100;

public class Carrera extends Thread {

    private String nombre;

    public Carrera(String s) {
        nombre = s;
    }

    @Override
    public void run() {

        synchronized (getClass()) {
            int range = (11 - 9) + 1;
            int timeRun = (int) ((range * Math.random()) + 9);
            int milisegundos = timeRun * 1000;
            
            System.out.println("Arranca corredor "+ nombre);

            try {
                Thread.sleep(milisegundos);
                System.out.println("Corredor " + nombre + ", completó su trayecto en " + timeRun + "S\n");

                getClass().notifyAll();
                try {
                    getClass().wait();
                } catch (InterruptedException e) {
                    getClass().notifyAll();
                }
                getClass().notifyAll();

            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}