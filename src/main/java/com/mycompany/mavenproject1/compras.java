/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.conexion.Componentes;
import com.mycompany.mavenproject1.conexion.ListaComponentes;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author salvador
 */
@Named("appcompras")
@SessionScoped
public class compras implements Serializable {

    /**
     * @return the tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * @param tag the tag to set
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the lista
     */
    public List<ListaComponentes> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<ListaComponentes> lista) {
        this.lista = lista;
    }

    public void addProduct(Componentes compra) {
        ListaComponentes item = new ListaComponentes(compra.getNombre(), compra.getPrecio(), compra.getTipo(), compra.getEmpresa());
        lista.add(item);
        total = 0;
        for (int i = 0; i < lista.size(); i++) {
            double precio = Double.parseDouble(lista.get(i).getPrecio());
            total += precio;
        }
    }

    public void removeProduct(ListaComponentes producto) {
        lista.remove(producto);
        total = 0;
        for (int i = 0; i < lista.size(); i++) {
            double precio = Double.parseDouble(lista.get(i).getPrecio());
            total += precio;
        }
    }

    public String confirmProducts() {
        if (total < 1) {
            tag = "btn-danger";
            return "/compras.xhtml";
        }
        return "/confirmaCompra.xhtml";
    }

    private List<ListaComponentes> lista = new ArrayList<>();

    private String nombre;
    private String empresa;
    private String precio;
    private String producto;
    private double total;
    private String tag = "btn-success"; 

}
