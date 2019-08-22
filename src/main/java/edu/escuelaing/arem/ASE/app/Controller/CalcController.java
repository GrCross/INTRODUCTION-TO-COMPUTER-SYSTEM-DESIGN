package edu.escuelaing.arem.ASE.app.Controller;

import edu.escuelaing.arem.ASE.app.Services.CalcService;
import spark.Request;
import spark.Response;
import spark.Route;
import static spark.Spark.*;
import  edu.escuelaing.arem.ASE.app.transformer.JsonUtil;

public class CalcController{

    

    public CalcController(final CalcService calcService){
        after((req,res)->{
            res.type("application/json");
        });
        
        get("/mean",new Route(){
        
            @Override
            public Object handle(Request request, Response response) throws Exception { 
                return calcService.getMean();
            }
        },JsonUtil.json());

    }

}