
package com.mycompany.controller;

import com.mycompany.modell.Persona;
import com.mycompany.dao.PersonaDAO;
import com.mycompamy.configbd.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaCtrl implements PersonaDAO {

    Conexionbd cx;
    String sql;
    ResultSet rs;
    ArrayList<Persona> listDatos;

    public PersonaCtrl() {
        cx = new Conexionbd();
    }

    @Override
    public boolean createPersona(Persona pers) {
        sql = "INSERT INTO public.persona(first_name, last_name, dni, id_persona)"
                + "VALUES('" + pers.getFirst_name() + "','" + pers.getLast_name() + "','" + pers.getDni() + "'," + pers.getId_persona() + ")";
        return cx.executeInsertUpdate(sql);
    }

    @Override
    public ArrayList<Persona> readPersona() {
        listDatos = new ArrayList<>();
        sql = "SELECT * "
                + "    FROM public.persona";
        rs = cx.executeQuery(sql);
        try {
            while (rs.next()) {
                listDatos.add(new Persona(rs.getString("first_name"),rs.getString("last_name"),rs.getString("dni"),rs.getString("id_persona")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaCtrl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDatos;
    }

    @Override
    public boolean updatePersona(Persona pers) {
        sql = "UPDATE public.persona SET"
                + " first_name = '"+pers.getFirst_name()+"' , last_name = '"+pers.getLast_name()+"' , dni = '"+pers.getDni()+"' "
                + " WHERE id_persona = "+pers.getId_persona()+" ";
        return cx.executeInsertUpdate(sql);
    }

    @Override
    public boolean deletePersona(String id_persona) {
        sql = "DELETE public.persona "
                + "WHERE id_persona = "+id_persona+" ";
        return cx.executeInsertUpdate(sql);
    }

}
