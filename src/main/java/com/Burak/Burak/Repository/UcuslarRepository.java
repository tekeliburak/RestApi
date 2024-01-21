package com.Burak.Burak.Repository;

import com.Burak.Burak.Entity.Havaalanlari;
import com.Burak.Burak.Entity.Ucuslar;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface UcuslarRepository extends JpaRepository<Ucuslar, Long> {

    //List<Ucuslar> findByFilter(String Kalkis_Havaalani, String Varis_Havaalani, String Kalkis_Tarih, String Donus_Tarih);
    @Query("select e from Ucuslar e where e.Kalkis_Havaalani=:Kalkis_Havaalani and e.Varis_Havaalani=:Varis_Havaalani and e.Kalkis_Tarih=:Kalkis_Tarih and e.Donus_Tarih=:Donus_Tarih")
    List<Ucuslar> findByFilter(String Kalkis_Havaalani,String Varis_Havaalani, String Kalkis_Tarih, String Donus_Tarih);


}
