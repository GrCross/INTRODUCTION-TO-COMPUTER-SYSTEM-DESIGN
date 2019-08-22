package edu.escuelaing.arem.ASE.app.transformer;

import spark.ResponseTransformer;
import  com.google.gson.*;

public class JsonUtil{

     
  public static String toJson(Object object) {
    return new Gson().toJson(object);
  }
 
  public static ResponseTransformer json() {
    return JsonUtil::toJson;
  }


}