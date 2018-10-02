package com.tabeldata.belajar.spring.fw.bean;

import org.springframework.stereotype.Component;

@Component
public class Universitas {

    private Integer id;
    private String nama;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
