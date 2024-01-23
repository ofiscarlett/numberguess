package com.javagame.numberguess;

import java.io.File;
import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.core.type.TypeReference;

//import clojure.reflect.TypeReference;

public class WritePlayerToJson {
    private static final String FILE_NAME_PATH = "player.json";

    public String loadUsers(){
        StringBuilder result = new StringBuilder(); 
        Scanner reader = null;
    try{
        System.out.println("Reading the file using Scanner class");
        File myFile = new File(FILE_NAME_PATH);
        if(!myFile.exists()){
            return "File not exist";
            //reader = new Scanner(myFile);
            //while(reader.hasNextLine()){
            //String line = reader.nextLine();
            //result.append(line).append("\n");
            }
            //System.out.println(result.toString());
        reader = new Scanner(myFile);
        while(reader.hasNext()){
            result.append(reader.nextInt());
            //String line = reader.nextLine();
            //System.out.println(reader.nextInt());
        }
    } catch (Exception e) {
        System.out.println("Error while reading file line by line:" + e.getMessage());
        e.printStackTrace();
        return "Error";
    } finally {
        if(reader != null){
            reader.close();
        }
    }
    return result.toString().trim(); 
    }
/*     public String loadUsers() {
        //ObjectMapper objectMapper = new ObjectMapper();
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(FILE_NAME_PATH);
            try  {               
                //File file = new File(FILE_NAME_PATH);
                //lecture 4 has material slide 7
                //file.createNewFile();
            if (!file.exists()) {
                file.createNewFile();
                return "File not exist, create a new one"; // Return an empty list if the file doesn't exist yet
            }
            // Read the content of the file and return it
            return objectMapper.readValue(file, String.class); 
            
        } catch (IOException e) {
            e.printStackTrace();
            return "Error"; // Return an empty list on error
        }
    } */


public void saveUserInfo(String username) {
    ObjectMapper objectMapper = new ObjectMapper();
    
    try {
        objectMapper.writeValue(new File(FILE_NAME_PATH), username);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}