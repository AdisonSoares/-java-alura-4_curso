package med.voll.api.domain.consulta.validacoes;

import java.time.Duration;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsultaDTO;


@Component
public class ValidadorHorarioDeAntecedencia implements ValidadorAgendamentoDeConsulta{
	public void validar(DadosAgendamentoConsultaDTO dados) {
		var dataConsulta = dados.data();
		var agora = LocalDateTime.now();
		var diferencaEmMinutos = Duration.between(agora, dataConsulta).toMinutes();
		
		if(diferencaEmMinutos < 30) {
			throw new ValidacaoException("Agendamento deve ter antecedência de 30 minutos!");
			
		}
	}
}
