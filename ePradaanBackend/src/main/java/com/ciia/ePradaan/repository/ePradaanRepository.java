package com.ciia.ePradaan.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class ePradaanRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
//    private JavaMailSender javaMailSender;
//    List<Map<String,Object>> l1=new ArrayList<>();
//    List<String> l2=new ArrayList<>();
    public List<Map<String,Object>> viewDonorsFundraiser(){
        return jdbcTemplate.queryForList("EXEC ePradhaan.sp_fetchDonorsFundraiser");
    }
    public List<Map<String,Object>> viewDonorsNgo(){
        return jdbcTemplate.queryForList("EXEC ePradhaan.sp_fetchDonorsNgo");
    }
    public void ngoDetails(String Username,String Password,String Drives,String NgoAddress,
                           String Contact,String Email,String District,String City,String Location,
                           String ngoDescription){
        this.jdbcTemplate.update("exec ePradhaan.sp_insertNgo ?,?,?,?,?,?,?,?,?,?",Username,Password,Drives,NgoAddress,Contact,Email,District,City,Location,ngoDescription);

    }
    public  List<Map<String ,Object>> getNgos(){
        return this.jdbcTemplate.queryForList("EXEC ePradhaan.sp_fetchNgo") ;}
    public void ngoAccepting(Integer NgoId){
        System.out.println(this.jdbcTemplate.update("Exec ePradhaan.Sp_acceptRequestofNgo ?",NgoId));
    }
    public  List<Map<String ,Object>> getNgosAccepted(){
       return this.jdbcTemplate.queryForList("exec ePradhaan.sp_fetchNgoAccepted");
    }

//    public List<Map<String,Object>> sendEmail(){
//
//        this.l1.addAll(this.jdbcTemplate.queryForList("EXEC epradhaan.sp_sendDonorEmail"));
//        for(int i=0;i<l1.size();i++){
//            for(Object val:l1.get(i).values()){
//                //System.out.println(val);
//                l2.add(val.toString());
//            }
//        }
//        //System.out.println(l2);
//        SimpleMailMessage mail = new SimpleMailMessage();
//        for(int i=0;i<l2.size();i++) {
//            mail.setFrom("e.pradaan@gmail.com");
//            mail.setTo(l2.get(i));
//            mail.setSubject("regarding confirmation of donation");
//            mail.setText("Your donation request has been successfully accepted");
//            javaMailSender.send(mail);
//
//        }
//        System.out.println("succesfully send");
//        return this.jdbcTemplate.queryForList("EXEC epradhaan.sp_sendDonorEmail");
//
//    }


}
