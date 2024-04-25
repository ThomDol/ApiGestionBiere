package com.tom.GestionBieres.Controller;

import com.tom.GestionBieres.Service.GestionBiereService;
import com.tom.GestionBieres.entityDto.FabricantDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/biere")
@AllArgsConstructor
public class FabricantController {
    private GestionBiereService<FabricantDto> fabricantService;

    @GetMapping(path="/fabricants")
    @ResponseStatus(HttpStatus.OK)
    public List<FabricantDto> getAllFabricant (){
        return this.fabricantService.findAll();
    }
}
