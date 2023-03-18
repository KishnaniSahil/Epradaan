package com.ciia.ePradaan.web;

import com.ciia.ePradaan.repository.ePradaanRepository;
import com.ciia.ePradaan.service.ePradaanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ePradaanResource {
    @Autowired
    private ePradaanService epradaanService;
    @GetMapping("/viewDonorsFundraiser")
    public List<Map<String,Object>> viewDonorsFundraiser()
    {
        return epradaanService.viewDonorsFundraiser();
    }
    @GetMapping("/viewDonorsNgo")
    public List<Map<String,Object>> viewDonorsNgo()
    {
        return epradaanService.viewDonorsNgo();
    }

//    @GetMapping("/email")
//    @EventListener(ApplicationReadyEvent.class)
//    public List<Map<String,Object>> sendEmail(){
//        return epradaanService.sendEmail();
//    }
    @PostMapping("ngoDetails")
    public void ngoDetails(@RequestBody Map<String,Object> ngoData){
        this.epradaanService.ngoDetails(ngoData);
    }
    @GetMapping("/getNgos")
    public  List<Map<String ,Object>> getNgos(){
        return epradaanService.getNgos(); }
    @PostMapping("ngoA")
    public void ngoAccepting(@RequestBody Map<String,Object> ngoAccepting){
        this.epradaanService.ngoAccepting(ngoAccepting);
    }
    @GetMapping("/getNgosAccepted")
    public  List<Map<String ,Object>> getNgosAccepted(){
        return epradaanService.getNgosAccepted(); }


}
