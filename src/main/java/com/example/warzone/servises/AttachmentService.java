package com.example.warzone.servises;

import com.example.warzone.dtos.AttachmentsDto;

import java.util.List;
import java.util.Optional;

public interface AttachmentService {
    List<AttachmentsDto> getAll();

    Optional<AttachmentsDto> get(Long id);

    AttachmentsDto register(AttachmentsDto attachmentsDto);

    AttachmentsDto update(AttachmentsDto attachmentsDto);

    List<AttachmentsDto> findAllByName(String name);

    List<AttachmentsDto> findAllByWeaponsToOpen(String weaponsToOpen);

    List<AttachmentsDto> findAllByLevelsToOpen(short levelsToOpen);

    List<AttachmentsDto> findAllByAdvantages(String advantages);

    List<AttachmentsDto> findAllByDisadvantages(String disadvantages);

    void delete(Long id);
}
