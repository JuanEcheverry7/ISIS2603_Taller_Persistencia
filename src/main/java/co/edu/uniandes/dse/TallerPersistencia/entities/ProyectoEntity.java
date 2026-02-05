package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class ProyectoEntity extends BaseEntity {
    @Id
    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "proyecto", orphanRemoval=true)
    private ArrayList<TareaEntity> tareas;
}
