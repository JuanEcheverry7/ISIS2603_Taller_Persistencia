package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;

import lombok.Data;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.ManyToMany;

import jakarta.persistence.Entity;

@Data
@Entity
public class TareaEntity extends BaseEntity {

    private String titulo;
    private EstadoTarea estado;
    private int duracionEstimada;

    @ManyToOne
    private ProyectoEntity proyecto;

    @ManyToMany(mappedBy="tareas")
    private ArrayList<DesarrolladorEntity> desarrolladores;
}
