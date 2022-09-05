package com.kamilisler.cdi;

import javax.enterprise.context.*;
import javax.inject.Named;


// kapsam,yaşam süresi, uygulamanın performansını etkiler. (Bir nesnenin ne zamanlar çalışıp yaşayacağını belirlediği için )
@Named // bean yapısı olarak tnaımlamak için
// @ApplicationScoped // bütün uygulama boyunca tüm kullanıcılar için çalışır
// @RequestScoped // tek bir istek boyunca çalışacak class için
// @SessionScoped // tek bir kullanıcı için çalışır,logout olduğunda kapanır
// @Dependent // bukalemon - çağırıldığı sınıf hangi scope'a aitse bu sınıf da o scope'u alma özelliği verir
// @ConversationScoped // belirli bir istek boyunca çalışır.
// @SessionScoped // Bean bir instance olmasını sağlamak için
public class _00_Scope {

}

