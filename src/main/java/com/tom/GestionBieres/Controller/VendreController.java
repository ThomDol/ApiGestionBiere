package com.tom.GestionBieres.Controller;

import com.tom.GestionBieres.Service.VendreService;
import com.tom.GestionBieres.entityDto.VendreDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@AllArgsConstructor
@RequestMapping(path="/biere")
public class VendreController {

    private VendreService vendreService;

    @GetMapping(path="/ventes")
    @ResponseStatus(HttpStatus.OK)
    public List<VendreDto> getAllVentes (){
        return this.vendreService.findAll();
    }

    @PostMapping(path="/ventes")
    @ResponseStatus(HttpStatus.CREATED)
    public VendreDto addVente (@RequestBody VendreDto vendreDto){
        return this.vendreService.createVente(vendreDto);
    }

    @GetMapping(path="/ventes/{annee}")
    public List<VendreDto> getVentesByAnnee(@PathVariable int annee){
        return this.vendreService.findByAnnee(annee);
    }

    @GetMapping(path="ventes/{annee}/{name}/{volume}")
    @ResponseStatus(HttpStatus.OK)
    public List<VendreDto> getVentesByAnneeAndByArticle (@PathVariable int annee,@PathVariable String name,@PathVariable int volume){
        return this.vendreService.findByAnneeAndByArticleNameAndVolume(annee,name,volume);
    }


    @GetMapping(path="ventes/{name}/{volume}")
    @ResponseStatus(HttpStatus.OK)
    public List<VendreDto> getVentesByArticleAndVolume (@PathVariable String name,@PathVariable int volume){
        return this.vendreService.findByArticleNameAndVolume(name,volume);
    }



}
