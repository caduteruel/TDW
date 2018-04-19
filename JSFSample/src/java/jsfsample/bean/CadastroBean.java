/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsfsample.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author DB1007634
 */
@ManagedBean
@RequestScoped
public class CadastroBean {

    private String nome;
    private String curso;
    private String ra;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    /**
     * Creates a new instance of AutomovelBean
     */
    public CadastroBean() {
    }
    
    public void gravaAluno() {
        this.setExibe("Modelo selecionado é: " + getRa());
    }
}
