package com.tom.GestionBieres.Controller;

import com.tom.GestionBieres.Service.GestionBiereService;
import com.tom.GestionBieres.entityDto.ContinentDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path="/biere")
public class ContinentController {
    private GestionBiereService<ContinentDto> continentService;

@GetMapping(path="/continents")
@ResponseStatus(HttpStatus.OK)
    public List<ContinentDto> getAllContinent() {
        return this.continentService.findAll();
    }

}
