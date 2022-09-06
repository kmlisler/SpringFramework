package com.kamilisler.iocsiz_disiz;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "cdisizWorker")
@ApplicationScoped
public class Worker {
    private Boss boss;
    public Worker(){
        // NULL exception için boş yapı oluşturuldu
        boss = new Boss();
    }
    public String getData(String data){
        return boss.version(data);
    }
}
