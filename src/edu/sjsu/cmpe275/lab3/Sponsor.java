package edu.sjsu.cmpe275.lab3;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SPONSOR")
public class Sponsor {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SPONSOR_ID")
	private long id;
	@Column(name="SPONSOR_NAME")
    private String name;
	@Column(name="SPONSOR_DESC")
    private String description;
    @Embedded
    @Column(name="SPONSOR_ADDR")
    private Address address;
    
    //Defining one to many Relationship
   /* @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="PLAYER_ID")
    private Collection<Player> players = new ArrayList<Player>();
    
	public Collection<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Collection<Player> players) {
		this.players = players;
	}*/
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
