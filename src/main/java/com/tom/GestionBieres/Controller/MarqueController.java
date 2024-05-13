package com.tom.GestionBieres.Controller;

import com.tom.GestionBieres.Service.GestionBiereService;
import com.tom.GestionBieres.entityDto.MarqueDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@AllArgsConstructor
@RequestMapping(path="/biere")
public class MarqueController {
    private GestionBiereService<MarqueDto> marqueService;

    @GetMapping(path="/marques")
    public List<MarqueDto> getAllMarques (){
        return this.marqueService.findAll();
    }


}
