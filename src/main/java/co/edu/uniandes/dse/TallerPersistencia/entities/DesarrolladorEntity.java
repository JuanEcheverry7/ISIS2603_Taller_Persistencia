package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Data
@Entity
public class DesarrolladorEntity extends BaseEntity {
    @Id
    private String nombre;
    private String correo;

    @ManyToMany
    private ArrayList<TareaEntity> tareas;

}
