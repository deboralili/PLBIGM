/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pldistribuicaodeenergia;

import java.util.ArrayList;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author Débora
 */
public class PLDistribuicaodeEnergia {

    public static void main(String[] args) {
        
        //-----------------------
        //Adicionando os dados

        ArrayList<Empresa> listaEmpresa = Empresa.adicionarDadosEmpresa();
        
        int demandaTotal = 0;

        for (Empresa empresa : listaEmpresa) {
            demandaTotal = demandaTotal + empresa.demanda;
        }

        System.out.println("Demanda Total: " + demandaTotal);

        ArrayList<Oferta> listaOferta = Oferta.adicionarDadosOferta();
        
        int ofertaTotal = 0;

        for (Oferta oferta : listaOferta) {
            ofertaTotal = ofertaTotal + oferta.aquisicao;
        }

        System.out.println("Oferta Total: " + ofertaTotal);

        int diferenca = demandaTotal - ofertaTotal;

        System.out.println("Nao atendimento: " + diferenca);

        ArrayList<Custo> listaVariaveis = Custo.criarVariaveisCusto(listaEmpresa, listaOferta);

//--------------------------------        

        Simplex matriz = new Simplex();
        
        //--------------------------------
        //Montando o quadro
        
        matriz.setListaVariaveisCusto(listaVariaveis);
        
        matriz.criarListaVariavelNaoBasica();
        
        matriz.criarColunaBEstoque(listaEmpresa, listaOferta);
        
        matriz.criarListaVariaveisArtificiais();
        
        matriz.criarListaVariavelBasica();
        
        matriz.criarCabecalho();
        
        matriz.criarLinhaZ();
        
        matriz.construir();
        
        //Ajute Inicial
        
        matriz.ajusteInicial();
        
        int a=0;
        
        while (matriz.solucaoOtima() == false){
            matriz.algoritmo();
            
            System.out.println("Quantidade de iteracao " + a++);
        }
        
        System.out.println("Empresa que nao vai receber: " + matriz.solucao());
        
        int valorA = 0;
        int custo = 0;
        
        for (int i = 0; i < matriz.basica.size(); i++) {
            valorA = valorA + matriz.b.get(i);
            custo = custo + matriz.basica.get(i).valor;
            
            System.out.println("Empresa : " + matriz.basica.get(i).getIDemp());
            System.out.println("Ofertante : " + matriz.basica.get(i).getIDofer());
            System.out.println("ValorA : " + matriz.b.get(i));
            
        }
        
        System.out.println("Valor Total: " + valorA);
        System.out.println("Custo Total: " + custo);
    }

}
