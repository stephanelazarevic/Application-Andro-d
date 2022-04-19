package com.example.competencesroom;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao

public interface CompetenceDao {
    @Insert
    void insert(Competence competence);

    @Query("DELETE FROM competence_table")
    void deleteAll();

    @Query("SELECT * from competence_table ORDER BY nomCompetence ASC")
    LiveData<List<Competence>> getToutesCompetences();

    @Delete
    void deleteCompetence(Competence competence);

    @Update
    void updateCompetence(Competence competence);
}
