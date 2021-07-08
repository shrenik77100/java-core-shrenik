package com.shrenik.example;

public class Player {
	public int playerCode;
	public String playerName;
	public int scoredRuns;
	
	public Player()
	{
		this.playerCode = -1;
		this.playerName = "#UnknownPlayerName";
		this.scoredRuns = -1;
	}

	public Player(int playerCode, String playerName, int scoredRuns) {
		super();
		this.playerCode = playerCode;
		this.playerName = playerName;
		this.scoredRuns = scoredRuns;
	}

	@Override
	public String toString() {
		return "Player [playerCode=" + playerCode + ", playerName=" + playerName + ", scoredRuns=" + scoredRuns + "]";
	}
	
	
}
