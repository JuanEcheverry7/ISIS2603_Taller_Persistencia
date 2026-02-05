package co.edu.uniandes.dse.TallerPersistencia.repositories;
import co.edu.uniandes.dse.TallerPersistencia.entities.TareaEntity;
import co.edu.uniandes.dse.TallerPersistencia.entities.EstadoTarea;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepositorio extends JpaRepository<TareaEntity, Long> {
    ArrayList<TareaEntity> findByEstado(EstadoTarea estado);
}
