package com.ciia.ePradaan.service;

import com.ciia.ePradaan.repository.ePradaanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

@Service
public class ePradaanService {
    @Autowired

    private ePradaanRepository epradaanRepository;
    public List<Map<String,Object>> viewDonorsFundraiser()
    {
        return epradaanRepository.viewDonorsFundraiser();
    }
    public List<Map<String,Object>> viewDonorsNgo()
    {
        return epradaanRepository.viewDonorsNgo();
    }

//    public List<Map<String,Object>> sendEmail(){
//        return epradaanRepository.sendEmail();
//    }
    public void ngoDetails(@RequestBody Map<String,Object> ngoData){
        String Username=(String)ngoData.get("Username");
        String Password=(String)ngoData.get("Password");
        String Drives=(String)ngoData.get("Drives");
        String NgoAddress=(String)ngoData.get("NgoAddress");
        String Contact=(String)ngoData.get("Contact");
        String Email=(String)ngoData.get("Email");
        String District=(String)ngoData.get("District");
        String City=(String)ngoData.get("City");
        String Location=(String)ngoData.get("Location");
        String ngoDescription=(String)ngoData.get("ngoDescription");
        this.epradaanRepository.ngoDetails(Username,Password,Drives,NgoAddress,Contact,Email,District,City,Location,ngoDescription);
    }
    public  List<Map<String ,Object>> getNgos(){
        return epradaanRepository.getNgos(); }
    public void ngoAccepting(@RequestBody Map<String,Object> ngoAccepting){

        Integer NgoId=(Integer)ngoAccepting.get("Ngoid");
        System.out.println(NgoId);
        this.epradaanRepository.ngoAccepting(NgoId);
    }
    public  List<Map<String ,Object>> getNgosAccepted(){
        return epradaanRepository.getNgosAccepted(); }
}

