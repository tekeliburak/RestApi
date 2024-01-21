package com.Burak.Burak.Service;

import com.Burak.Burak.Entity.Ucuslar;
import com.Burak.Burak.Repository.UcuslarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UcuslarService {

    @Autowired
    UcuslarRepository ucuslarRepository;

    public Ucuslar saveUcuslar(Ucuslar ucuslar){
        return ucuslarRepository.save(ucuslar);
    }
    public List<Ucuslar> getAllUcuslar(){
        return ucuslarRepository.findAll();
    }

    public List<Ucuslar> getAllByFilter(String Kalkis_Havaalani, String Varis_Havaalani, String Kalkis_Tarih, String Donus_Tarih){
        return ucuslarRepository.findByFilter(Kalkis_Havaalani,Varis_Havaalani,Kalkis_Tarih,Donus_Tarih);
    }






    public Ucuslar updateUcuslar(Ucuslar ucuslar){
        return ucuslarRepository.save(ucuslar);
    }

    public void deleteUcuslarById(Long Id){
        ucuslarRepository.deleteById(Id);
    }



}
