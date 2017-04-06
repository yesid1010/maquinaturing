/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina;

/**
 *
 * @author yesidsanchezer
 */
public class Maquina {

    /**
     * @param args the command line arguments
     */
    private int cont = 0;
    boolean aceptado;
    char[] car;

    public static void main(String[] args) {

         Maquina maq = new Maquina();
        String cadena = "aaaaaaaaaaaaaaaaaaaaaaaaaaaabbb";
        maq.car = cadena.toCharArray();
        maq.inicio();
        
        if (maq.aceptado){
            System.out.println("cadena aceptada");
        }else {
            System.out.println("cadena no aceptada");
        }
        
    }

    private void inicio() {
        cont = 0;
        aceptado = false;
        q0();
    }

    private void q0() {
        System.out.println(" en q0");
        if (cont < car.length ){
            if (car[cont]=='a'){
                cont++;
                q0();
            }else if(car[cont]=='b'){
                cont++;
                q1();
            }
        }
    }

    private void q1() {
         System.out.println(" en q1");
        if (cont < car.length ){
            if (car[cont]=='a'){
                cont++;
                q1();
            }else if(car[cont]=='b'){
                cont++;
                q2();
            }
        }
    }

    private void q2() {
         System.out.println(" en q2");
        if (cont < car.length ){
            if (car[cont]=='a'){
                cont++;
                q2();
            }else if(car[cont]=='b'){
                cont++;
                q3();
            }
        }
    }

    private void q3() {
         System.out.println(" en q3");
         aceptado = true;
        if (cont < car.length ){
            if (car[cont]=='a'){
                cont++;
                q3();
            }else if(car[cont]=='b'){
                cont++;
                qError();
            }
        }
    }

    private void qError() {
        aceptado = false;
        return;
    }
    }
