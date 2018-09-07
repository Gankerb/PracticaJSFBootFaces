
package com.mycompany.dao;

import com.mycompany.modell.Persona;
import java.util.ArrayList;

public interface PersonaDAO {
    public boolean createPersona(Persona pers);
    public ArrayList<Persona> readPersona();
    public boolean updatePersona(Persona pers);
    public boolean deletePersona(String id_persona);
}
