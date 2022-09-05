package com.kamilisler;
// data transfer object

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter setter equuals, to string gibi data fonksiyonlarını getirir.
@NoArgsConstructor
@AllArgsConstructor
@Builder // dto builderı getiriyor
public class StudentDto {

    private Long studentId;
    private String studentName;
    private String studentSurname;

}
