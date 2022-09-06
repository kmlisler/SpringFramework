package com.kamilisler.with_ioc_and_di;

public class Boss implements IBossInterface {

    // bu örneği ioc ve di'siz yaptığımızda. ben bu version'a yeni bir parametre eklemek istediğimde çağırılan yerler hata verir
    @Override
    public String version(String data){
        return "Version : " + data;
    }
}
