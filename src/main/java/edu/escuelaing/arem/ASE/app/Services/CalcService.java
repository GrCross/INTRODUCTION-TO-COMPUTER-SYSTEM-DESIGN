package edu.escuelaing.arem.ASE.app.Services;

import java.io.File;
import java.io.FileNotFoundException;

import edu.escuelaing.arem.ASE.app.entities.Calc;

public class CalcService {

    public double getMean() throws FileNotFoundException {
        File file = new File("entryTest1.in");
        Calc calc = new Calc(file);
        return calc.mean();
    }

    public double getDesviation(){

        return 0;
    }

}