package br.com.daniele.todoapp.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.Example;
import io.swagger.annotations.ExampleProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.MediaType;

import br.com.daniele.todoapp.model.enums.StatusTarefa;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@ApiModel("Tarefa")
@Table(name = "tarefa")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tarefa {

    public class builder {

	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3, max = 250)
    private String titulo;

    @Size(min = 0, max = 250)
    private String descricao;

    @Column(name = "dtfim")
    private LocalDate dtFim;

    @Enumerated(EnumType.STRING)
    private StatusTarefa status;

    @NotNull
    @Column(name = "dtcadastro")
    private LocalDate dtCadastro;

    @NotNull
    @Column(name = "dtalteracao")
    private LocalDate dtAlteracao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDtFim() {
		return dtFim;
	}

	public void setDtFim(LocalDate dtFim) {
		this.dtFim = dtFim;
	}

	public StatusTarefa getStatus() {
		return status;
	}

	public void setStatus(StatusTarefa status) {
		this.status = status;
	}

	public LocalDate getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(LocalDate dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public LocalDate getDtAlteracao() {
		return dtAlteracao;
	}

	public void setDtAlteracao(LocalDate dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

	
	}


   
    


