package com.example.warzone.controllers;

import com.example.warzone.controllers.exceptions.MetaListNotFoundException;
import com.example.warzone.dtos.MetaListDto;
import com.example.warzone.servises.MetaListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/metalists")
public class MetaListController {
    @Autowired
    private MetaListService metaListService;
    @GetMapping()
    Iterable<MetaListDto> all(){return  metaListService.getAlL();}
    @GetMapping("/{id}")
    MetaListDto get(@PathVariable Long id){
        return  metaListService.get(id).orElseThrow(()-> new MetaListNotFoundException(id));
    }
    @PostMapping()
    MetaListDto create(@RequestBody MetaListDto metaListDto){
        return metaListService.register(metaListDto);
    }
    @PutMapping()
    MetaListDto update(@RequestBody MetaListDto metaListDto){
        return metaListService.update(metaListDto);
    }
    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id){
        metaListService.delete(id);
    }
    @GetMapping("/byName")
    ResponseEntity<List<MetaListDto>> getMetaListByName(@RequestParam String name){
        List<MetaListDto> metaList = metaListService.findAllByName(name);
        return ResponseEntity.ok(metaList);
    }
    @GetMapping("/byRange")
    ResponseEntity<List<MetaListDto>> getMetaListByRange(@RequestParam String range){
        List<MetaListDto> metaList = metaListService.findAllByRange(range);
        return ResponseEntity.ok(metaList);
    }
    @GetMapping("/byCategory")
    ResponseEntity<List<MetaListDto>> getMetaListByCategory(@RequestParam String category){
        List<MetaListDto> metaList = metaListService.findAllByCategory(category);
        return ResponseEntity.ok(metaList);
    }
    @GetMapping("/byAttachment_1")
    ResponseEntity<List<MetaListDto>> getMetaListByAttachment_1(@RequestParam String attachment_1){
        List<MetaListDto> metaList = metaListService.findAllByAttachment_1(attachment_1);
        return ResponseEntity.ok(metaList);
    }
    @GetMapping("/byAttachment_2")
    ResponseEntity<List<MetaListDto>> getMetaListByAttachment_2(@RequestParam String attachment_2){
        List<MetaListDto> metaList = metaListService.findAllByAttachment_2(attachment_2);
        return ResponseEntity.ok(metaList);
    }
    @GetMapping("/byAttachment_3")
    ResponseEntity<List<MetaListDto>> getMetaListByAttachment_3(@RequestParam String attachment_3){
        List<MetaListDto> metaList = metaListService.findAllByAttachment_3(attachment_3);
        return ResponseEntity.ok(metaList);
    }
    @GetMapping("/byAttachment_4")
    ResponseEntity<List<MetaListDto>> getMetaListByAttachment_4(@RequestParam String attachment_4){
        List<MetaListDto> metaList = metaListService.findAllByAttachment_4(attachment_4);
        return ResponseEntity.ok(metaList);
    }
    @GetMapping("/byAttachment_5")
    ResponseEntity<List<MetaListDto>> getMetaListByAttachment_5(@RequestParam String attachment_5){
        List<MetaListDto> metaList = metaListService.findAllByAttachment_5(attachment_5);
        return ResponseEntity.ok(metaList);
    }
    @GetMapping("/byAttachment_customization_1")
    ResponseEntity<List<MetaListDto>> getMetaListByAttachment_customization_1(@RequestParam String attachment_customization_1){
        List<MetaListDto> metaList = metaListService.findAllByAttachment_customization_1(attachment_customization_1);
        return ResponseEntity.ok(metaList);
    }
    @GetMapping("/byAttachment_customization_2")
    ResponseEntity<List<MetaListDto>> getMetaListByAttachment_customization_2(@RequestParam String attachment_customization_2){
        List<MetaListDto> metaList = metaListService.findAllByAttachment_customization_2(attachment_customization_2);
        return ResponseEntity.ok(metaList);
    }
    @GetMapping("/byAttachment_customization_3")
    ResponseEntity<List<MetaListDto>> getMetaListByAttachment_customization_3(@RequestParam String attachment_customization_3){
        List<MetaListDto> metaList = metaListService.findAllByAttachment_customization_3(attachment_customization_3);
        return ResponseEntity.ok(metaList);
    }
    @GetMapping("/byAttachment_customization_4")
    ResponseEntity<List<MetaListDto>> getMetaListByAttachment_customization_4(@RequestParam String attachment_customization_4){
        List<MetaListDto> metaList = metaListService.findAllByAttachment_customization_4(attachment_customization_4);
        return ResponseEntity.ok(metaList);
    }
    @GetMapping("/byAttachment_customization_5")
    ResponseEntity<List<MetaListDto>> getMetaListByAttachment_customization_5(@RequestParam String attachment_customization_5){
        List<MetaListDto> metaList = metaListService.findAllByAttachment_customization_5(attachment_customization_5);
        return ResponseEntity.ok(metaList);
    }
    @GetMapping("/byGun1")
    ResponseEntity<List<MetaListDto>> getMetaListByGun1(@RequestParam String gun1){
        List<MetaListDto> metaList = metaListService.findAllByGun1(gun1);
        return ResponseEntity.ok(metaList);
    }
}
