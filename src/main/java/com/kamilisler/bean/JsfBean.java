package com.kamilisler.bean;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "cdiBean")
@ApplicationScoped
@Setter
@Getter
public class JsfBean {
    private String egitim;

    public JsfBean() {
        this.egitim="SpringBoot eğitimine hoşgeldin.";
    }

}
