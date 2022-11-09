/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toko.bunga.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Anas
 */
@Entity
@Table(name = "toko_bunga")
public class TokoBunga implements Serializable {
    @Id
    @Column(name = "kd_bunga", length = 15)
    private String kd_bunga;
    @Column(name = "nama", length = 20)
    private String nama;
    @Column(name = "jenis", length = 20)
    private String jenis;
    @Column(name = "harga", length = 15)
    private String harga;

    public String getKd_bunga() {
        return kd_bunga;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public String getHarga() {
        return harga;
    }
}
