package com.example.competencesroom;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "competence_table")
public class Competence {
        @PrimaryKey
        @NonNull
        @ColumnInfo(name = "nomCompetence")

        private String nomCompetence;

        @NonNull
        @ColumnInfo(name = "ordreAffiche")
        private String ordreAffiche;

    public void setNomCompetence(@NonNull String nomCompetence) {
        this.nomCompetence = nomCompetence;
    }

    @NonNull
    public String getOrdreAffiche() {
        return ordreAffiche;
    }

    public void setOrdreAffiche(@NonNull String ordreAffiche) {
        this.ordreAffiche = ordreAffiche;
    }

    public Competence (String nomCompetence){
            this.nomCompetence = nomCompetence;
        }

        public String getNomCompetence() {
            return nomCompetence;
        }
    }

