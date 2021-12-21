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
public class Simplex {

    ArrayList<ArrayList<Integer>> quadro;
    ArrayList<Variavel> basica;
    ArrayList<Variavel> naoBasica;
    ArrayList<Integer> z;
    ArrayList<Integer> b;
    ArrayList<Artificial> listaArtificiais;
    ArrayList<Variavel> cabecalho;
    ArrayList<Custo> listaVariaveisCusto;

    public Simplex() {
        quadro = new ArrayList<ArrayList<Integer>>();
    }

    public void construir() {
        //colocar linhas no quadro

        for (int i = 0; i < this.b.size(); i++) { //vai ser do tamanho de b
            ArrayList<Integer> linha = new ArrayList<Integer>();
            for (int j = 0; j < this.cabecalho.size(); j++) {
                linha.add(0);
            }
            this.quadro.add(linha);
        }

        //Percorrer cada linha colocando os 1s
        //Em relação a variaveis artificiais
        //Colocar 1 em todas as posições em que ax tem interseção com ax
        for (int i = 0; i < this.cabecalho.size(); i++) {

            for (int j = 0; j < this.basica.size(); j++) {

                if (this.basica.get(j) == this.cabecalho.get(i)) {
                    this.quadro.get(j).set(i, 1);
                } else {
                    this.quadro.get(j).set(i, 0);
                }

            }

        }

        //Em relação a variaveis de custo
            //tem 1 quando:
        //Todos os a1 intersedem com oferta1
        //Todos os a2 intersedem com oferta2
        //Todos os a3 intersedem com oferta3
        //Todos os a4 intersedem com oferta4
        //Todos os a5 intersedem com oferta5
        //Todos os a6 intersedem com oferta6
        //Todos os a7 intersedem com oferta7
        //Todos os a8 intersedem com oferta8
        //Todos os a9 intersedem com oferta9
        
        //Todos os a10 intersedem com empresa1
        //Todos os a11 intersedem com empresa2
        //Todos os a12 intersedem com empresa3
        //Todos os a13 intersedem com empresa4
        //Todos os a14 intersedem com empresa5
        //Todos os a15 intersedem com empresa6
        //Todos os a16 intersedem com empresa7
        //Todos os a17 intersedem com empresa8
        //Todos os a18 intersedem com empresa9
        //Todos os a19 intersedem com empresa10
        //Todos os a20 intersedem com empresa11
        //Todos os a21 intersedem com empresa12
        
        for (int i = 0; i < this.basica.size(); i++) {
            for (int j = 0; j < this.listaVariaveisCusto.size(); j++) {

                if (i < 9) {
                    //Funciona de a1 a a9 pois as ofertas vao ter o mesmo id
                    if (this.listaVariaveisCusto.get(j).getIDofer() == this.basica.get(i).getIDofer()) {
                        this.quadro.get(i).set(j, 1);
                    }else{
                        this.quadro.get(i).set(j, 0);
                    }
                }else{
                    
                    //Funciona de a10 a a21 pois o id da empresa é o id da artificial - 9
                    if (this.listaVariaveisCusto.get(j).getIDemp() == this.basica.get(i).getIDemp()-9 ){
                        this.quadro.get(i).set(j, 1);
                    }else{
                        this.quadro.get(i).set(j, 0);
                    }
                }

            }
        }
        
    }

//Definir linha z
            /*
     Esta linha conterá todos os valores do custo * -1
     Mais os valores das variáveis artificiais (Big M)
     E por último o número 0
     */
    public void criarLinhaZ() {
        ArrayList<Integer> zLinha = new ArrayList<Integer>();

        for (int i = 0; i < this.listaVariaveisCusto.size(); i++) {
            zLinha.add(this.listaVariaveisCusto.get(i).valor * -1);
        }

        for (int i = 0; i < this.listaArtificiais.size(); i++) {
            zLinha.add(this.listaArtificiais.get(i).valor);
        }

        zLinha.add(0); //Valor do lucro

        this.z = zLinha;
    }

    public void setListaVariaveisCusto(ArrayList<Custo> lista) {
        this.listaVariaveisCusto = lista;
    }

    //Definir linha de todas as variaveis (variaveis + artificiais)
            /*
     cabecalho = listaVariaveis + listaArtificial
     */
    public void criarCabecalho() {
        ArrayList<Variavel> cab = new ArrayList<Variavel>();

        for (int i = 0; i < this.listaVariaveisCusto.size(); i++) { //entra todas as variaveis de custo
            cab.add(this.listaVariaveisCusto.get(i));
        }

        for (int i = 0; i < this.listaArtificiais.size(); i++) { // entra todas as variaveis artificiais
            cab.add(this.listaArtificiais.get(i));
        }

        this.cabecalho = cab;
    }

    //Definir coluna de variaveis basicas
            /*
     Inicialmente ela será composta por todas as variáveis artificiais e
     vai de modificando a cada iteração
     */
    public void criarListaVariavelBasica() {
        ArrayList<Variavel> variaveisBasicas = new ArrayList<Variavel>();

        for (int i = 0; i < this.listaArtificiais.size(); i++) { //percorre a lista das variaveis artificiais

            variaveisBasicas.add(this.listaArtificiais.get(i));
        }

        this.basica = variaveisBasicas;
    }

    //Criando uma lista de variaveis basicas
            /*
     Uma variavel artificial foi criada para cada restrição de oferta
     e cada restrição de empresa.
     */
    public void criarListaVariaveisArtificiais() {
        ArrayList<Artificial> lista = new ArrayList<Artificial>();

        for (int i = 1; i < this.b.size() + 1; i++) {

            Artificial a = new Artificial(i);

            lista.add(a);
        }

        this.listaArtificiais = lista;
    }

    //Definir lista das variaveis nao basicas
            /*
     Inicialmente ela será composta por todas as variáveis (custo)que ainda
     não entraram em produção e vai se modificando a cada iteração
     */
    public void criarListaVariavelNaoBasica() {
        ArrayList<Variavel> variaveisNaoBasicas = new ArrayList<Variavel>();

        for (int i = 0; i < this.listaVariaveisCusto.size(); i++) {
            variaveisNaoBasicas.add(this.listaVariaveisCusto.get(i));
        }

        this.naoBasica = variaveisNaoBasicas;

    }

    //Definir linha b
            /*
     Será a listagem de todas as aquisições e todas as demandas, nessa ordem
     */
    public void criarColunaBEstoque(ArrayList<Empresa> listaEmpresa, ArrayList<Oferta> listaOferta) {
        ArrayList<Integer> estoque = new ArrayList<Integer>();

        for (int i = 0; i < listaOferta.size(); i++) {
            estoque.add(listaOferta.get(i).aquisicao);
        }

        for (int i = 0; i < listaEmpresa.size(); i++) {
            estoque.add(listaEmpresa.get(i).demanda);
        }

        this.b = estoque;
    }

    //Funções
    /*
     Eliminar todos os 999999 da linha z que esteja logo abaixo das variáveis
     artificiais
     */
    public void ajusteInicial() {

        int M = 999999999;

        //As variáveis artificiais estão nas posições 108-128 do cabeçalho
        //Localizar o M na linha z
        //Z precisa de ajuste?
        while (possuiM()) {
            for (int i = 108; i <= 128; i++) {

                //Localiza M na linha z. i é a posição.
                if (this.z.get(i) == M) {

                    //Qual a linha de referência?
                    int posicao1 = buscaLinhaReferencia(i); //Qual a linha que possui 1 na posição da coluna atual?

                    int valorReferencia;
                    //Percorre novamente o z para fazer as modificações na linha
                    for (int j = 0; j < this.z.size(); j++) {

                        int zAntigo, zModificado;

                        zAntigo = this.z.get(j);

                        if (j == 129) { //Se tiver pego o valor que está o lucro
                            valorReferencia = this.b.get(posicao1);
                        } else {
                            valorReferencia = this.quadro.get(posicao1).get(j);
                        }

                        zModificado = zAntigo - (M * valorReferencia);

                        this.z.set(j, zModificado);

                    }

                }

            }
        }

    }

    public boolean possuiM() {
        int M = 999999999;
        for (int i = 108; i <= 128; i++) {

            if (this.z.get(i) == M) {
                return true;
            }

        }
        return false;
    }

    public int buscaLinhaReferencia(int i) {
        //Qual a linha que possui 1 na posição i?
        for (int j = 0; j < this.quadro.size(); j++) { //percorre linhas do quadro
            if (this.quadro.get(j).get(i) == 1) {
                return j;
            }
        }
        return -1;
    }

    public boolean solucaoOtima() {

        //Tem parcela negativa na linha z?
        for (int i = 0; i <= this.z.size(); i++) {
            if (this.z.get(i) < 0) {
                return false;
            }
        }

        return true;
    }

    public void algoritmo() {

        int posicaoColunaPivo = colunaPivo();
        int posicaoLinhaPivo = linhaPivo(posicaoColunaPivo);
        escalonamentoInicial(posicaoColunaPivo, posicaoLinhaPivo);
        escalonamentoMatriz(posicaoLinhaPivo, posicaoColunaPivo);
        escalonamentoB(posicaoLinhaPivo, posicaoColunaPivo);
        escalonamentoZ(posicaoLinhaPivo, posicaoColunaPivo);
    }

    //Determina parcela mais negativa na linha z dentre as variaveis, exceto lucro
    public int colunaPivo() {

        int atual;
        int menor = 99999999; //Foi definido um número alto para que não haja problema ao
        //guardar um número menor que ele

        //qual a menor parcela na linha z?
        for (int i = 0; i < this.z.size() - 1; i++) { //menos o lucro

            atual = this.z.get(i);

            if (i == 0) {     //Inicialização da variavel menor, ela será o primeiro analisado
                menor = atual;
            }

            if (atual < menor) {
                menor = atual;
            }

        }

        //retorna a posição da coluna que vai entrar em produção
        int colunaPivoPosicao = -1;

        for (int i = 0; i < this.z.size() - 1; i++) {
            if (this.z.get(i) == menor) {
                colunaPivoPosicao = i;
                break;
            }
        }
        return colunaPivoPosicao;
    }

    //Determina a menor parcela não negativa da divisão de b para ver quem sai
    public int linhaPivo(int colunaPivoPosicao) {
        //Tem que percorrer b e dividir cada b pela coluna pivo

        ArrayList<Integer> temp = new ArrayList<Integer>();

        //o numero de linhas da quadro é do mesmo tamanho de b
        //conta
        for (int i = 0; i < this.b.size(); i++) {
            int num;

            //Tratamento divisão por 0
            if (this.quadro.get(i).get(colunaPivoPosicao) == 0) {
                temp.add(-1);
            } else {

                //Guarda o valor das contas
                num = this.b.get(i) / this.quadro.get(i).get(colunaPivoPosicao);
                temp.add(num);
            }
        }

        int menor = 9999999;
        //Analisar qual a menor parcela não negativa
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) >= 0) {
                if (temp.get(i) < menor) {
                    menor = temp.get(i);
                }
            }
        }

        //Identificar qual a posição da linha de menor parcela
        int linhaPivoPosicao = -1;

        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) == menor) {
                return i;
            }
        }

        //Retorna a posição da linha na quadro que vai sair
        return linhaPivoPosicao;
    }

    public void escalonamentoInicial(int posicaoColunaPivo, int posicaoLinhaPivo) {

        int numeroNovo, numero;
        ArrayList<Integer> temp = new ArrayList<Integer>();

        //A alteração deve ocorrer primeiro na linha pivo
        //Pega toda a linha pivo e divide pelo numero pivo
        for (int j = 0; j < this.quadro.get(posicaoLinhaPivo).size(); j++) { //percorre coluna
            numero = this.quadro.get(posicaoLinhaPivo).get(j);
            numeroNovo = numero / this.quadro.get(posicaoLinhaPivo).get(posicaoColunaPivo);
            temp.add(numeroNovo);
        }

        //Substitui esse resultado na mesma linha em que se encontra na quadro
        this.quadro.set(posicaoLinhaPivo, temp);

        //Alterar a coluna pivo
        int numeroUm, numeroDois;

        for (int j = 0; j < this.quadro.size(); j++) { //percorre linha
            if (j != posicaoLinhaPivo) {
                numero = this.quadro.get(j).get(posicaoColunaPivo);
                numeroUm = this.quadro.get(j).get(posicaoColunaPivo);
                numeroNovo = numero - (numeroUm * this.quadro.get(posicaoLinhaPivo).get(posicaoColunaPivo));

                this.quadro.get(j).set(posicaoColunaPivo, numeroNovo);
            }
        }

        //Alterar b
        numero = this.b.get(posicaoLinhaPivo);
        numeroNovo = numero / this.quadro.get(posicaoLinhaPivo).get(posicaoColunaPivo);
        this.b.set(posicaoLinhaPivo, numeroNovo);

        //Alterar z
        numero = this.z.get(posicaoColunaPivo);
        numeroNovo = numero - (numero * this.quadro.get(posicaoLinhaPivo).get(posicaoColunaPivo));
        this.z.set(posicaoColunaPivo, numeroNovo);

        atualizaVBeVNB(posicaoLinhaPivo, posicaoColunaPivo);
    }

    public void escalonamentoZ(int posicaoLinhaPivo, int posicaoColunaPivo) {

        int numeroUm, numeroDois, numero, numeroNovo;

        for (int i = 0; i < this.z.size(); i++) {       //percorre coluna
            if (i != posicaoColunaPivo) {                //Se nao for a coluna que já foi modificada
                if (i == 129) {
                    numero = this.z.get(i);
                    numeroUm = this.z.get(posicaoColunaPivo);
                    numeroDois = this.quadro.get(posicaoLinhaPivo).get(i);

                    numeroNovo = numero - (numeroUm * numeroDois);

                    this.z.set(i, numeroNovo);
                } else {
                    numero = this.z.get(i);
                    numeroUm = this.z.get(posicaoColunaPivo);
                    numeroDois = this.b.get(posicaoLinhaPivo);

                    numeroNovo = numero - (numeroUm * numeroDois);

                    this.z.set(i, numeroNovo);
                }

            }
        }
    }

    public void escalonamentoB(int posicaoLinhaPivo, int posicaoColunaPivo) {

        int numeroUm, numeroDois, numero, numeroNovo;

        for (int i = 0; i < this.b.size(); i++) {       //percorre linha
            if (i != posicaoLinhaPivo) {                //Se nao for a linha que já foi modificada

                numero = this.b.get(i);
                numeroUm = this.quadro.get(i).get(posicaoColunaPivo);
                numeroDois = this.b.get(posicaoLinhaPivo);

                numeroNovo = numero - (numeroUm * numeroDois);

                this.b.set(i, numeroNovo);

            }
        }

    }

    public void escalonamentoMatriz(int posicaoLinhaPivo, int posicaoColunaPivo) {

        //Percorre toda a quadro menos a linha pivo que ja foi alterada
        //Continha
        //valorNovo = valor antigo - (numero que está na mesma linha, mas que pertence a coluna pivo
        // * numero que está na mesma coluna, mas que pertence a linha pivo)
        //Substituir esses valores na quadro a medida que tem as iterações
        int numeroUm, numeroDois, numero, numeroNovo;

        for (int i = 0; i < this.quadro.size(); i++) {       //percorre linha
            if (i != posicaoLinhaPivo) {                //Se nao for a linha que já foi modificada

                for (int j = 0; j < this.quadro.get(i).size(); j++) {  //percorre coluna

                    if (j != posicaoColunaPivo) {                 //Se não foi a coluna que já foi modificada

                        numero = this.quadro.get(i).get(j);
                        numeroUm = this.quadro.get(i).get(posicaoColunaPivo);
                        numeroDois = this.quadro.get(posicaoLinhaPivo).get(j);

                        numeroNovo = numero - (numeroUm * numeroDois);

                        this.quadro.get(i).set(j, numeroNovo);
                    }

                }

            }
        }

    }

    //Alterar posições da lista de variaveis basicas e variaveis nao basicas
    public void atualizaVBeVNB(int posicaoLinhaPivo, int posicaoColunaPivo) {
        //Qual variavel está entrando e qual variavel está saindo?

        Variavel variavelBasicaAtual;
        Variavel variavelNaoBasicaAtual;

        //A linha mostra quem está saindo
        //O que está na linha vai para a lista de variaveis nao basicas
        variavelBasicaAtual = this.basica.get(posicaoLinhaPivo);

        //A coluna mostra quem está entrando
        //O que está na coluna entra na lista de variaveis basicas
        variavelNaoBasicaAtual = this.naoBasica.get(posicaoColunaPivo);

        //Fazendo a troca
        this.basica.set(posicaoLinhaPivo, variavelNaoBasicaAtual);
        this.naoBasica.set(posicaoColunaPivo, variavelBasicaAtual);

    }

    public int solucao() {
        //Na lista de variaveis basicas eu acho a variavel de custo que está relacionada
        //com o número 2290 que será encontrado na coluna b

        //A posição em que se encontra a variavel de custo na lista de variaveis basica
        //é a mesma posição em que se encontra o número 2290 na coluna b
        //Ao encontrar a variavel de custo, pega a empresa que está relacionada
        int posicao = -1;

        for (int i = 0; i < this.b.size(); i++) {
            if (this.b.get(i) == 2290) {
                posicao = i;
            }
        }

        Variavel em = this.basica.get(posicao);

        return em.getIDemp();
    }
}
