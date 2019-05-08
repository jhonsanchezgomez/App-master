package co.samtel.repo.admint.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import co.samtel.repo.admint.audit.Auditoria;
import co.samtel.repo.admint.enumeracion.MetodoTipoInf;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "app_tipo_metodo")
public class TipoMetodoEntity extends Auditoria<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_met")
	private Long id_met;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "metodo")
	private MetodoTipoInf metodo;
	
	@OneToOne
	@JoinColumn(name = "fk_servicio", referencedColumnName = "id_serv")
	private ServicioEntity servicio;

}
