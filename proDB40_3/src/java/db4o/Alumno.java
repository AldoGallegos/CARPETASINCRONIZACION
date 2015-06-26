/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db4o;

/**
 *
 * @author LAGO
 */
public class Alumno {
    private String cveAlu;
    private String nomAlu;
    private int edaAlu;
    private String cveGru;

    public Alumno(String cveAluP, String nomAluP, int edaAluP, String cveGruP) {
        this.cveAlu = cveAluP;
        this.nomAlu = nomAluP;
        this.edaAlu = edaAluP;
        this.cveGru = cveGruP;
    }

    public String getCveAlu() {
        return cveAlu;
    }

    public String getCveGru() {
        return cveGru;
    }

    public int getEdaAlu() {
        return edaAlu;
    }

    public String getNomAlu() {
        return nomAlu;
    }
    
    
}
