package com.driver;

public class Voter {
    private int voterId;
    private String voterName;
    private boolean hasVoted;

    public Voter(int voterId, String voterName) {
        this.voterId = voterId;
        this.voterName = voterName;
        this.hasVoted = false;
    }

    public int getVoterId() {
        return voterId;
    }

    public String getVoterName() {
        return voterName;
    }

    public boolean hasVoted() {
        return hasVoted;
    }

    public void setHasVoted(boolean hasVoted) {
        this.hasVoted = hasVoted;
    }
}
