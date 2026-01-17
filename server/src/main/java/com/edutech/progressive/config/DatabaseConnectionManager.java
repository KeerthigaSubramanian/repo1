package com.edutech.progressive.config;

import java.io.InputStream;
import java.util.Properties;

public class DatabaseConnectionManager {
    private static final Properties properties = new Properties();

    private static void loadProperties()
    {
        //String propfilename=application.properties;
        try(InputStream inputStream=DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties"))
        {
            
        
        if(inputStream != null)
        {
            properties.load(inputStream);
        }
        else
        {
          throw new RuntimeException("Property file is not found");
        }
    }catch( e)
    {

    }
        
    }

}
