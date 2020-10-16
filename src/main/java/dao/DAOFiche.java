package dao;

import java.util.List;

import dao.generic.AbstractJpaDao;
import domain.Carte;
import domain.Fiche;
import domain.Tag;
import domain.Utilisateur;

public class DAOFiche extends AbstractJpaDao<Long, Fiche>{

    public DAOFiche(){
        this.setClazz(Fiche.class);
    }
    
    public void addUtilisateur(Fiche fiche, Utilisateur utilisateur){
        fiche.setUtilisateur(utilisateur);
    }
    
    public void addTag(Fiche fiche, List<Tag> tags){
        fiche.setTags(tags);
    }
    
    public void addCarte(Fiche fiche, Carte carte){
        fiche.setCarte(carte);;
    }    
}
