package com.kamilisler.cdi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
// cdi ==> bean
@Named(value = "namedtuto")
@ApplicationScoped
public class _01_Named {
    private Long namedId;
    private String namedData="Merhabalar Named CDI";
}
