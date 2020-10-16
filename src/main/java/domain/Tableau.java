package domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tableau implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = -2674205489634381793L;
    
    private Long id;
    private List<Section> sections;

    /**
     * 
     */
    public Tableau() {
        super();
    }

    /**
     * @return the id
     */
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the sections
     */
    @OneToMany(mappedBy = "tableau")
    public List<Section> getSections() {
        return sections;
    }

    /**
     * @param sections the sections to set
     */
    public void setSections(List<Section> sections) {
        this.sections = sections;
    }
    
    /**
     * @param sections the sections default to set
     */
    public void setDefaultSections() {
        Section attente = new Section("en attente");
        Section enCours = new Section("en Cours");
        Section realise = new Section("realise");
        this.sections = Arrays.asList(attente, enCours, realise);
    }
}
