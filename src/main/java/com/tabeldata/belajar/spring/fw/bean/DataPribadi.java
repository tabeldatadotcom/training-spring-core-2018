/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.belajar.spring.fw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author dimasm93
 */
@Component
public class DataPribadi {

    DataPribadi(Address address, Universitas universitas) {
        this.address = address;
        this.universitas = universitas;
    }

    @Value("1234")
    private String id;
    @Value("dimas")
    private String nama;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    private Address address;

    public Address getAddress() {
        return address;
    }

    private Universitas universitas;

    public Universitas getUniversitas() {
        return universitas;
    }

    public void setUniversitas(Universitas universitas) {
        this.universitas = universitas;
    }

    //    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return String.format("{ id: %s, nama: %s, alamat: %s, rt : %d , rw: %d, namaUniversitas: %s}",
                id,
                nama,
                address.getAlamat(),
                address.getRt(),
                address.getRw(),
                universitas.getNama());
    }


}
