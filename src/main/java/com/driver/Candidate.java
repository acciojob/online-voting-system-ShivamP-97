package com.driver;

public class Candidate {
    private int candidateId;
    private String candidateName;
    private int votesReceived;

    public Candidate(int candidateId, String candidateName) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.votesReceived = 0;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getVotesReceived() {
        return votesReceived;
    }

    public void addVote() {
        votesReceived++;
    }
}
