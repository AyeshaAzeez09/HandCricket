package com.example.demo;

public class PlayerInfo {

	String batsMan;
	String bowler;
	Integer gestureNoOfBatsMan;
	Integer gestureNoOfBowler;

	public PlayerInfo() {
		super();
	}

	public PlayerInfo(String batsMan, String bowler, Integer gestureNoOfBatsMan, Integer gestureNoOfBowler) {
		super();
		this.batsMan = batsMan;
		this.bowler = bowler;
		this.gestureNoOfBatsMan = gestureNoOfBatsMan;
		this.gestureNoOfBowler = gestureNoOfBowler;
	}

	public String getBatsMan() {
		return batsMan;
	}

	public void setBatsMan(String batsMan) {
		this.batsMan = batsMan;
	}

	public String getBowler() {
		return bowler;
	}

	public void setBowler(String bowler) {
		this.bowler = bowler;
	}

	public Integer getGestureNoOfBatsMan() {
		return gestureNoOfBatsMan;
	}

	public void setGestureNoOfBatsMan(Integer gestureNoOfBatsMan) {
		this.gestureNoOfBatsMan = gestureNoOfBatsMan;
	}

	public Integer getGestureNoOfBowler() {
		return gestureNoOfBowler;
	}

	public void setGestureNoOfBowler(Integer gestureNoOfBowler) {
		this.gestureNoOfBowler = gestureNoOfBowler;
	}

	
	
	

}
