package com.tom.GestionBieres.Controller;

import com.tom.GestionBieres.Service.GestionBiereService;
import com.tom.GestionBieres.entityDto.CouleurDto;
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
public class CouleurController {
    private GestionBiereService<CouleurDto> couleurService;

    @GetMapping(path="/couleurs")
    @ResponseStatus(HttpStatus.OK)
    public List<CouleurDto> getAllCouleur(){
        return this.couleurService.findAll();
    }
}
