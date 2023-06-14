package med.voll.api.domain.consulta.validacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosAgendamentoConsultaDTO;


@Component
public class ValidadorMedicoComOutraConsultaNoMesmoHorario implements ValidadorAgendamentoDeConsulta{
	
	@Autowired
	private ConsultaRepository repository;
	
	public void validar(DadosAgendamentoConsultaDTO dados) {
		var medicoPossuiOutraConsultaNoMesmoHorario = repository.existsByMedicoIdAndData(dados.idMedico(), dados.data());
		if(medicoPossuiOutraConsultaNoMesmoHorario) {
			throw new ValidacaoException("Médico possui outra consulta agendada para esse horário!");
		}
	}
}
