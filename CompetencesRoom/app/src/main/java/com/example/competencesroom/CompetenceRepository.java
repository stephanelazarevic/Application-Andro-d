package com.example.competencesroom;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class CompetenceRepository {
    private CompetenceDao maCompetenceDao ;
    private LiveData<List<Competence>> mesCompetences ;

    CompetenceRepository(Application application){
        CompetenceRoomDatabase database = CompetenceRoomDatabase.getDatabase(application);
        maCompetenceDao = database.competenceDao();
        mesCompetences = maCompetenceDao.getToutesCompetences();
    }
    LiveData<List<Competence>> getMesCompetences(){
        return mesCompetences;
    }


    /**
     * Insere une nouvelle Competence passe en parametre par le ViewModel
     * Lance une tache asynchrome en background qqui fait l'insertion en utulisant la DAO
     * Pas de retour
     * @param uneCompetence
     */

    public void insert (Competence uneCompetence){
        CompetenceRoomDatabase.databaseWriteExecutor.execute(()->{
            maCompetenceDao.insert(uneCompetence);
        });
    }

    public void remove (Competence uneCompetence){
        CompetenceRoomDatabase.databaseWriteExecutor.execute(()->{
            maCompetenceDao.deleteCompetence(uneCompetence);
        });
    }

    public void removeall(){
        CompetenceRoomDatabase.databaseWriteExecutor.execute(()->{
            maCompetenceDao.deleteAll();
        });
    }
    public void updateCompetence(Competence uneCompetence){
        CompetenceRoomDatabase.databaseWriteExecutor.execute(()->{
            maCompetenceDao.updateCompetence(uneCompetence);
        });
    }

    
}
