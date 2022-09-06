package com.kamilisler.with_ioc_and_di;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "workerWithCdi")
@ApplicationScoped
public class Worker {
    @Inject // dependency injection yapmış olduk. artık new ile null exception kontroluna gerek yok
    private IBossInterface bossInterface;

    public Worker(){
        // NULL exception için boş yapı oluşturuldu

    }
    public String getData(String data){

        return bossInterface.version(data);
    }
}
