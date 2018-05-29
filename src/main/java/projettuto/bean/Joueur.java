package projettuto.bean;
// Generated 3 mai 2018 10:02:17 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Joueur generated by hbm2java
 */
@Entity
@Table(name="joueur")
public class Joueur  implements java.io.Serializable {


     private Integer idJoueur;
     private String nom;
     private Set<RelationJoueur> relationJoueurs = new HashSet<RelationJoueur>(0);

    public Joueur() {
    }

	
    public Joueur(String nom) {
        this.nom = nom;
    }
    public Joueur(String nom, Set<RelationJoueur> relationJoueurs) {
       this.nom = nom;
       this.relationJoueurs = relationJoueurs;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID_JOUEUR", unique=true, nullable=false)
    public Integer getIdJoueur() {
        return this.idJoueur;
    }
    
    public void setIdJoueur(Integer idJoueur) {
        this.idJoueur = idJoueur;
    }

    
    @Column(name="NOM", nullable=false, length=50)
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="joueur")
    public Set<RelationJoueur> getRelationJoueurs() {
        return this.relationJoueurs;
    }
    
    public void setRelationJoueurs(Set<RelationJoueur> relationJoueurs) {
        this.relationJoueurs = relationJoueurs;
    }




}


