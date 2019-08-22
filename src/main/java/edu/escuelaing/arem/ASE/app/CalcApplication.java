package edu.escuelaing.arem.ASE.app;


import static spark.Spark.*;

import org.apache.log4j.PropertyConfigurator;

import edu.escuelaing.arem.ASE.app.Controller.CalcController;
import edu.escuelaing.arem.ASE.app.Services.CalcService;

public class CalcApplication {

    public static void main(String[] args) {
        //port(getPort());
        PropertyConfigurator.configure(".\\src\\main\\resources\\log4j.properties");
        //get("/hello", (req, res) -> "Hello Heroku");

        new CalcController(new CalcService());
        
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; 
    }
}
