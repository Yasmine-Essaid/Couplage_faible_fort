package com.sid.presentation;

import com.sid.dao.Etudiant;

import java.util.List;

public interface EtudiantDAOInterface {

    Etudiant addEtudiant(Etudiant etudiant);
    List<Etudiant> getAllEtudiants();
    Etudiant getEtudiantById(String id);
    boolean updateEtudiant(Etudiant etudiant);

}
