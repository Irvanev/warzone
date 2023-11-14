package com.example.warzone.repositories;

import com.example.warzone.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LoadoutGunRepository extends JpaRepository<LoadoutGun,Long> {
    @Query("SELECT a FROM LoadoutGun a WHERE a.attachment_1 =: attachment_1")
    List<LoadoutGun> findAllByAttachment_1(String attachment_1);
    @Query("SELECT a FROM LoadoutGun a WHERE a.attachment_2 =: attachment_2")
    List<LoadoutGun> findAllByAttachment_2(String attachment_2);
    @Query("SELECT a FROM LoadoutGun a WHERE a.attachment_3 =: attachment_3")
    List<LoadoutGun> findAllByAttachment_3(String attachment_3);
    @Query("SELECT a FROM LoadoutGun a WHERE a.attachment_4 =: attachment_4")
    List<LoadoutGun> findAllByAttachment_4(String attachment_4);
    @Query("SELECT a FROM LoadoutGun a WHERE a.attachment_5 =: attachment_5")
    List<LoadoutGun> findAllByAttachment_5(String attachment_5);
    @Query("SELECT a FROM LoadoutGun a WHERE a.attachment_customization_1 =: attachment_customization_1")
    List<LoadoutGun> findAllByAttachment_customization_1(String attachment_customization_1);
    @Query("SELECT a FROM LoadoutGun a WHERE a.attachment_customization_2 =: attachment_customization_2")
    List<LoadoutGun> findAllByAttachment_customization_2(String attachment_customization_2);
    @Query("SELECT a FROM LoadoutGun a WHERE a.attachment_customization_3 =: attachment_customization_3")
    List<LoadoutGun> findAllByAttachment_customization_3(String attachment_customization_3);
    @Query("SELECT a FROM LoadoutGun a WHERE a.attachment_customization_4 =: attachment_customization_4")
    List<LoadoutGun> findAllByAttachment_customization_4(String attachment_customization_4);
    @Query("SELECT a FROM LoadoutGun a WHERE a.attachment_customization_5 =: attachment_customization_5")
    List<LoadoutGun> findAllByAttachment_customization_5(String attachment_customization_5);
    List<LoadoutGun> findAllByRange(String range);
    List<LoadoutGun> findAllByName(String name);
}
