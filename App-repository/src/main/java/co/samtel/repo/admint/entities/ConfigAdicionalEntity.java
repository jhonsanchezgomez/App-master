package co.samtel.repo.admint.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.samtel.repo.admint.audit.Auditoria;
import co.samtel.repo.admint.enumeracion.ConfigAdicionalInf;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "app_configuracion_adicional")
public class ConfigAdicionalEntity extends Auditoria<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_conf")
	private Long id_conf;
	
	@Enumerated
	@Column(name = "configuracion")
	private ConfigAdicionalInf configuracion;
	
	@Column(name = "valor")
	private String valor;
	
	@ManyToOne
	@JoinColumn(name = "fk_aplicacion", referencedColumnName = "id_app")
	private AplicacionIntegraEntity aplicacion;

}
