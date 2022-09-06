package com.kamilisler.iocsiz_disiz;

public class Boss {

    // bu örneği ioc ve di'siz yaptığımızda. ben bu version'a yeni bir parametre eklemek istediğimde çağırılan yerler hata verir
    // ioc yapısı, patrona yönetimi verir
    public String version(String data){
        return "Version : " + data;
    }
}
