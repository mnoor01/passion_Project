package com.example.c4q.passionproject.models;

/**
 * Created by c4q on 5/6/18.
 */

public class ElectionAdministrationBody {
        private String name;
        private String electionInfoUrl;
        private String votingLocationFinderUrl;
        private Local_Jurisdiction.CorrespondenceAddress correspondenceAddress;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getElectionInfoUrl() {
            return electionInfoUrl;
        }

        public void setElectionInfoUrl(String electionInfoUrl) {
            this.electionInfoUrl = electionInfoUrl;
        }

        public String getVotingLocationFinderUrl() {
            return votingLocationFinderUrl;
        }

        public void setVotingLocationFinderUrl(String votingLocationFinderUrl) {
            this.votingLocationFinderUrl = votingLocationFinderUrl;
        }

        public Local_Jurisdiction.CorrespondenceAddress getCorrespondenceAddress() {
            return correspondenceAddress;
        }

        public void setCorrespondenceAddress(Local_Jurisdiction.CorrespondenceAddress correspondenceAddress) {
            this.correspondenceAddress = correspondenceAddress;
        }
}
