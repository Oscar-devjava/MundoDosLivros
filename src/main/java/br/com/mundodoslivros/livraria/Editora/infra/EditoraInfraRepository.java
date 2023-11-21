package br.com.mundodoslivros.livraria.Editora.infra;

import br.com.mundodoslivros.livraria.Editora.application.repository.EditoraRepository;
import br.com.mundodoslivros.livraria.Editora.domain.Editora;
import br.com.mundodoslivros.livraria.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class EditoraInfraRepository implements EditoraRepository {

    private final EditoraSpringDataJPARepository jpaRepositoryEditora;

    @Override
    public Editora salva(Editora editora) {
        log.info("[inicia] EditoraInfraRepository - salva ");
        try {
            jpaRepositoryEditora.save(editora);
        }catch (DataIntegrityViolationException e){
            throw APIException.build(HttpStatus.BAD_REQUEST,"Editora já cadastrada", e);
        }
        log.info("[finaliza] EditoraInfraRepository - salva ");
        return editora;
    }

    @Override
    public Editora buscaEditoraPorId(Long codEditora) {
        log.info("[inicia] EditoraInfraRepository - buscaEditoraPorId ");
        var busca =  jpaRepositoryEditora.findById(codEditora).orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND,"Editora não encontrada"
        + ", Insira um codigo de Editora valido ou infrorme o problema ao administrador"));
        log.info("[finaliza] EditoraInfraRepository - buscaEditoraPorId ");
        return busca;
    }

    @Override
    public List<Editora> buscaTodasEditoras() {
        log.info("[inicia] EditoraInfraRepository -buscaTodasEditoras ");
        var buscaTodas = jpaRepositoryEditora.findAll();
        log.info("[finaliza] EditoraInfraRepository -buscaTodasEditoras ");
        return buscaTodas;
    }
}
