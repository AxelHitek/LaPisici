package com.lapisici.lapisici.domain.repository;

import com.lapisici.lapisici.domain.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CatRepository extends JpaRepository<Cat, Long> {

    Optional<Cat> findById(Long id);
}
