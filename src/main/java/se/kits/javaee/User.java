package se.kits.javaee;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NamedQueries({
        @NamedQuery(
                name = "findUserById",
                query = "SELECT u " +
                        "FROM User u " +
                        "WHERE u.id = :id"
        ),
        @NamedQuery(
                name = "findUserByName",
                query = "SELECT u " +
                        "FROM User u " +
                        "WHERE u.name = :name"
        )
})
@Table(name = "EE_USER")
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
