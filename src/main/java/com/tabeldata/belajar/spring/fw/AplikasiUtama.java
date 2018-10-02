/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.belajar.spring.fw;

import com.tabeldata.belajar.spring.fw.bean.DataPribadi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author dimasm93
 */
public class AplikasiUtama {

    public static void main(String[] args) {
        ApplicationContext contxt = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        DataPribadi dimas = contxt.getBean(DataPribadi.class);
        System.out.println(dimas.toString());
    }

}
