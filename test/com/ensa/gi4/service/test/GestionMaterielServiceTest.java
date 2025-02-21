package com.ensa.gi4.service.test;

import com.ensa.gi4.controller.GestionMaterielController;
import com.ensa.gi4.datatabase.api.UserDao;
import com.ensa.gi4.modele.*;
import com.ensa.gi4.service.api.GestionMaterielService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class GestionMaterielServiceTest {

    @Autowired
    GestionMaterielService gestionMaterielService;
    @Autowired
    UserDao userDao;

    GestionMaterielController gestionMaterielController;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void listerMateriel() {
    }

    @Test
    public void listerAllocations() {
    }

    @Test
    public void chercherMaterielID() {

    }

    @Test
    public void ajouterNouveauMateriel() {
    }

    @Test
    public void modifierMateriel() {
    }

    @Test
    public void supprimerMateriel() {
    }

    @Test
    public void allouerMateriel() {
    }

    @Test
    public void affihcerMaterielAllouerParUtilisateur() {
    }

    @Test
    public void rendreMateriel() {
    }

    @Test
    public void changerDisponibilte() {
    }

    @Test
    public void loginUser(){
        assertNotNull(userDao.findUser("admin","admin"));
        assertEquals("admin",userDao.findUser("admin","admin").getUsername());
    }

    @Test
    public void hashCodeMethodeTest(){
        String hash = "d033e22ae348aeb5660fc2140aec35850c4da997";
        String password = "admin";
        assertEquals(hash, gestionMaterielController.doHashing(password));
    }
}