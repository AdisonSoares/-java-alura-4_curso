package med.voll.api.domain.consulta.validacoes;

import org.springframework.stereotype.Component;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsultaDTO;
import med.voll.api.domain.paciente.PacienteRepository;


@Component
public class ValidadorPacienteAtivo implements ValidadorAgendamentoDeConsulta{

	private PacienteRepository repository;
	public void validar(DadosAgendamentoConsultaDTO dados) {
		var pacienteEstaAtivo = repository.findAtivoById(dados.idPaciente());
		if(!pacienteEstaAtivo) {
			throw new ValidacaoException("Não pode haver agendamento com paciente inativo!");

		}
	}
}
