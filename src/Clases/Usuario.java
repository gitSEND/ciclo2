package Clases;

public class Usuario {

	private int codigo;
	private String nombres, apellidos;
	private int codigo_docum;
	private String documento;
	private int area;
	private String correo, telefono;
	private String fecha_ing;
	private int estado;
	
	
	
	public Usuario(){
		
	}
	
	public Usuario(int codigo, String nombres, String apellidos,
			int codigo_docum, String documento, int area, String correo,
			String telefono, String fecha_ing, int estado) {
		
		this.codigo = codigo;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.codigo_docum = codigo_docum;
		this.documento = documento;
		this.area = area;
		this.correo = correo;
		this.telefono = telefono;
		this.fecha_ing = fecha_ing;
		this.estado = estado;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getCodigo_docum() {
		return codigo_docum;
	}
	public void setCodigo_docum(int codigo_docum) {
		this.codigo_docum = codigo_docum;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getFecha_ing() {
		return fecha_ing;
	}
	public void setFecha_ing(String fecha_ing) {
		this.fecha_ing = fecha_ing;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
	
}
