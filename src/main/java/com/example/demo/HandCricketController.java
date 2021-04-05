package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crickets")
public class HandCricketController {

	static Map<String, Integer> map = new HashMap<>();

	private static Map<String, Integer> incrementScore(String batsMan, Integer value) {

		if (map.containsKey(batsMan)) {
			map.put(batsMan, map.get(batsMan) + value);
		} else {
			map.put(batsMan, value);
		}

		return map;
	}

	@PostMapping
	public ResponseEntity getScore(@RequestBody PlayerInfo playerInfo) {

		Integer batsmanScore = playerInfo.getGestureNoOfBatsMan();
		Integer bowlerScore = playerInfo.getGestureNoOfBowler();

		if (batsmanScore.compareTo(bowlerScore) == 0) {
			return ResponseEntity.badRequest().body("BATSMAN IS OUT");

		}

		return ResponseEntity.ok(incrementScore(playerInfo.getBatsMan(), batsmanScore));

	}

	@GetMapping
	public String getWinner(String batsman, String bowler) {
		String result = "";

		Integer value1 = map.get(batsman);
		Integer value2 = map.get(bowler);

		if (value1.compareTo(value2) > 0) {
			result = "batsman is Winner";
		} else {
			result = "bowler is Winner";
		}

		return result;
	}

}
