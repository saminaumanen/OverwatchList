package fi.haagahelia.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String map;
    private String score;

    public Character() {
    }

    public Character(String firstName, String map, String score) {
        this.firstName = firstName;
        this.map = map;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getmap() {
        return map;
    }

    public void setmap(String map) {
        this.map = map;
    }

    public String getscore() {
        return score;
    }

    public void setscore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Character [firstName=" + firstName + ", map=" + map + ", score=" + score + "]";
    }


}