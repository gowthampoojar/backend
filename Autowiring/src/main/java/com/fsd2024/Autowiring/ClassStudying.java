package com.fsd2024.Autowiring;

import org.springframework.stereotype.Component;

@Component
public class ClassStudying {
	private int sem;
	private String branch;
	
public ClassStudying () {}

public ClassStudying(int sem, String branch) {
	super();
	this.sem = sem;
	this.branch = branch;
}

public int getSem() {
	return sem;
}

public void setSem(int sem) {
	this.sem = sem;
}

public String getBranch() {
	return branch;
}

public void setBranch(String branch) {
	this.branch = branch;
}

@Override
public String toString() {

	return ("{\n\"Semester\":"+sem+",\n\"Branch\":\""+branch+"\"\n}");

}


}

