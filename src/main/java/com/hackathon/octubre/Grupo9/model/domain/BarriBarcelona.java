package com.hackathon.octubre.Grupo9.model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Barri")
public class BarriBarcelona implements Serializable{

	private static final long serialVersionUID = 1137352072360758663L;
	
	@Id
	@Column
	private String id;
	
	@Column(name = "Poblacion" )
	private long poblacion;
	
	@Column (name = "Densidad")
	private long densidad;
	
	@Column(name = "Mayores 65")
	private float mayores65;
	
	@Column(name="Titulados superior")
	private float titulados;
	
	@Column(name = "Poblacion sola")
	private float poblacion_sola;
	
	@Column(name= "Indice sobreenv")
	private float indice_sobreenv;
	
	@Column(name = "Renta familiar")
	private float 	renta_familiar;
	
	@Column(name = "CODI_DIVISIO_TERRITORIAL")
	private String codiDivisioTerritorial;
	
	@Column(name = "CODI_DIVISIO_TERRITORIAL_PARE")
	private String codiDivisioTerritorialPare;	
	
	@Column(name = "NOM_DIVISIO_TERRITORIAL")
	private String nomDivisioTerritorial;
	
	

	public BarriBarcelona() {
		
	}
	
	

	public BarriBarcelona(String id, long poblacion, long densidad, float mayores65, float titulados,
			float poblacion_sola, float indice_sobreenv, float renta_familiar, String codiDivisioTerritorial,
			String codiDivisioTerritorialPare, String nomDivisioTerritorial) {
		this.id = id;
		this.poblacion = poblacion;
		this.densidad = densidad;
		this.mayores65 = mayores65;
		this.titulados = titulados;
		this.poblacion_sola = poblacion_sola;
		this.indice_sobreenv = indice_sobreenv;
		this.renta_familiar = renta_familiar;
		this.codiDivisioTerritorial = codiDivisioTerritorial;
		this.codiDivisioTerritorialPare = codiDivisioTerritorialPare;
		this.nomDivisioTerritorial = nomDivisioTerritorial;
	}




	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public long getPoblacion() {
		return poblacion;
	}



	public void setPoblacion(long poblacion) {
		this.poblacion = poblacion;
	}



	public long getDensidad() {
		return densidad;
	}



	public void setDensidad(long densidad) {
		this.densidad = densidad;
	}



	public float getMayores65() {
		return mayores65;
	}



	public void setMayores65(float mayores65) {
		this.mayores65 = mayores65;
	}



	public float getTitulados() {
		return titulados;
	}



	public void setTitulados(float titulados) {
		this.titulados = titulados;
	}



	public float getPoblacion_sola() {
		return poblacion_sola;
	}



	public void setPoblacion_sola(float poblacion_sola) {
		this.poblacion_sola = poblacion_sola;
	}



	public float getIndice_sobreenv() {
		return indice_sobreenv;
	}



	public void setIndice_sobreenv(float indice_sobreenv) {
		this.indice_sobreenv = indice_sobreenv;
	}



	public float getRenta_familiar() {
		return renta_familiar;
	}



	public void setRenta_familiar(float renta_familiar) {
		this.renta_familiar = renta_familiar;
	}



	public String getCodiDivisioTerritorial() {
		return codiDivisioTerritorial;
	}



	public void setCodiDivisioTerritorial(String codiDivisioTerritorial) {
		this.codiDivisioTerritorial = codiDivisioTerritorial;
	}



	public String getCodiDivisioTerritorialPare() {
		return codiDivisioTerritorialPare;
	}



	public void setCodiDivisioTerritorialPare(String codiDivisioTerritorialPare) {
		this.codiDivisioTerritorialPare = codiDivisioTerritorialPare;
	}



	public String getNomDivisioTerritorial() {
		return nomDivisioTerritorial;
	}



	public void setNomDivisioTerritorial(String nomDivisioTerritorial) {
		this.nomDivisioTerritorial = nomDivisioTerritorial;
	}



	@Override
	public String toString() {
		return "BarriBarcelona [id=" + id + ", poblacion=" + poblacion + ", densidad=" + densidad + ", mayores65="
				+ mayores65 + ", titulados=" + titulados + ", poblacion_sola=" + poblacion_sola + ", indice_sobreenv="
				+ indice_sobreenv + ", renta_familiar=" + renta_familiar + ", codiDivisioTerritorial="
				+ codiDivisioTerritorial + ", codiDivisioTerritorialPare=" + codiDivisioTerritorialPare
				+ ", nomDivisioTerritorial=" + nomDivisioTerritorial + "]";
	}
	
	
}
