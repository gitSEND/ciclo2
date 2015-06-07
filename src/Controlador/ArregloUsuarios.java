package Controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.UUID;
import java.*;

import Clases.Usuario;
import Mantenimiento.Login;

public class ArregloUsuarios {
	
	private ArrayList<Usuario> user=new ArrayList<Usuario>();
	
	
	//Constructor
	public ArregloUsuarios(){
		cargar();
		
	}
	//Devuelve el listado de usuarios
	public ArrayList<Usuario> Listado_Usuarios(){
		return user;
	}
	
	//Cantidad de objetos ingresado en el Arreglo
	public int tamaño(){
		return user.size();
	}
	
	//Metodo que registra un objeto en el Arreglo
	public void registrar(Usuario x){
		user.add(x);
	}
	
	// Metodo que permite eliminar un objeto en un Arreglo
	public void eliminar(Usuario x){
		user.remove(x);
	}

	// Metodo que reciba una posicion y retorne el objeto que esta en un Arreglo
	public Usuario obtener(int pos){
		return user.get(pos);
	}
	
	// Metodo que reciba un codigo y permita buscar y retorne el objeto dentro de un arreglo
	public Usuario buscar(int cod){
		for(Usuario x:user){
			if(x.getCodigo()==cod)
				return x;
		}
		return null;
	}
	
	//GENERAR CODIGO
	public int Genera_Codigo(){
		int cod=0;
		
		if(tamaño()==0){
			cod=1;
		}else{
			cod=user.get(tamaño()-1).getCodigo()+1;
		}
		return cod;
		
	}
	
	//GRABAR EN UN ARCHIVO TXT
	public void grabar() {

		try {
			PrintWriter pw = new PrintWriter(new FileWriter("usuarios.txt"));
			String linea;
			for (Usuario u : user) {
				// La variable linea almacena el registro actual
				linea = u.getCodigo() + "," + u.getNombres()+","+u.getApellidos()+","+
				u.getCodigo_docum()+","+u.getDocumento()+","+u.getArea()+","+
				u.getCorreo()+","+u.getTelefono()+","+u.getFecha_ing()+","+u.getEstado();
				// Grabar el registro actual en el archivo Empleado.txt
				pw.println(linea);
			}
			// Cerrar el archivo
			pw.close();
		} catch (Exception e) {
			// Mostrar el mensaje de error
			e.printStackTrace();
		}

	}
	
	// Graba del archivo de texto a la memoria (ArrayList)
		public void cargar() {
			try {
				BufferedReader br = new BufferedReader(new FileReader(
						"usuarios.txt"));
				String linea;
				// Crear arreglo tipo string separando los campos
				while ((linea = br.readLine()) != null) {
					String sep[] = linea.split(",");
					// Crear el objeto
					Usuario u=new Usuario(Integer.parseInt(sep[0]), sep[1], sep[2], Integer.parseInt(sep[3]),
							sep[4], Integer.parseInt(sep[5]), sep[6], sep[7], sep[8], Integer.parseInt(sep[9]));
					// Enviar objeto e al arreglo emp
					user.add(u);
				}
				br.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
}
