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
public class Empresa {

    int id;
    int demanda;

    public Empresa(int id, int demanda) {
        this.id = id;
        this.demanda = demanda;
    }

    public static ArrayList<Empresa> adicionarDadosEmpresa() {
        Empresa empresa1 = new Empresa(1, 3280);
        Empresa empresa2 = new Empresa(2, 1650);
        Empresa empresa3 = new Empresa(3, 3830);
        Empresa empresa4 = new Empresa(4, 6180);
        Empresa empresa5 = new Empresa(5, 6600);
        Empresa empresa6 = new Empresa(6, 5990);
        Empresa empresa7 = new Empresa(7, 4510);
        Empresa empresa8 = new Empresa(8, 6410);
        Empresa empresa9 = new Empresa(9, 3680);
        Empresa empresa10 = new Empresa(10, 6390);
        Empresa empresa11 = new Empresa(11, 5560);
        Empresa empresa12 = new Empresa(12, 5410);

        ArrayList<Empresa> listaEmpresa = new ArrayList<Empresa>();
        listaEmpresa.add(empresa1);
        listaEmpresa.add(empresa2);
        listaEmpresa.add(empresa3);
        listaEmpresa.add(empresa4);
        listaEmpresa.add(empresa5);
        listaEmpresa.add(empresa6);
        listaEmpresa.add(empresa7);
        listaEmpresa.add(empresa8);
        listaEmpresa.add(empresa9);
        listaEmpresa.add(empresa10);
        listaEmpresa.add(empresa11);
        listaEmpresa.add(empresa12);
        
        return listaEmpresa;
    }

}
