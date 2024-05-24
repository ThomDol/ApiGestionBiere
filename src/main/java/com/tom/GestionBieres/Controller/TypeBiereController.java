package com.tom.GestionBieres.Controller;

import com.tom.GestionBieres.Service.GestionBiereService;
import com.tom.GestionBieres.Service.TypeBiereService;
import com.tom.GestionBieres.entity.Typebiere;
import com.tom.GestionBieres.entityDto.TypebiereDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path="/biere")
public class TypeBiereController {
    private TypeBiereService typeBiereService;

    @GetMapping(path="/types")
    @ResponseStatus(HttpStatus.OK)
    public List<TypebiereDto> getAllType(){
        return this.typeBiereService.findAll();
    }
}
