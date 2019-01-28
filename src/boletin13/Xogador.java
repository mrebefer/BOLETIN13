/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13;

/**
 *
 * @author mrebelladofernandez
 */
public class Xogador {
    
        int id,edade,dorsal;
        String nome,apelido,demarcacion;
        
        public void concentrarse(){
            
        }
        public void viaxar(){
            
        }
        public void xogarPartido(){
            
        }
        public void entrenar(){
            
        }

    public Xogador(int id, int edade, int dorsal, String nome, String apelido, String demarcacion) {
        this.id = id;
        this.edade = edade;
        this.dorsal = dorsal;
        this.nome = nome;
        this.apelido = apelido;
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return "Xogador{" + "id=" + id + ", edade=" + edade + ", dorsal=" + dorsal + ", nome=" + nome + ", apelido=" + apelido + ", demarcacion=" + demarcacion + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
        
        
}
