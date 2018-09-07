
package com.mycompany.dao;

import com.mycompany.modell.Cliente;
import java.util.ArrayList;

public interface ClienteDAO {
    public boolean createCliente(Cliente clie);
    public ArrayList<Cliente> readCliente();
    public boolean updateCliente(Cliente clie);
    public boolean deleteCliente(String id);
}
