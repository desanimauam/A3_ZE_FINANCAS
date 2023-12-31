/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.uam.financeiro;

import java.math.BigDecimal;
import java.util.Date;

public class ListaCompras {
    
    private int ID;
    private BigDecimal precoCompra;
    private String dataCompra;
    private String Categoria;

    public ListaCompras(int ID, BigDecimal precoCompra, String dataCompra, String Categoria) {
        this.ID = ID;
        this.precoCompra = precoCompra;
        this.dataCompra = dataCompra;
        this.Categoria = Categoria;
    }
    public ListaCompras(){};

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public BigDecimal getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(BigDecimal precoCompra) {
        this.precoCompra = precoCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
        
    }
}
