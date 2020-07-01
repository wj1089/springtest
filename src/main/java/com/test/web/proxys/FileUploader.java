package com.test.web.proxys;


import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

@Service("uploder") @Lazy
public class FileUploader  extends Proxy{
    @Autowired Inventory<String> inventory;

    public void upload(){
        inventory.clear();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\b")));
            String player = "";
            while((player = reader.readLine()) != null){
                inventory.add(player);
            }
        }catch(Exception e){
//            print("파일 리딩 에러");
            e.printStackTrace();
        }
//        print("--------------------------------------\n");
        
    }
 }
