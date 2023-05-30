/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopizzaria;

/**
 *
 * @author gianb
 */
public class ItemPedido {
    private String pizza;
    private String tamanho;
    private float preco;
    private String ob;

    public String getPizza() {
        return pizza;
    }

    public String getOb() {
        return ob;
    }

    public void setOb(String ob) {
        this.ob = ob;
    }
    
    

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

   

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
       
}
