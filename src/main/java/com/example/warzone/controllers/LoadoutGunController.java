package com.example.warzone.controllers;

import com.example.warzone.controllers.exceptions.LoadoutGunNotFoundException;
import com.example.warzone.dtos.LoadoutGunDto;
import com.example.warzone.models.Attachments;
import com.example.warzone.models.Loadout;
import com.example.warzone.models.MetaList;
import com.example.warzone.servises.LoadoutGunService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "LoadoutGun", description = "API для вложений")
@RestController
@RequestMapping("/loadoutguns")
public class LoadoutGunController {
    @Autowired
    private LoadoutGunService loadoutGunService;
    @Operation(summary = "Получить все")
    @GetMapping()
    Iterable<LoadoutGunDto> all(){return loadoutGunService.getAll();}
    @Operation(summary = "Получить по id")
    @GetMapping("/{id}")
    LoadoutGunDto get(@PathVariable Long id){
        return loadoutGunService.get(id).orElseThrow(()-> new LoadoutGunNotFoundException(id));
    }
    @Operation(summary = "Создать")
    @PostMapping()
    LoadoutGunDto create(@RequestBody LoadoutGunDto loadoutGunDto){
        return loadoutGunService.register(loadoutGunDto);
    }
    @Operation(summary = "Обновить")
    @PutMapping()
    LoadoutGunDto update(@RequestBody LoadoutGunDto loadoutGunDto){
        return loadoutGunService.update(loadoutGunDto);
    }
    @Operation(summary = "Удалить")
    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id){
        loadoutGunService.delete(id);
    }
    @Operation(summary = "Получить по дистанции")
    @GetMapping("/byRange")
    public ResponseEntity<List<LoadoutGunDto>> getLoadoutGunByRange(@RequestParam String range) {
        List<LoadoutGunDto> loadoutGuns = loadoutGunService.findAllByRange(range);
        return ResponseEntity.ok(loadoutGuns);
    }
    @Operation(summary = "Получить по имени")
    @GetMapping("/byName")
    public ResponseEntity<List<LoadoutGunDto>> getLoadoutGunByName(@RequestParam String name) {
        List<LoadoutGunDto> loadoutGuns = loadoutGunService.findAllByName(name);
        return ResponseEntity.ok(loadoutGuns);
    }
    @Operation(summary = "Получить по attachment_1")
    @GetMapping("/byAttachment_1")
    public ResponseEntity<List<LoadoutGunDto>> getLoadoutGunByAttachment_1(@RequestParam String attachment_1) {
        List<LoadoutGunDto> loadoutGuns = loadoutGunService.findAllByAttachment_1(attachment_1);
        return ResponseEntity.ok(loadoutGuns);
    }
    @Operation(summary = "Получить по attachment_2")
    @GetMapping("/byAttachment_2")
    public ResponseEntity<List<LoadoutGunDto>> getLoadoutGunByAttachment_2(@RequestParam String attachment_2) {
        List<LoadoutGunDto> loadoutGuns = loadoutGunService.findAllByAttachment_2(attachment_2);
        return ResponseEntity.ok(loadoutGuns);
    }
    @Operation(summary = "Получить по attachment_3")
    @GetMapping("/byAttachment_3")
    public ResponseEntity<List<LoadoutGunDto>> getLoadoutGunByAttachment_3(@RequestParam String attachment_3) {
        List<LoadoutGunDto> loadoutGuns = loadoutGunService.findAllByAttachment_3(attachment_3);
        return ResponseEntity.ok(loadoutGuns);
    }
    @Operation(summary = "Получить по attachment_4")
    @GetMapping("/byAttachment_4")
    public ResponseEntity<List<LoadoutGunDto>> getLoadoutGunByAttachment_4(@RequestParam String attachment_4) {
        List<LoadoutGunDto> loadoutGuns = loadoutGunService.findAllByAttachment_4(attachment_4);
        return ResponseEntity.ok(loadoutGuns);
    }
    @Operation(summary = "Получить по attachment_5")
    @GetMapping("/byAttachment_5")
    public ResponseEntity<List<LoadoutGunDto>> getLoadoutGunByAttachment_5(@RequestParam String attachment_5) {
        List<LoadoutGunDto> loadoutGuns = loadoutGunService.findAllByAttachment_5(attachment_5);
        return ResponseEntity.ok(loadoutGuns);
    }
    @Operation(summary = "Получить по attachment_customization_1")
    @GetMapping("/byAttachment_customization_1")
    public ResponseEntity<List<LoadoutGunDto>> getLoadoutGunByAttachment_customization_1(@RequestParam String attachment_customization_1) {
        List<LoadoutGunDto> loadoutGuns = loadoutGunService.findAllByAttachment_customization_1(attachment_customization_1);
        return ResponseEntity.ok(loadoutGuns);
    }
    @Operation(summary = "Получить по attachment_customization_2")
    @GetMapping("/byAttachment_customization_2")
    public ResponseEntity<List<LoadoutGunDto>> getLoadoutGunByAttachment_customization_2(@RequestParam String attachment_customization_2) {
        List<LoadoutGunDto> loadoutGuns = loadoutGunService.findAllByAttachment_customization_2(attachment_customization_2);
        return ResponseEntity.ok(loadoutGuns);
    }
    @Operation(summary = "Получить по attachment_customization_3")
    @GetMapping("/byAttachment_customization_3")
    public ResponseEntity<List<LoadoutGunDto>> getLoadoutGunByAttachment_customization_3(@RequestParam String attachment_customization_3) {
        List<LoadoutGunDto> loadoutGuns = loadoutGunService.findAllByAttachment_customization_3(attachment_customization_3);
        return ResponseEntity.ok(loadoutGuns);
    }
    @Operation(summary = "Получить по attachment_customization_4")
    @GetMapping("/byAttachment_customization_4")
    public ResponseEntity<List<LoadoutGunDto>> getLoadoutGunByAttachment_customization_4(@RequestParam String attachment_customization_4) {
        List<LoadoutGunDto> loadoutGuns = loadoutGunService.findAllByAttachment_customization_4(attachment_customization_4);
        return ResponseEntity.ok(loadoutGuns);
    }
    @Operation(summary = "Получить по attachment_customization_5")
    @GetMapping("/byAttachment_customization_5")
    public ResponseEntity<List<LoadoutGunDto>> getLoadoutGunByAttachment_customization_5(@RequestParam String attachment_customization_5) {
        List<LoadoutGunDto> loadoutGuns = loadoutGunService.findAllByAttachment_customization_5(attachment_customization_5);
        return ResponseEntity.ok(loadoutGuns);
    }
}
