package br.com.alura.adopet.api.dto;

//Records oferece uma uma sintaxe compacta para declarar classes que
// são portadores transparentes para dados imutáveis superficiais visando reduzir significamente o detalhamento dessas classes
// e irá melhorar a capacidade de leitura e manutenção do código

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SolicitacaoAdocaoDto (@NotNull Long idPet,@NotNull Long idTutor, @NotBlank String motivo){
}
