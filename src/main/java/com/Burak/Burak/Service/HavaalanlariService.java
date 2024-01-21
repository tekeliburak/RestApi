package com.Burak.Burak.Service;

import com.Burak.Burak.Entity.Havaalanlari;
import com.Burak.Burak.Entity.Ucuslar;
import com.Burak.Burak.Repository.HavaalanlariRepository;
import com.Burak.Burak.Repository.UcuslarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HavaalanlariService {
    @Autowired
    HavaalanlariRepository havaalanlariRepository;

    public Havaalanlari saveHavaalanlari(Havaalanlari havaalanlari){
        return havaalanlariRepository.save(havaalanlari);
    }
    public List<Havaalanlari> getAllHavaalanlari(){
        return havaalanlariRepository.findAll();
    }

    public Havaalanlari updateHavaalanlari(Havaalanlari havaalanlari){
        return havaalanlariRepository.save(havaalanlari);
    }

    public void deleteHavaalanlariById(Long Id){
        havaalanlariRepository.deleteById(Id);
    }
}
