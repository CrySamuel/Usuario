package com.javanauta.usuario.infrastructury.repository;

import com.javanauta.usuario.infrastructury.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long > {
}
