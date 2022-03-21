package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Taxa;

public interface TaxaRepository extends JpaRepository<Taxa, Long> {

	Taxa findOneByOrigem_IdAndDestino_Id(long origemId, long destinoId);
}
