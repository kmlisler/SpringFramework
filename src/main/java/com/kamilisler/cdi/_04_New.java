package com.kamilisler.cdi;

import com.kamilisler.StudentDto;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
// Inject nesnesi produces'tan beslenir. Produce nesnesi ise "New" dan beslenir
@Named(value = "newtuto")
@ApplicationScoped
public class _04_New {
    @Produces // bir data produce edilecek.// @New diyerek data üreteceğimizi belirtiyoruz Produces->New'a bağlı.
    public String uretilenData(@New StudentDto studentDto){
        studentDto = StudentDto.builder()
                .studentId(0L).studentName("Kamil İşler")
                .build();
        // builder yapısı kullanılarak Dto'muzun constructor'ı dolduruldu.
        return studentDto.getStudentName();
    }
    @Getter // üretilen datayı tüketmeye yarayan getter
    @Inject // Inject Produce'a bağlıdır.
    private String tuketilenData;
}
