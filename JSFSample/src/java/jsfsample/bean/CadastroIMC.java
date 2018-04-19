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
public class CadastroIMC {

    private String peso;
    private String altura;
    public String resultado;
   
    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    public String getAltura() {
        return altura;
    }

    public void setAltura(String curso) {
        this.altura = altura;
    }  
    
    public String getResultado()
    {
        return resultado;
    }
    
    public void setResultado(String resultado)
    {
        this.resultado = resultado;
    }
    
    
    
    public CadastroIMC() {
    }
    
    
    
    public void calculaDados() {
        Double altura = this.getAltura() * this.getAltura(); 
        Double imc = this.getPeso() / altura;
        this.setResultado("O Resultado é: " + imc());
    }
}
