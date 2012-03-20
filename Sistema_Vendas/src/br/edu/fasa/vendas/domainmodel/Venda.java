/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainmodel;

import java.util.Date;

/**
 *
 * @author Valdeir Deda
 */
public class Venda {
private int id;
private Cliente cliente;
private Date data;
private VendaItem item;
public Venda(){}

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the item
     */
    public VendaItem getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(VendaItem item) {
        this.item = item;
    }
}
