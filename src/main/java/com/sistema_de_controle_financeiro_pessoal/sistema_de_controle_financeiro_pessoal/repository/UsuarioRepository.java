package com.sistema_de_controle_financeiro_pessoal.sistema_de_controle_financeiro_pessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema_de_controle_financeiro_pessoal.sistema_de_controle_financeiro_pessoal.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

}
