/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.belajar.spring.fw.bean;

import org.springframework.stereotype.Component;

/**
 *
 * @author dimasm93
 */
@Component
public class Address {

    private String alamat;
    private Integer rw;
    private Integer rt;

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Integer getRw() {
        return rw;
    }

    public void setRw(Integer rw) {
        this.rw = rw;
    }

    public Integer getRt() {
        return rt;
    }

    public void setRt(Integer rt) {
        this.rt = rt;
    }

    @Override
    public String toString() {
        return String.format("{alamat: %s, rw: %s, rt: %s}", this.alamat, this.rw, this.rt);
    }

}
