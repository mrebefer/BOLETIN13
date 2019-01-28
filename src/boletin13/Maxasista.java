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
public class Maxasista {
    int ed,edade,anosExperiencia;
    String nome,apelido,titulacion;
    public void concentrarse(){
        System.out.println("concentrase a seleccion: ");
    }
    public void viaxar(){
        
    }
    public void darMasaxes(){
        
    }

    public Maxasista(int ed, int edade, int anosExperiencia, String nome, String apelido, String titulacion) {
        this.ed = ed;
        this.edade = edade;
        this.anosExperiencia = anosExperiencia;
        this.nome = nome;
        this.apelido = apelido;
        this.titulacion = titulacion;
    }

    @Override
    public String toString() {
        return "Maxasista{" + "ed=" + ed + ", edade=" + edade + ", anosExperiencia=" + anosExperiencia + ", nome=" + nome + ", apelido=" + apelido + ", titulacion=" + titulacion + '}';
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

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
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

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    
}
