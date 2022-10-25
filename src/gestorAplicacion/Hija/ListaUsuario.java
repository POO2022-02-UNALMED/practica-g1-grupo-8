package gestorAplicacion.Hija;
import java.io.Serializable;
import java.util.ArrayList;

public class ListaUsuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static ArrayList<Usuario> ListaUsuario= new ArrayList<Usuario>();

	public ArrayList<Usuario> getListaUsuario() {
		return ListaUsuario;
	}

	public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
		ListaUsuario = listaUsuario;
	}
	
	public void añadirUsuario(Usuario usuario) {
		ListaUsuario.add(usuario);
	}
	public String toString() {
		String p="";
		for(int i=0;i<ListaUsuario.size();i++){
			p="\n"+(i+1)+"Nombre"+ListaUsuario.get(i).getContactoUsuario().getNombre();
	}
	return p;}
	public Usuario usuario(int i) {
		return ListaUsuario.get(i);
	}

}
