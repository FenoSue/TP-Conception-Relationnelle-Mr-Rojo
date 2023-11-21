package com.example.springboot;

import classes.HttpRetour;
import java.sql.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.Service;

@RestController
public class HelloController {

    Service s = new Service();
    
    @CrossOrigin(origins = "*")
    @GetMapping("/test")
    public String test() throws Exception {
        return "ok insert Vehicule";
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("/InsertRebond")
    public HttpRetour insertRebond(@RequestParam String idMatch, @RequestParam String idJoueur, @RequestParam String nombre, @RequestParam String typeRebond) throws Exception {
        HttpRetour retourRebond = s.insertRebond(idMatch, idJoueur, nombre, typeRebond);
        return retourRebond;
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("/InsertPasseTir")
    public HttpRetour insertPasseTir(@RequestParam String idMatch, @RequestParam String idJoueur, @RequestParam String nombre, @RequestParam String types) throws Exception {
        HttpRetour retourPasse = s.insertPasseTir(idMatch, idJoueur, nombre, types);
        return retourPasse;
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("/InsertStatistique")
    public HttpRetour insertStatistique(@RequestParam String idMatch, @RequestParam String idJoueur, @RequestParam String point, @RequestParam String minutes) throws Exception {
        HttpRetour retourStat = s.insertStatistique(idMatch, idJoueur, point, minutes);
        return retourStat;
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("/ListeEquipe")
    public ResponseEntity<HttpRetour> listeEquipe() throws Exception {
        HttpRetour retourEquipe = s.listeEquipe();
        ResponseEntity<HttpRetour> response = new ResponseEntity<>(retourEquipe, HttpStatus.OK);
        return response;
    }  
    
    @CrossOrigin(origins = "*")
    @GetMapping("/GetJoueurEquipe")
    public ResponseEntity<HttpRetour> getjoueurEquipe(@RequestParam String idEquipe) throws Exception {
        HttpRetour retourEquipe = s.getJoueur(idEquipe);
        ResponseEntity<HttpRetour> response = new ResponseEntity<>(retourEquipe, HttpStatus.OK);
        return response;
    } 
    
    @CrossOrigin(origins = "*")
    @GetMapping("/GetStatistiqueJoueur")
    public ResponseEntity<HttpRetour> getStatistiqueJoueur(@RequestParam String idJoueur) throws Exception {
        HttpRetour retourEquipe = s.getStatistiqueJoueur(idJoueur);
        ResponseEntity<HttpRetour> response = new ResponseEntity<>(retourEquipe, HttpStatus.OK);
        return response;
    } 
    
    @CrossOrigin(origins = "*")
    @GetMapping("/GetStatJoueur")
    public ResponseEntity<HttpRetour> getStatJoueur(@RequestParam String idJoueur) throws Exception {
        HttpRetour retourEquipe = s.getStatJoueur(idJoueur);
        ResponseEntity<HttpRetour> response = new ResponseEntity<>(retourEquipe, HttpStatus.OK);
        return response;
    } 
}
