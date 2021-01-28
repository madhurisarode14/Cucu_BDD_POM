package com.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties prop;

    /**
     * Read config file values
     * */
    public Properties init_prop(){
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream("C://Personal//Madhuri//Cucu_BDD_POM_Project//src//test//java//config//config.properties");
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;


    }

}
