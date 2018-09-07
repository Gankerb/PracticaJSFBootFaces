import com.mycompany.controllerimpl.ClienteCtrlImpl;
import com.mycompany.dao.ClienteDAO;
import com.mycompany.modell.Cliente;
import java.util.ArrayList;


public class TestCliente {
    
    static ArrayList<Cliente> list = new ArrayList<>();
    
    public static void main(String[] args) {
        
        ClienteDAO cliedao;
        cliedao = new ClienteCtrlImpl();
/*        list = catdao.readCategoria();
          for(Categoria item: list){
              System.out.println(""+item.getName_cat());
          }*/
        Cliente clie = new Cliente();
//        clie.setId_cliente("5");
        clie.setNombres_razon_social("dulces");
        clie.setTelefono("2");
        clie.setCorreo("2");
        clie.setDni_ruc("2");
        if (cliedao.createCliente(clie)){
            System.out.println("Insertado correctamente");
        }else{
            System.out.println("Error al ingresar el dato");
        }
    }
    
}
