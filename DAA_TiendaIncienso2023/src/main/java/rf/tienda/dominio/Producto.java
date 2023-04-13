package rf.tienda.dominio;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import rf.tienda.util.ErrorMessages;
import rf.tienda.util.Validator;


@Entity
public class Producto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id_producto;         //id de producto
	private String pro_descripcion;
	private String pro_desLarga;
	private double pro_precio;
	private int pro_stock;
	private LocalDate pro_fecRepos;
	private LocalDate pro_fecActi;
	private LocalDate pro_fecDesacti;
	private String pro_uniVenta;
	private double pro_cantXUniVenta;
	private String pro_uniUltNivel;
	private int id_pais;
	private String pro_usoRecomendado;
	private int id_categoria;
	private int pro_stkReservado;
	private int pro_nStkAlto;
	private int pro_nStkBajo;
	private Character pro_stat;
	
	
	
	public Producto() {
		
	}



	public String getId_producto() {
		return id_producto;
	}



	public void setId_producto(String id_producto) {
		
		if(Validator.esIdProductoValido(id_producto))
		{
			this.id_producto = id_producto;
		}
		else
		{
			System.out.println(ErrorMessages.PROERR_002);
		}
		
	}



	public String getPro_descripcion() {
		return pro_descripcion;
	}



	public void setPro_descripcion(String pro_descripcion) {
		
		if(Validator.esDEscripcionValida(pro_descripcion))
		{
			this.pro_descripcion = pro_descripcion;
		}
		else
		{
			System.out.println(ErrorMessages.PROERR_003);
		}
		
	}



	public String getPro_desLarga() {
		return pro_desLarga;
	}



	public void setPro_desLarga(String pro_desLarga) {
		
		if(Validator.esDesLargaValida(pro_desLarga))
		{
			this.pro_desLarga = pro_desLarga;
		}
		else
		{
			System.out.println(ErrorMessages.PROERR_004);
		}
	}



	public double getPro_precio() {
		return pro_precio;
	}



	public void setPro_precio(double pro_precio) {
		
		if(Validator.proPRecioValido(pro_precio))
		{
			this.pro_precio = pro_precio;
		}
		else
		{
			System.out.println(ErrorMessages.PROERR_006);
		}
		
	}



	public int getPro_stock() {
		return pro_stock;
	}



	public void setPro_stock(int pro_stock) {
		if(pro_stock>=0)
		{
			this.pro_stock = pro_stock;
		}
		else
		{
			System.out.println(ErrorMessages.PROERR_007);
		}
		
	}



	public LocalDate getPro_fecRepos() {
		return pro_fecRepos;
	}



	public void setPro_fecRepos(LocalDate pro_fecRepos) {
		
		if(Validator.proFecRepos(pro_fecRepos))
		{
			this.pro_fecRepos = pro_fecRepos;
		}
		else
		{
			System.out.println(ErrorMessages.PROERR_005);
		}
		
	}

	


	public LocalDate getPro_fecActi() {
		return pro_fecActi;
	}



	public void setPro_fecActi(LocalDate pro_fecActi) {
		
		if(Validator.proFecActivacion(pro_fecActi))
		{
			this.pro_fecActi = pro_fecActi;

		}
		else
		{
			System.out.println(ErrorMessages.PROERR_005);
		}
	}



	public LocalDate getPro_fecDesacti() {
		return pro_fecDesacti;
	}



	public void setPro_fecDesacti(LocalDate pro_fecDesacti) {
		
		if(Validator.proFecDesactivacion(pro_fecDesacti))
		{
			this.pro_fecDesacti = pro_fecDesacti;

		}
		else
		{
			System.out.println(ErrorMessages.PROERR_005);
		}
	}



	public String getPro_uniVenta() {
		return pro_uniVenta;
	}



	public void setPro_uniVenta(String pro_uniVenta) {
		this.pro_uniVenta = pro_uniVenta;
	}



	public double getPro_cantXUniVenta() {
		return pro_cantXUniVenta;
	}



	public void setPro_cantXUniVenta(double pro_cantXUniVenta) {
		this.pro_cantXUniVenta = pro_cantXUniVenta;
	}



	public String getPro_uniUltNivel() {
		return pro_uniUltNivel;
	}



	public void setPro_uniUltNivel(String pro_uniUltNivel) {
		this.pro_uniUltNivel = pro_uniUltNivel;
	}



	public int getId_pais() {
		return id_pais;
	}



	public void setId_pais(int id_pais) {
		this.id_pais = id_pais;
	}



	public String getPro_usoRecomendado() {
		return pro_usoRecomendado;
	}



	public void setPro_usoRecomendado(String pro_usoRecomendado) {
		this.pro_usoRecomendado = pro_usoRecomendado;
	}



	public int getId_categoria() {
		return id_categoria;
	}



	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}



	public int getPro_stkReservado() {
		return pro_stkReservado;
	}



	public void setPro_stkReservado(int pro_stkReservado) {
		this.pro_stkReservado = pro_stkReservado;
	}



	public int getPro_nStkAlto() {
		return pro_nStkAlto;
	}



	public void setPro_nStkAlto(int pro_nStkAlto) {
		this.pro_nStkAlto = pro_nStkAlto;
	}



	public int getPro_nStkBajo() {
		return pro_nStkBajo;
	}



	public void setPro_nStkBajo(int pro_nStkBajo) {
		this.pro_nStkBajo = pro_nStkBajo;
	}



	public Character getPro_stat() {
		return pro_stat;
	}



	public void setPro_stat(Character pro_stat) {
		this.pro_stat = pro_stat;
	}



	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", pro_descripcion=" + pro_descripcion + ", pro_desLarga="
				+ pro_desLarga + ", pro_precio=" + pro_precio + ", pro_stock=" + pro_stock + ", pro_fecRepos="
				+ pro_fecRepos + ", pro_fecActi=" + pro_fecActi + ", pro_fecDesacti=" + pro_fecDesacti
				+ ", pro_uniVenta=" + pro_uniVenta + ", pro_cantXUniVenta=" + pro_cantXUniVenta + ", pro_uniUltNivel="
				+ pro_uniUltNivel + ", id_pais=" + id_pais + ", pro_usoRecomendado=" + pro_usoRecomendado
				+ ", id_categoria=" + id_categoria + ", pro_stkReservado=" + pro_stkReservado + ", pro_nStkAlto="
				+ pro_nStkAlto + ", pro_nStkBajo=" + pro_nStkBajo + ", pro_stat=" + pro_stat + ", getId_producto()="
				+ getId_producto() + ", getPro_descripcion()=" + getPro_descripcion() + ", getPro_desLarga()="
				+ getPro_desLarga() + ", getPro_precio()=" + getPro_precio() + ", getPro_stock()=" + getPro_stock()
				+ ", getPro_fecRepos()=" + getPro_fecRepos() + ", getPro_fecActi()=" + getPro_fecActi()
				+ ", getPro_fecDesacti()=" + getPro_fecDesacti() + ", getPro_uniVenta()=" + getPro_uniVenta()
				+ ", getPro_cantXUniVenta()=" + getPro_cantXUniVenta() + ", getPro_uniUltNivel()="
				+ getPro_uniUltNivel() + ", getId_pais()=" + getId_pais() + ", getPro_usoRecomendado()="
				+ getPro_usoRecomendado() + ", getId_categoria()=" + getId_categoria() + ", getPro_stkReservado()="
				+ getPro_stkReservado() + ", getPro_nStkAlto()=" + getPro_nStkAlto() + ", getPro_nStkBajo()="
				+ getPro_nStkBajo() + ", getPro_stat()=" + getPro_stat() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
}
