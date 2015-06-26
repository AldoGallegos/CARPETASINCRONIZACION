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
public class Grupo {
    private String cveGru;
    private String nomGr;

    public Grupo(String cveGruP, String nomGrP) {
        this.cveGru = cveGruP;
        this.nomGr = nomGrP;
    }

    public String getCveGru() {
        return cveGru;
    }


    public String getNomGr() {
        return nomGr;
    }

   
    
    
    
}
