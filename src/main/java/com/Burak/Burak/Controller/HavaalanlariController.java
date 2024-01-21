package com.Burak.Burak.Controller;

import com.Burak.Burak.Entity.Havaalanlari;
import com.Burak.Burak.Entity.Ucuslar;
import com.Burak.Burak.Service.HavaalanlariService;
import com.Burak.Burak.Service.UcuslarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/havaalanlari")
public class HavaalanlariController {
    @Autowired
    HavaalanlariService havaalanlariService;
    @PostMapping("/save")
    public ResponseEntity<Havaalanlari> saveHavaalanlari(@RequestBody Havaalanlari havaalanlari) {
        Havaalanlari savedHavaalanlari = havaalanlariService.saveHavaalanlari(havaalanlari);
        return new ResponseEntity<Havaalanlari>(savedHavaalanlari, HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Havaalanlari>> getAllHavaalanlari(){
        List<Havaalanlari> allHavaalanlari = havaalanlariService.getAllHavaalanlari();
        return new ResponseEntity<List<Havaalanlari>>(allHavaalanlari,HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Havaalanlari> updateHavaalanlariById(@PathVariable Long id,@RequestBody Havaalanlari havaalanlari){
        Havaalanlari updateHavaalanlari = havaalanlariService.updateHavaalanlari(havaalanlari);
        return new ResponseEntity<Havaalanlari>(updateHavaalanlari,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteHavaalanlariById(@PathVariable Long id){
        havaalanlariService.deleteHavaalanlariById(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
}
