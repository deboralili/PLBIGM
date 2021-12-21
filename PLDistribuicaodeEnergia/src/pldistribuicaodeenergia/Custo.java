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
public class Custo extends Variavel{
    Oferta oferta;
    Empresa empresa;
    
    public Custo(Oferta oferta, Empresa empresa, int valor){
        this.empresa = empresa;
        this.oferta = oferta;
        this.valor = valor;
    }

    @Override
    public int getIDemp() {
        return this.empresa.id;
    }

    @Override
    public int getIDofer() {
        return this.oferta.id;
    }
    
    public static ArrayList<Custo> criarVariaveisCusto(ArrayList<Empresa> listaEmpresa, ArrayList<Oferta> listaOferta){
        Oferta oferta1 = listaOferta.get(0);
        Oferta oferta2 = listaOferta.get(1);
        Oferta oferta3 = listaOferta.get(2);
        Oferta oferta4 = listaOferta.get(3);
        Oferta oferta5 = listaOferta.get(4);
        Oferta oferta6 = listaOferta.get(5);
        Oferta oferta7 = listaOferta.get(6);
        Oferta oferta8 = listaOferta.get(7);
        Oferta fake = listaOferta.get(8);
        
        Empresa empresa1 = listaEmpresa.get(0);
        Empresa empresa2 = listaEmpresa.get(1);
        Empresa empresa3 = listaEmpresa.get(2);
        Empresa empresa4 = listaEmpresa.get(3);
        Empresa empresa5 = listaEmpresa.get(4);
        Empresa empresa6 = listaEmpresa.get(5);
        Empresa empresa7 = listaEmpresa.get(6);
        Empresa empresa8 = listaEmpresa.get(7);
        Empresa empresa9 = listaEmpresa.get(8);
        Empresa empresa10 = listaEmpresa.get(9);
        Empresa empresa11 = listaEmpresa.get(10);
        Empresa empresa12 = listaEmpresa.get(11);
        
        Custo custo1 = new Custo(oferta1, empresa1, 8);
        Custo custo2 = new Custo(oferta1, empresa2, 28);
        Custo custo3 = new Custo(oferta1, empresa3, 14);
        Custo custo4 = new Custo(oferta1, empresa4, 30);
        Custo custo5 = new Custo(oferta1, empresa5, 13);
        Custo custo6 = new Custo(oferta1, empresa6, 29);
        Custo custo7 = new Custo(oferta1, empresa7, 31);
        Custo custo8 = new Custo(oferta1, empresa8, 16);
        Custo custo9 = new Custo(oferta1, empresa9, 18);
        Custo custo10 = new Custo(oferta1, empresa10, 19);
        Custo custo11 = new Custo(oferta1, empresa11, 22);
        Custo custo12 = new Custo(oferta1, empresa12, 29);
        Custo custo13 = new Custo(oferta2, empresa1, 32);
        Custo custo14 = new Custo(oferta2, empresa2, 35);
        Custo custo15 = new Custo(oferta2, empresa3, 22);
        Custo custo16 = new Custo(oferta2, empresa4, 15);
        Custo custo17 = new Custo(oferta2, empresa5, 13);
        Custo custo18 = new Custo(oferta2, empresa6, 10);
        Custo custo19 = new Custo(oferta2, empresa7, 13);
        Custo custo20 = new Custo(oferta2, empresa8, 22);
        Custo custo21 = new Custo(oferta2, empresa9, 10);
        Custo custo22 = new Custo(oferta2, empresa10, 26);
        Custo custo23 = new Custo(oferta2, empresa11, 23);
        Custo custo24 = new Custo(oferta2, empresa12, 20);
        Custo custo25 = new Custo(oferta3, empresa1, 29);
        Custo custo26 = new Custo(oferta3, empresa2, 20);
        Custo custo27 = new Custo(oferta3, empresa3, 25);
        Custo custo28 = new Custo(oferta3, empresa4, 12);
        Custo custo29 = new Custo(oferta3, empresa5, 11);
        Custo custo30 = new Custo(oferta3, empresa6, 32);
        Custo custo31 = new Custo(oferta3, empresa7, 16);
        Custo custo32 = new Custo(oferta3, empresa8, 21);
        Custo custo33 = new Custo(oferta3, empresa9, 28);
        Custo custo34 = new Custo(oferta3, empresa10, 12);
        Custo custo35 = new Custo(oferta3, empresa11, 12);
        Custo custo36 = new Custo(oferta3, empresa12, 22);
        Custo custo37 = new Custo(oferta4, empresa1, 25);
        Custo custo38 = new Custo(oferta4, empresa2, 30);
        Custo custo39 = new Custo(oferta4, empresa3, 24);
        Custo custo40 = new Custo(oferta4, empresa4, 18);
        Custo custo41 = new Custo(oferta4, empresa5, 31);
        Custo custo42 = new Custo(oferta4, empresa6, 9);
        Custo custo43 = new Custo(oferta4, empresa7, 8);
        Custo custo44 = new Custo(oferta4, empresa8, 23);
        Custo custo45 = new Custo(oferta4, empresa9, 31);
        Custo custo46 = new Custo(oferta4, empresa10, 27);
        Custo custo47 = new Custo(oferta4, empresa11, 12);
        Custo custo48 = new Custo(oferta4, empresa12, 10);
        Custo custo49 = new Custo(oferta5, empresa1, 10);
        Custo custo50 = new Custo(oferta5, empresa2, 9);
        Custo custo51 = new Custo(oferta5, empresa3, 24);
        Custo custo52 = new Custo(oferta5, empresa4, 29);
        Custo custo53 = new Custo(oferta5, empresa5, 25);
        Custo custo54 = new Custo(oferta5, empresa6, 33);
        Custo custo55 = new Custo(oferta5, empresa7, 21);
        Custo custo56 = new Custo(oferta5, empresa8, 11);
        Custo custo57 = new Custo(oferta5, empresa9, 14);
        Custo custo58 = new Custo(oferta5, empresa10, 26);
        Custo custo59 = new Custo(oferta5, empresa11, 34);
        Custo custo60 = new Custo(oferta5, empresa12, 10);
        Custo custo61 = new Custo(oferta6, empresa1, 12);
        Custo custo62 = new Custo(oferta6, empresa2, 30);
        Custo custo63 = new Custo(oferta6, empresa3, 9);
        Custo custo64 = new Custo(oferta6, empresa4, 9);
        Custo custo65 = new Custo(oferta6, empresa5, 13);
        Custo custo66 = new Custo(oferta6, empresa6, 22);
        Custo custo67 = new Custo(oferta6, empresa7, 34);
        Custo custo68 = new Custo(oferta6, empresa8, 19);
        Custo custo69 = new Custo(oferta6, empresa9, 11);
        Custo custo70 = new Custo(oferta6, empresa10, 27);
        Custo custo71 = new Custo(oferta6, empresa11, 16);
        Custo custo72 = new Custo(oferta6, empresa12, 19);
        Custo custo73 = new Custo(oferta7, empresa1, 19);
        Custo custo74 = new Custo(oferta7, empresa2, 26);
        Custo custo75 = new Custo(oferta7, empresa3, 9);
        Custo custo76 = new Custo(oferta7, empresa4, 27);
        Custo custo77 = new Custo(oferta7, empresa5, 24);
        Custo custo78 = new Custo(oferta7, empresa6, 33);
        Custo custo79 = new Custo(oferta7, empresa7, 35);
        Custo custo80 = new Custo(oferta7, empresa8, 23);
        Custo custo81 = new Custo(oferta7, empresa9, 9);
        Custo custo82 = new Custo(oferta7, empresa10, 26);
        Custo custo83 = new Custo(oferta7, empresa11, 33);
        Custo custo84 = new Custo(oferta7, empresa12, 21);
        Custo custo85 = new Custo(oferta8, empresa1, 10);
        Custo custo86 = new Custo(oferta8, empresa2, 18);
        Custo custo87 = new Custo(oferta8, empresa3, 25);
        Custo custo88 = new Custo(oferta8, empresa4, 21);
        Custo custo89 = new Custo(oferta8, empresa5, 23);
        Custo custo90 = new Custo(oferta8, empresa6, 19);
        Custo custo91 = new Custo(oferta8, empresa7, 26);
        Custo custo92 = new Custo(oferta8, empresa8, 19);
        Custo custo93 = new Custo(oferta8, empresa9, 27);
        Custo custo94 = new Custo(oferta8, empresa10, 33);
        Custo custo95 = new Custo(oferta8, empresa11, 27);
        Custo custo96 = new Custo(oferta8, empresa12, 34);
        Custo custo97 = new Custo(fake, empresa1, 0);
        Custo custo98 = new Custo(fake, empresa2, 0);
        Custo custo99 = new Custo(fake, empresa3, 0);
        Custo custo100 = new Custo(fake, empresa4, 0);
        Custo custo101 = new Custo(fake, empresa5, 0);
        Custo custo102 = new Custo(fake, empresa6, 0);
        Custo custo103 = new Custo(fake, empresa7, 0);
        Custo custo104 = new Custo(fake, empresa8, 0);
        Custo custo105 = new Custo(fake, empresa9, 0);
        Custo custo106 = new Custo(fake, empresa10, 0);
        Custo custo107 = new Custo(fake, empresa11, 0);
        Custo custo108 = new Custo(fake, empresa12, 0);

        ArrayList<Custo> listaVariaveis = new ArrayList<Custo>();
        listaVariaveis.add(custo1);
        listaVariaveis.add(custo2);
        listaVariaveis.add(custo3);
        listaVariaveis.add(custo4);
        listaVariaveis.add(custo5);
        listaVariaveis.add(custo6);
        listaVariaveis.add(custo7);
        listaVariaveis.add(custo8);
        listaVariaveis.add(custo9);
        listaVariaveis.add(custo10);
        listaVariaveis.add(custo11);
        listaVariaveis.add(custo12);
        listaVariaveis.add(custo13);
        listaVariaveis.add(custo14);
        listaVariaveis.add(custo15);
        listaVariaveis.add(custo16);
        listaVariaveis.add(custo17);
        listaVariaveis.add(custo18);
        listaVariaveis.add(custo19);
        listaVariaveis.add(custo20);
        listaVariaveis.add(custo21);
        listaVariaveis.add(custo22);
        listaVariaveis.add(custo23);
        listaVariaveis.add(custo24);
        listaVariaveis.add(custo25);
        listaVariaveis.add(custo26);
        listaVariaveis.add(custo27);
        listaVariaveis.add(custo28);
        listaVariaveis.add(custo29);
        listaVariaveis.add(custo30);
        listaVariaveis.add(custo31);
        listaVariaveis.add(custo32);
        listaVariaveis.add(custo33);
        listaVariaveis.add(custo34);
        listaVariaveis.add(custo35);
        listaVariaveis.add(custo36);
        listaVariaveis.add(custo37);
        listaVariaveis.add(custo38);
        listaVariaveis.add(custo39);
        listaVariaveis.add(custo40);
        listaVariaveis.add(custo41);
        listaVariaveis.add(custo42);
        listaVariaveis.add(custo43);
        listaVariaveis.add(custo44);
        listaVariaveis.add(custo45);
        listaVariaveis.add(custo46);
        listaVariaveis.add(custo47);
        listaVariaveis.add(custo48);
        listaVariaveis.add(custo49);
        listaVariaveis.add(custo50);
        listaVariaveis.add(custo51);
        listaVariaveis.add(custo52);
        listaVariaveis.add(custo53);
        listaVariaveis.add(custo54);
        listaVariaveis.add(custo55);
        listaVariaveis.add(custo56);
        listaVariaveis.add(custo57);
        listaVariaveis.add(custo58);
        listaVariaveis.add(custo59);
        listaVariaveis.add(custo60);
        listaVariaveis.add(custo61);
        listaVariaveis.add(custo62);
        listaVariaveis.add(custo63);
        listaVariaveis.add(custo64);
        listaVariaveis.add(custo65);
        listaVariaveis.add(custo66);
        listaVariaveis.add(custo67);
        listaVariaveis.add(custo68);
        listaVariaveis.add(custo69);
        listaVariaveis.add(custo70);
        listaVariaveis.add(custo71);
        listaVariaveis.add(custo72);
        listaVariaveis.add(custo73);
        listaVariaveis.add(custo74);
        listaVariaveis.add(custo75);
        listaVariaveis.add(custo76);
        listaVariaveis.add(custo77);
        listaVariaveis.add(custo78);
        listaVariaveis.add(custo79);
        listaVariaveis.add(custo80);
        listaVariaveis.add(custo81);
        listaVariaveis.add(custo82);
        listaVariaveis.add(custo83);
        listaVariaveis.add(custo84);
        listaVariaveis.add(custo85);
        listaVariaveis.add(custo86);
        listaVariaveis.add(custo87);
        listaVariaveis.add(custo88);
        listaVariaveis.add(custo89);
        listaVariaveis.add(custo90);
        listaVariaveis.add(custo91);
        listaVariaveis.add(custo92);
        listaVariaveis.add(custo93);
        listaVariaveis.add(custo94);
        listaVariaveis.add(custo95);
        listaVariaveis.add(custo96);
        listaVariaveis.add(custo97);
        listaVariaveis.add(custo98);
        listaVariaveis.add(custo99);
        listaVariaveis.add(custo100);
        listaVariaveis.add(custo101);
        listaVariaveis.add(custo102);
        listaVariaveis.add(custo103);
        listaVariaveis.add(custo104);
        listaVariaveis.add(custo105);
        listaVariaveis.add(custo106);
        listaVariaveis.add(custo107);
        listaVariaveis.add(custo108);
        
        return listaVariaveis;
    }
    
}
