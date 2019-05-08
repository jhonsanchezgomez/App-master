package co.samtel.repo.admint.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.samtel.repo.admint.audit.Auditoria;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
@Table(name = "app_aplicacion_integra")
public class AplicacionIntegraEntity extends Auditoria<String>{
	
	@Id
	@Column(name = "id_app")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_app;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "codigo")
	private String codigo;
	
	@OneToMany(mappedBy = "aplicacion", cascade = CascadeType.ALL)
	private List<AutenticacionEntity> autenticaciones;

	@OneToMany(mappedBy = "aplicacion", cascade = CascadeType.ALL)
	private List<ConfigAdicionalEntity> configuracionesAdic;
	
	@OneToMany(mappedBy = "aplicacion", cascade = CascadeType.ALL)
	private List<ServicioEntity> servicios;
}
