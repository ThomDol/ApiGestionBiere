package com.tom.GestionBieres.Controller;

import com.tom.GestionBieres.Service.GestionBiereService;
import com.tom.GestionBieres.Service.VendreServiceImpl;
import com.tom.GestionBieres.entityDto.VendreDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path="/biere")
public class VendreController {

    private VendreServiceImpl vendreService;

    @GetMapping(path="/ventes")
    @ResponseStatus(HttpStatus.OK)
    public List<VendreDto> getAllVentes (){
        return this.vendreService.findAll();
    }

    @GetMapping(path="/ventes/{annee}")
    public List<VendreDto> getVentesByAnnee(@PathVariable int annee){
        return this.vendreService.findByAnnee(annee);
    }
}
