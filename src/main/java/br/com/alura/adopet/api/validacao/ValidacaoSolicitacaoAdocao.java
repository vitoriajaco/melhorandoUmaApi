package br.com.alura.adopet.api.validacao;

import br.com.alura.adopet.api.dto.SolicitacaoAdocaoDto;
import br.com.alura.adopet.api.model.StatusAdocao;

public interface ValidacaoSolicitacaoAdocao {

    void validar (SolicitacaoAdocaoDto dto);

}
