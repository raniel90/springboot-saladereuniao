package br.com.trinity.saladereuniao.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.trinity.saladereuniao.domain.Team;

@RestController
public class TeamController {

	@RequestMapping("/teams")
	public List<Team> teams(@RequestParam(value = "name", defaultValue = "World") String name) {

		List<Team> times = new ArrayList<>();
		Team timeFv = new Team("team_1", "Força de Vendas");
		Team timeFedex = new Team("team_2", "Fedex");
		Team timeCustomApps = new Team("team_3", "Custom Apps");
		times.add(timeFv);
		times.add(timeFedex);
		times.add(timeCustomApps);

		return times;
	}
}
