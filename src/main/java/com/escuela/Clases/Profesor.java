package com.escuela.Clases;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Profesor extends Persona{
    private  int aĆ±oDeEgresoDeFacultad;
    private int aĆ±oIngresoAInsitucionEducativa;
    private List<Materia> materias = new ArrayList<Materia>();

    public int CuantasMaterias(){
        return materias.size();
    }




}
