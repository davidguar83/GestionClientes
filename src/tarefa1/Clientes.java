
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa1;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



/**
 *
 * @author David
 */

@Entity
public class Clientes implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    
    private String nif;
    
    private String nome,direccion;
    private int telefono,debeda;

    public Clientes() {
    }
    
   

    public Clientes(String nif, String nome, String direccion, int telefono, int debeda) {
        this.nif = nif;
        this.nome = nome;
        this.direccion = direccion;
        this.telefono = telefono;
        this.debeda = debeda;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDebeda() {
        return debeda;
    }

    public void setDebeda(int debeda) {
        this.debeda = debeda;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nif=" + nif + ", nome=" + nome + ", direccion=" + direccion + ", telefono=" + telefono + ", debeda=" + debeda + '}';
    }

  
    
    
    
    
}
