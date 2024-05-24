package com.tom.GestionBieres.Controller;

import com.tom.GestionBieres.Service.FabricantService;
import com.tom.GestionBieres.Service.GestionBiereService;
import com.tom.GestionBieres.entityDto.FabricantDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="/biere")
@AllArgsConstructor
public class FabricantController {
    private FabricantService fabricantService;

    @GetMapping(path="/fabricants")
    @ResponseStatus(HttpStatus.OK)
    public List<FabricantDto> getAllFabricant (){
        return this.fabricantService.findAll();
    }
}
