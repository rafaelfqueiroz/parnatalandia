package domain;

import java.util.List;

public class Result{
	private Set betterSet;
	private List<Set> sets;

	public void setBetterSet(Set set){
		this.betterSet = set;
	}

	public void setListOfSets(List<Set> sets){
		this.sets = sets;
	}

	public Set getBetterSet(){
		return this.betterSet;
	}

	public List<Set> getListOfSets(){
		return this.sets;
	}

	public void addItemOnSetsList(Set set){
		this.sets.add(set);
	}
}