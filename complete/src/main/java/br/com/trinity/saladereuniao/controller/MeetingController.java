package br.com.trinity.saladereuniao.controller;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.trinity.saladereuniao.domain.Meeting;
import br.com.trinity.saladereuniao.domain.Team;
import br.com.trinity.saladereuniao.util.LocalDateUtil;

@RestController
public class MeetingController {

	@RequestMapping("/meetings")
	public List<Meeting> meetings(@RequestParam(value = "name", defaultValue = "World") String name) {

		List<Meeting> agendas = new ArrayList<>();

		Team timeFv = new Team("team_1", "Força de Vendas");
		Team timeFedex = new Team("team_2", "Fedex");
		Team timeCustomApps = new Team("team_3", "Custom Apps");

		Meeting agenda1 = new Meeting("meeting_1", timeFv, "Reunião Ondunorte",
				"Análise das integrações com o progress, pois estamos com sérios problemas de integração.",
				LocalDateUtil.getLocalDateTime(2017, Month.JUNE, 14, 10, 00),
				LocalDateUtil.getLocalDateTime(2017, Month.JUNE, 14, 11, 00));
		agendas.add(agenda1);

		Meeting agenda2 = new Meeting("meeting_2", timeFedex, "Reunião MP",
				"Definição técnica para melhoria de performance nos servidores de QA e Produção.",
				LocalDateUtil.getLocalDateTime(2017, Month.JUNE, 14, 11, 00),
				LocalDateUtil.getLocalDateTime(2017, Month.JUNE, 14, 12, 00));
		agendas.add(agenda2);

		Meeting agenda3 = new Meeting("meeting_3", timeCustomApps, "Reunião AES",
				"Realizar call com Manoel sobre o problema da responsividade nos Tablets e Ipad.",
				LocalDateUtil.getLocalDateTime(2017, Month.JUNE, 14, 14, 00),
				LocalDateUtil.getLocalDateTime(2017, Month.JUNE, 14, 18, 00));
		agendas.add(agenda3);

		return agendas;
	}

}
