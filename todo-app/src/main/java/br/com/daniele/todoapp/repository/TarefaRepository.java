package br.com.daniele.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.daniele.todoapp.model.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
