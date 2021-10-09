package salestargetcalculator.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SalesmanRepository implements ExperienceRepository {

    public String[] getExperienceAndPosition(int id) throws ExperienceRepositoryException {

        String output[] =  null;
        String line = null;
        //read the experience and position of sales person from text file
        try {
            File f = new File("SalesPersonRecord.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine()) != null){
                
                String[] columns = line.split(",");
                int personID = Integer.parseInt(columns[0]);                
                if(personID == id){
                    
                    output = new String[2];
                    output[0] =  columns[1]; 
                    output[1] =  columns[2];   
                    
                }
            }
            
        } catch (IOException e) {
            throw new ExperienceRepositoryException(e,"Couldn't read the text file.");
        }

        return output;

    }  
    
}
