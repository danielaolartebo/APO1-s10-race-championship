package model;
public enum Team {
        FERRARI("Ferrari"),
        MCLAREN("Maclaren"),
        REDBULL("Redbull"),
        MERCEDES("Mercedes"),
        RACINGPOINT("Racingpoint"),
        ALFAROMEO("Alfaromeo"),
        RENAULT("Renault"),
        WILLIAMS("Williams");

        private String teams;
        private Team (String raceTeams){
        this.teams = raceTeams;
        } 
}
