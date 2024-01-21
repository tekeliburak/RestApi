package com.Burak.Burak.Controller;

import com.Burak.Burak.Entity.Ucuslar;
import com.Burak.Burak.Service.UcuslarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ucuslar")
public class UcuslarController {
    @Autowired
    UcuslarService ucuslarService;
    @PostMapping("/save")
    public ResponseEntity<Ucuslar> saveUcuslar(@RequestBody Ucuslar ucuslar) {
        Ucuslar savedUcuslar = ucuslarService.saveUcuslar(ucuslar);
        return new ResponseEntity<Ucuslar>(savedUcuslar, HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Ucuslar>> getAllUcuslar(){
    List<Ucuslar> allUcuslar = ucuslarService.getAllUcuslar();
    return new ResponseEntity<List<Ucuslar>>(allUcuslar,HttpStatus.OK);
    }
    /*
        KH = Kalkis havaalani
        VH = Varis Havaalanı
        KT = kalkıs tarihi
        DT = Donus tarihi
     */
    @GetMapping("/filter/{KH}/{VH}/{KT}/{DT}")
    public ResponseEntity<List<Ucuslar>> getAllByFilter(@PathVariable String KH, @PathVariable String VH, @PathVariable String KT, @PathVariable String DT){
        List<Ucuslar> filterUcus = ucuslarService.getAllByFilter(KH,VH,KT,DT);
        return new ResponseEntity<List<Ucuslar>>(filterUcus, HttpStatus.OK);
    }



    @PutMapping("/update/{id}")
    public ResponseEntity<Ucuslar> updateUcuslarById(@PathVariable Long id,@RequestBody Ucuslar ucuslar){
    Ucuslar updateUcuslar = ucuslarService.updateUcuslar(ucuslar);
    return new ResponseEntity<Ucuslar>(updateUcuslar,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUcuslarById(@PathVariable Long id){
        ucuslarService.deleteUcuslarById(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }




}
