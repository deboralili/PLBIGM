/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pldistribuicaodeenergia;

import java.util.ArrayList;

/**
 *
 * @author Débora
 */
public class Oferta {
    int id;
    int aquisicao;
    
    public Oferta(int id, int aquisicao){
        this.id = id;
        this.aquisicao = aquisicao;
    }
    
    public static ArrayList<Oferta> adicionarDadosOferta(){
        Oferta oferta1 = new Oferta(1, 8100);
        Oferta oferta2 = new Oferta(2, 7500);
        Oferta oferta3 = new Oferta(3, 6300);
        Oferta oferta4 = new Oferta(4, 5100);
        Oferta oferta5 = new Oferta(5, 7200);
        Oferta oferta6 = new Oferta(6, 7000);
        Oferta oferta7 = new Oferta(7, 9700);
        Oferta oferta8 = new Oferta(8, 6300);
        Oferta fake = new Oferta(9, 2290);

        ArrayList<Oferta> listaOferta = new ArrayList<Oferta>();
        listaOferta.add(oferta1);
        listaOferta.add(oferta2);
        listaOferta.add(oferta3);
        listaOferta.add(oferta4);
        listaOferta.add(oferta5);
        listaOferta.add(oferta6);
        listaOferta.add(oferta7);
        listaOferta.add(oferta8);
        listaOferta.add(fake);
        
        return listaOferta;
    }
}
