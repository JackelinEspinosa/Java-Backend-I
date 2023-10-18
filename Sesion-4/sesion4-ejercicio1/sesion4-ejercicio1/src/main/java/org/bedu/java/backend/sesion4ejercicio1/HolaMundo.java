package org.bedu.java.backend.sesion4ejercicio1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/holamundo")
public class HolaMundo {
    @GetMapping("/{holaid}")
    public String getHolaMundo(String holaid)
    {

        return "Hola Mundo desde Srping boot";
    }

}
