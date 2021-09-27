package com.project.backendsantander.controller;

import com.project.backendsantander.model.dto.StockDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/stock")

public class StockController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> save(@RequestBody StockDTO dto) {
        return ResponseEntity.ok(dto);

    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> update(@RequestBody StockDTO dto) {
        return ResponseEntity.ok(dto);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockDTO>> findAll() {
        List<StockDTO> list = new ArrayList<>();
        StockDTO dto = new StockDTO();
        dto.setId(1L);
        dto.setName("Magazine Luisa");
        dto.setPrice(100D);
        dto.setVariation(10D);
        dto.setDate(LocalDate.now());
        list.add(dto);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> findById(@PathVariable Long id) {
        List<StockDTO> list = new ArrayList<>();
        StockDTO stock = new StockDTO();
        stock.setId(1L);
        stock.setName("Magazine Luisa");
        stock.setPrice(100D);
        stock.setVariation(1D);
        stock.setDate(LocalDate.now());
        StockDTO stock1 = new StockDTO();
        stock1.setId(2L);
        stock1.setName("Ponto Frio");
        stock1.setPrice(200D);
        stock1.setVariation(2D);
        stock1.setDate(LocalDate.now());

        list.add(stock);
        list.add(stock1);

        StockDTO dtoSelect = list.stream().filter(x -> x.getId().compareTo(id) == 0).findFirst().get();
        return ResponseEntity.ok(dtoSelect);
    }

}
