/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pldistribuicaodeenergia;

/**
 *
 * @author Débora
 */
public class Artificial extends Variavel{
    int id;
    
    public Artificial(int id){
        this.id = id;
        this.valor = 999999999;
    }

    @Override
    public int getIDemp() {
        return this.id;
    }

    @Override
    public int getIDofer() {
        return this.id;
    }
    
    
}
