package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.DDD;

public interface DddRepository extends JpaRepository<DDD, Long> {

}
