package com.tallerwebdataspringboot.webdataspring.domain.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProductInvoicePk implements Serializable{

    @Column(name = "id_product")
    private Long idproduct;
    @Column(name = "id_invoice")
    private Long idinvoiuce;

    public Long getIdproduct() {
        return idproduct;
    }
    public void setIdproduct(Long idproduct) {
        this.idproduct = idproduct;
    }
    public Long getIdinvoiuce() {
        return idinvoiuce;
    }
    public void setIdinvoiuce(Long idinvoiuce) {
        this.idinvoiuce = idinvoiuce;
    }
    
    
    

}
