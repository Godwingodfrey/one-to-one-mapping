package io.datajek.databaserelationships.onetoone;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class PlayerProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String twitter;

    @OneToOne(mappedBy = "playerProfile", cascade = CascadeType.ALL)
    @JsonBackReference
    Player player;

//    public PlayerProfile() {
//    }
//
//    public PlayerProfile(int id, String twitter) {
//        this.id = id;
//        this.twitter = twitter;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getTwitter() {
//        return twitter;
//    }
//
//    public void setTwitter(String twitter) {
//        this.twitter = twitter;
//    }
//
//    @Override
//    public String toString() {
//        return "PlayerProfile{" +
//                "id=" + id +
//                ", twitter='" + twitter + '\'' +
//                '}';
//    }
}
