package co.samtel.repo.admint.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import co.samtel.repo.admint.audit.Auditoria;
import co.samtel.repo.admint.enumeracion.TipoServicioInt;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "app_servicio")
public class ServicioEntity extends Auditoria<String>{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_serv")
	private Long id_serv;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "url")
	private String url;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo")
	private TipoServicioInt tipo;
	
	@ManyToOne
	@JoinColumn(name = "fk_aplicacion", referencedColumnName = "id_app")
	private AplicacionIntegraEntity aplicacion;
	
	@OneToOne(mappedBy = "servicio", cascade = CascadeType.ALL)
	private TipoMetodoEntity tipMetodo;
	
	
}
