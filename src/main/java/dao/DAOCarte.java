package dao;

import dao.generic.AbstractJpaDao;
import domain.Carte;
import domain.Fiche;
import domain.Section;

public class DAOCarte extends AbstractJpaDao<Long, Carte>{

    public DAOCarte() {
        this.setClazz(Carte.class);
    }

    public void addFiche(Carte carte, Fiche fiche){
        carte.setFiche(fiche);
    }

    public void addSection(Carte carte, Section section){
        carte.setSection(section);
    }

}
