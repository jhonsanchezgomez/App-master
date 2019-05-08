package co.samtel.repo.admint.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.samtel.repo.admint.audit.Auditoria;
import co.samtel.repo.admint.enumeracion.TipoAutInt;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
@Table(name = "app_autenticacion")
public class AutenticacionEntity extends Auditoria<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_aut")
	private Long id_aut;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo")
	private TipoAutInt tipo;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name =  "contrasenia")
	private String contrasenia;
	
	
	@ManyToOne
	@JoinColumn(name = "fk_aplicacion", referencedColumnName = "id_app")
	private AplicacionIntegraEntity aplicacion;

}
