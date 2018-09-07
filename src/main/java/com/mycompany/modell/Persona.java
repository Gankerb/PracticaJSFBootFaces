
package com.mycompany.modell;

public class Persona {
    String first_name, last_name, dni, id_persona;

    public Persona(String first_name, String last_name, String dni, String id_persona) {
        this.id_persona = id_persona;        
        this.first_name = first_name;
        this.last_name = last_name;
        this.dni = dni;

    }

    public Persona() {
    }
    
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }
    
}
