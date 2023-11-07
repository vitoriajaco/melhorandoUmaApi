package br.com.alura.adopet.api.dto;

//Records oferece uma uma sintaxe compacta para declarar classes que
// são portadores transparentes para dados imutáveis superficiais visando reduzir significamente o detalhamento dessas classes
// e irá melhorar a capacidade de leitura e manutenção do código

public record SolicitacaoAdocaoDto (Long idPet, Long idTutor, String motivo){
}
