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
public class Adestrador {
    int ed,edade;
    String nome,apelido,idFederacion;
    public void concentrarse(){
        System.out.println("concentrase a seleccion: ");
    }
    public void viaxar(){
        
    }
    public void dirixirPartido(){
        
    }
    public void dirixirAdestramento(){
        
    }

    public Adestrador(int ed, int edade, String nome, String apelido, String idFederacion) {
        this.ed = ed;
        this.edade = edade;
        this.nome = nome;
        this.apelido = apelido;
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Adestrador{" + "ed=" + ed + ", edade=" + edade + ", nome=" + nome + ", apelido=" + apelido + ", idFederacion=" + idFederacion + '}';
    }

    public int getEd() {
        return ed;
    }

    public void setEd(int ed) {
        this.ed = ed;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
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

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
}
