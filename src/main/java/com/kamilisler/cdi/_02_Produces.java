package com.kamilisler.cdi;

import jdk.jfr.Name;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

//  cdi beanlerin asıl amacı loose coupling. ( bir class başka bir classı tanımadan alışveriş yapabilsin ) gevşekliği sağlamak
// produce yapısı da bunu sağlar
@Named(value = "producetuto")
@ApplicationScoped
public class _02_Produces {
    @Produces // bu üretiyor. üretilen yapılar da başka bir yapıda kullanılacak. her şey loose coupling için.
    public List<String> getList(){
        List<String> liste = new ArrayList<>();
        liste.add("Html5");
        liste.add("Css3");
        liste.add("js");
        liste.add("react");
        liste.add("Angular");
        return liste;
    }
}
