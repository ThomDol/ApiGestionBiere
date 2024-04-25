package com.tom.GestionBieres.Controller;

import com.tom.GestionBieres.Service.GestionBiereService;
import com.tom.GestionBieres.entityDto.MarqueDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path="/biere")
public class MarqueController {
    private GestionBiereService<MarqueDto> marqueService;

    @GetMapping(path="/marques")
    public List<MarqueDto> getAllMarques (){
        return this.marqueService.findAll();
    }


}
