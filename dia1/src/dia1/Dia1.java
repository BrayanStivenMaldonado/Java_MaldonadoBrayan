package dia1;
// CICLOS JAVA

import java.util.*;




public class Dia1 {
    
    public static String obtenerComplementoA1(String binario) {
        StringBuilder complemento = new StringBuilder();
        for (char bit : binario.toCharArray()) {
            complemento.append(bit == '0' ? '1' : '0');
        }
        return complemento.toString();
    }
    
    public static String obtenerComplementoA2(String binario) {
        StringBuilder complemento = new StringBuilder();
        for (char bit : binario.toCharArray()) {
            complemento.append(bit == '0' ? '1' : '0');
        }
        StringBuilder resultado = new StringBuilder(complemento.toString());
        int carry = 1;
        for (int i = resultado.length() - 1; i >= 0; i--) {
            if (resultado.charAt(i) == '1' && carry == 1) {
                resultado.setCharAt(i, '0');
            } else if (carry == 1) {
                resultado.setCharAt(i, '1');
                carry = 0;
                break;
            }
        }
         if (carry == 1) {
            resultado.insert(0, '1');
        }
        return resultado.toString();
    }
    
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese el número del ejercicio que desea ver: ");
        int num = scan.nextInt();
        
        switch(num){
            case 1:
                System.out.println("imprimir todos los números naturales del 1 al n. \n");
                System.out.println("Ingrese el numero maximo: ");
                int a = scan.nextInt();
                System.out.println(" ");
                
                for(int i=0; i<a; i++){
                    System.out.println(i+1);
                }
                break;
            
            case 2:
                System.out.println("imprimir todos los números naturales en orden inverso.");
                System.out.println("Ingrese el numero n: ");
                int b = scan.nextInt();
                System.out.println(" ");
                
                for(int i=b; i>0; i--){
                    System.out.println(i);
                }
                break;
                       
            case 3:
                System.out.println("imprimir tablas de multiplicar.");
                System.out.println("Ingrese el numero de la tabla que desea ver: ");
                int c = scan.nextInt();
                System.out.println(" ");
                
                for(int i=1; i<11; i++){
                    int total = i*c;
                    System.out.println(c+" x "+i+" = "+total);
                }
                break;
                
            case 4:
                System.out.println("imprimir tablas de multiplicar en orden inverso.");
                System.out.println("Ingrese el numero de la tabla que desea ver: ");
                int d = scan.nextInt();
                System.out.println(" ");
                
                for(int i=10; i>0; i--){
                    int tot = i*d;
                    System.out.println(d+" * "+i+" = "+tot);
                }
                break;
                
            case 5:
                System.out.println("imprimir todas las letras del alfabeto de la 'a' a la 'z'.\n");
                for(char i = 'a'; i<='z'; i ++ ){
                    System.out.println(i);
                }
                break;
                
            case 6: 
                System.out.println("imprimir el alfabeto en orden inverso, de la 'Z' a la 'A'. \n");
                for(char i = 'A'; i<='Z'; i ++ ){
                    System.out.println(i);
                }
                break;
                
            case 7:
                System.out.println("imprimir todos los números pares entre 1 y 100. \n");
                for(int i=1; i<100; i++){
                    if(i%2==0){
                        System.out.println(i);
                    }else{}       
                }
                break;
                
            case 8:
                System.out.println("imprimir todos los números impares entre 1 y 100. \n");
                for(int i=1; i<100; i++){
                    if(i%2!=0){
                        System.out.println(i);
                    }else{}       
                }
                break;
             
            case 9:
                System.out.println("encontrar la suma de todos los números naturales entre 1 y n. \n");
                System.out.println("Ingrese el numero 'n' \n");
                int e = scan.nextInt();               
                int count = 0;
                
                for(int i=1; i<e+1; i++){
                    count = count+i;
                }        
                System.out.println(count);       
                break;
                
            case 10:
                System.out.println("encontrar la suma de todos los números pares entre 1 y n.");
                System.out.println("Ingrese el numero 'n' \n");
                int f = scan.nextInt();
                
                int count1 = 0;
                for(int i=1; i<f+1; i++){
                    if(i%2 == 0){
                        count1 = count1+i;
                    }else{}
                }
                System.out.println(count1);
                break;
                   
            case 11:
                System.out.println("encontrar la suma de todos los números impares entre 1 y n.");
                System.out.println("Ingrese el numero 'n' \n");
                int g = scan.nextInt();
                
                int count2 = 0;
                for(int i=1; i<g+1; i++){
                    if(i%2 != 0){
                        count2 = count2+i;
                    }else{}
                }
                System.out.println(count2);
                break;
                
            case 12:
                System.out.println("imprimir los valores ASCII.");
                
                for(int i=0; i<= 255; i++){
                    System.out.println(i+" -> "+ (char)i);
                }
                
            case 13: 
                System.out.println("encontrar el factorial de cualquier número.");
                System.out.println("Ingrese el numero del que desea calcular su factorial.");
                int h = scan.nextInt();
                
                int factorial = 1;
                for(int i=h; i>0; i--){
                    factorial = factorial*i;
                }
                System.out.println(factorial);
                break;
                
            case 14:
                System.out.println("calcular el valor de un número elevado a la potencia de otro.");
                System.out.print("Ingrese el número a elevar: ");
                int elevar = scan.nextInt();
                System.out.print("Ingrese la potencia: ");
                int potencia = scan.nextInt();
                
                int totPotencia = 1;
                for(int i=0; i<potencia; i++){
                    totPotencia = totPotencia*elevar;
                }
                System.out.println(totPotencia);
                break;
                
            case 15:
                System.out.println("invertir los dígitos de un número dado."); 
                System.out.println("Ingrese el número: ");
                scan.nextLine();
                String numInvertir = scan.nextLine();
                
                String invertido = "";
                for(int i=numInvertir.length()-1;i>=0 ;i--){
                    invertido += numInvertir.charAt(i);
                }
                System.out.println(invertido);
                break;
                
            case 16:
                System.out.println("calcular la suma de los dígitos de un número.");
                System.out.println("n: ");
                int j = scan.nextInt();
                String numTexto = Integer.toString(j);
                
                int totalSumDigitos = 0;
                for(int i=0; i<numTexto.length();i++){
                    totalSumDigitos += Character.getNumericValue(numTexto.charAt(i));
                }
                System.out.println(totalSumDigitos);
                break;
             
            case 17:
                System.out.println("verificar si un número dado es primo o no.");
                System.out.println("n: ");
                int k = scan.nextInt();
                
                int esPrimo = 0;
                for(int i=1; i<11; i++){
                    if(k%i==0){
                        esPrimo++;
                    }else{}
                }
                
                if(esPrimo==2){
                    System.out.println(k+" Es un número primo");
                }else{
                    System.out.println(k+" No es un número primo");
                }
                break;
                
            case 18:
                System.out.println("calcular el MCD (Máximo Común Divisor) de dos números dados.");
                System.out.println("Ingrese los dos números");
                int aa = scan.nextInt();
                int bb = scan.nextInt();
                
                while(bb!=0){
                    int temp=bb;
                    bb=aa%bb;
                    aa=temp;
                }
                System.out.println("el MCD es: "+aa);
                break;
                
            case 19:
                System.out.println("ingresar números hasta que el usuario lo desee y, al final, muestre la cantidad de números positivos, negativos y ceros ingresados.");
                System.out.println("Qué cantidad de números desea ingresar? ");
                int cantidadNums = scan.nextInt();
                ArrayList<Integer> listNums = new ArrayList<Integer>();
                
                for(int i=0; i<cantidadNums; i++){
                    int guardar = scan.nextInt();
                    listNums.add(guardar);
                }
    
                int positivos = 0;
                int negativos = 0;
                int ceros = 0;
                for(int i=0; i<listNums.size(); i++){
                    if(listNums.get(i)== 0){
                        ceros++;
                    }else if(listNums.get(i)>0){
                        positivos++;
                    }else{
                        negativos++;
                    }
                }       
                System.out.println("negativos: "+negativos+"\nceros: "+ceros+"\npositivos: "+positivos);
                break;
                
                
            case 20:
                System.out.println("ingresar números hasta que el usuario lo desee y, al final, muestre el número más grande y el más pequeño ingresado.");
                System.out.println("Qué cantidad de números desea ingresar? ");
                int cantidadN = scan.nextInt();
                
                ArrayList<Integer> listN = new ArrayList<Integer>();
                
                for(int i=0; i<cantidadN; i++){
                    int guardar = scan.nextInt();
                    listN.add(guardar);
                }
                
                int mayor = 0;
                int menor = 4;
                for(int i=0; i<listN.size(); i++){
                    if(listN.get(i)<menor){
                        menor = listN.get(i);
                    }else if(listN.get(i)>mayor){
                        mayor = listN.get(i);
                    }
                }
                
                System.out.println("mayor: "+mayor+"\nmenor: "+menor);
                break;
                
            case 21:
                System.out.println("encontrar los números y la suma de todos los enteros entre 100 y 200 que sean divisibles por 9.");
                
                ArrayList<Integer> List9 = new ArrayList<Integer>();
                
                for(int i=100; i<200; i++){
                    if(i%9==0){
                        List9.add(i);
                    }
                }
                int total = 0;
                for(int i=0; i<List9.size(); i++){
                    total+=List9.get(i);
                }
                System.out.println(List9);
                System.out.println(total);
                break;
                
            case 22:
                System.out.println("convertir un número binario a decimal sin usar arreglos, funciones ni bucles while.");
                System.out.println("Ingrese su número binario");
                scan.nextLine();
                String s = scan.nextLine();
                int suma = 0;
                int cont = s.length();
                 
                for(int i=0; i<s.length(); i++){
                    int n = s.charAt(i)-'0';
                    int n2 = 1;
                    for(int dj=1; dj< cont; dj++){
                        n2*=2;
                    }
                    cont--;
                    suma+=(n2*n);
                }
                System.out.println(suma);
                break;
                
            case 23:
                System.out.println("verificar si un número es un Número Fuerte o no.");
                scan.nextLine();
                String fort = scan.nextLine();
                
                
                int ver = 0;
                for(int i=0; i<fort.length(); i++){
                    int fo = fort.charAt(i)-'0';
                      
                    int sumFact = 1;
                    for(int x=fo; x>0; x--){
                        sumFact = sumFact*x;
                    }
                    ver+=sumFact;
                }
                
                if(ver == Integer.parseInt(fort)){
                    System.out.println(fort+" es un número fuerte");
                }else{
                    System.out.println(fort+" no es un número fuerte");
                }
                break;
                
                
            case 24:
                System.out.println("convertir un número hexadecimal a decimal.");
                System.out.print("Ingrese un número hexadecimal: ");
                    String hex = scan.nextLine();
                    System.out.println("Decimal: " + Integer.parseInt(hex, 16));
                    break;
                
            case 25:
                System.out.println("convertir un número hexadecimal a octal.");
                System.out.print("Ingrese un número hexadecimal: ");
                    hex = scan.nextLine();
                    System.out.println("Octal: " + Integer.toOctalString(Integer.parseInt(hex, 16)));
                    break;
                
            case 26:
                System.out.println("convertir un número hexadecimal a binario.");
                System.out.print("Ingrese un número hexadecimal: ");
                    hex = scan.nextLine();
                    System.out.println("Binario: " + Integer.toBinaryString(Integer.parseInt(hex, 16)));
                    break;
                
            case 27:
                System.out.println("convertir un número decimal a hexadecimal.");
                System.out.println("Ingrese el número decimal: ");
                int decimalToH = scan.nextInt();
                String hexa = Integer.toHexString(decimalToH).toUpperCase();
                System.out.println("El número es: "+hexa);
                
            case 28:
                System.out.println("convertir un número decimal a octal.");
                System.out.println("Ingrese el número decimal: ");
                int decimalToO = scan.nextInt();
                String octal = Integer.toOctalString(decimalToO);
                System.out.println("El número octal es: "+octal);
                
            case 29:
                System.out.println("convertir un número decimal a binario.");
                System.out.print("Ingrese un número decimal: ");
                    int decimal = scan.nextInt();
                    System.out.println("Binario: " + Integer.toBinaryString(decimal));
                    break;
                
            case 30:
                System.out.println("convertir un número binario a octal.");
                System.out.print("Ingrese un número binario: ");
                    String bin = scan.nextLine();
                    System.out.println("Octal: " + Integer.toOctalString(Integer.parseInt(bin, 2)));
                    break;
                
            case 31:
                System.out.println("convertir un número binario a decimal.");
                System.out.print("Ingrese un número binario: ");
                    bin = scan.nextLine();
                    System.out.println("Decimal: " + Integer.parseInt(bin, 2));
                    break;
                
            case 32:
                System.out.println("convertir un número binario a hexadecimal.");
                System.out.print("Ingrese un número binario: ");
                    bin = scan.nextLine();
                    System.out.println("Hexadecimal: " + Integer.toHexString(Integer.parseInt(bin, 2)));
                    break;
                
            case 33:
                System.out.println("convertir un número octal a binario.");
                System.out.print("Ingrese un número octal: ");
                    String octa = scan.nextLine();
                    System.out.println("Binario: " + Integer.toBinaryString(Integer.parseInt(octa, 8)));
                    break;
                
            case 34:
                System.out.println("convertir un número octal a binario.");
                System.out.print("Ingrese un número octal: ");
                    octa = scan.nextLine();
                    System.out.println("Decimal: " + Integer.parseInt(octa, 8));
                    break;
                
            case 35:
                System.out.println("convertir un número octal a hexadecimal.");
                System.out.print("Ingrese un número octal: ");
                    octa = scan.nextLine();
                    System.out.println("Hexadecimal: " + Integer.toHexString(Integer.parseInt(octa, 8)));
                    break;
                
            case 36:
                System.out.println("encontrar el complemento a 1 de un número en Java.");
                System.out.print("Ingrese un número entero: ");
                int numero = scan.nextInt();

                String binario1 = Integer.toBinaryString(numero);
                String complemento = obtenerComplementoA1(binario1);

                System.out.println("Número en binario: " + binario1);
                System.out.println("Complemento a 1: " + complemento);
                
            case 37:
                System.out.println("encontrar el complemento a 2 de un número binario en Java.");
                    System.out.print("Ingrese un número binario: ");
                    String binario2 = scan.nextLine();

                    String complementoA2 = obtenerComplementoA2(binario2);
                    System.out.println("El complemento a 2 es: " + complementoA2);
                    break;
                
            case 38:
                System.out.println("imprimir la serie de Fibonacci hasta n términos.");
                int fibona = scan.nextInt();
                int aFibo = 0, bFibo = 1;
                
                for(int i=0; i<fibona;i++){
                    System.out.println(aFibo+"");
                    int t = aFibo;
                    aFibo = bFibo;
                    bFibo = bFibo+ t;
                }
                
            case 39:
                System.out.println("verificar si un número es un Número Fuerte o no.");
                System.out.println("Ingrese el número que desea revisar si es fuerte");
                scan.nextLine();
                String fort1 = scan.nextLine();
                
                
                int ver1 = 0;
                for(int i=0; i<fort1.length(); i++){
                    int fo1 = fort1.charAt(i)-'0';
                      
                    int sumFact1 = 1;
                    for(int x=fo1; x>0; x--){
                        sumFact1 = sumFact1*x;
                    }
                    ver1+=sumFact1;
                }
                
                if(ver1 == Integer.parseInt(fort1)){
                    System.out.println(fort1+" es un número fuerte");
                }else{
                    System.out.println(fort1+" no es un número fuerte");
                }
                break;
                
            case 40:
                System.out.println("imprimir todos los Números Fuertes del 1 al 100000.");
                
                for(int i=1; i<100000; i++){
                    int pruebaFuerte = 0;
                    String probar = Integer.toString(i);
                    for(int y=0; y<probar.length(); y++){
                        int prob = probar.charAt(y)-'0';
                        
                        int sumFa = 1;
                        for(int x=prob; x>0; x--){
                            sumFa = sumFa*x;
                        }
                        pruebaFuerte += sumFa;
                        if(pruebaFuerte == Integer.parseInt(probar)){
                            System.out.println(probar);
                        }
                    }
                }
                break;
                
            case 41:
                System.out.println("imprimir todos los Números Perfectos del 1 al 10000.");
                
                for(int i=1; i<100000; i++){
                    int verificacion = 0;
                    for(int x=1; x<10000; x++){
                        if(i%x==0 && i!=x){
                            verificacion += x;
                        }
                    }
                    if(verificacion == i){
                        System.out.println(i);
                    }
                }
                break;
                
            case 42:
                System.out.println("verificar si un número es un Número Perfecto o no."); 
                System.out.println("Ingrese el número que desea comprobar que sea perfecto");
                int perfecto = scan.nextInt();
                
                int verif = 0;
                for(int i=1; i<10000; i++){
                    if(perfecto%i==0 && i!= perfecto){
                        verif+=i;
                    }
                }
                
                if(perfecto == verif){
                    System.out.println(perfecto+" es un número perfecto");
                }else{
                    System.out.println(perfecto+" no es un número perfecto");
                }
                break;
                
            case 43:
                System.out.println("imprimir todos los Números de Armstrong entre 1 y 1000.");
                for(int p=1; p<1000; p++){
                    String toStr = Integer.toString(p);
                    int contArms = toStr.length();
                    int toArms = 0;
                    
                    for(int i=0; i<contArms; i++){
                        int foArms = toStr.charAt(i)-'0';
                        int toFoArms =(int) Math.pow(foArms, contArms);
                        toArms += toFoArms;
                    }
                    if(toArms == Integer.parseInt(toStr)){
                        System.out.println(toStr);
                    }
                }
                break;
            
            case 44:
                System.out.println("verificar si un número es un Número de Armstrong o no.");
                System.out.println("Ingrese el numero que desea comprobar si es de Armstrong: ");
                scan.nextLine();
                String Arm = scan.nextLine();
                int contArm = Arm.length();
                
                int toArm = 0;
                for(int i=0; i<contArm; i++){
                    int foArm = Arm.charAt(i)-'0';
                    int toFoArm = (int) Math.pow(foArm, contArm);
                    toArm += toFoArm;
                }       
                if(toArm == Integer.parseInt(Arm)){
                    System.out.println(Arm+" es un número de Armstrong");
                }else{
                    System.out.println(Arm+" no es un número de Armstrong");
                }
                break;
                
            case 45:
                System.out.println("imprimir los factores primos en Java.");
                System.out.println("n: ");
                int factores = scan.nextInt();
                ArrayList<Integer> facto = new ArrayList<Integer>();
                
                for(int i=1; i<factores; i++){
                    if(factores%i == 0){
                        facto.add(i);               
                    }
                }
        }
    }
}

