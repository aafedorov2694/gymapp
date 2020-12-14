package com.example.AntonFedorovGym.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ExerciseStat {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private long statId;
	
	private int reps;
	private int sets;
	private double weight;
	private String date;
	
	@ManyToOne(targetEntity = Exercise.class)
	@JoinColumn(name = "exId", referencedColumnName = "exId")
	private Exercise exercise;

	public ExerciseStat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExerciseStat(long statId, int reps, int sets, double weight, String date, Exercise exercise) {
		super();
		this.statId = statId;
		this.reps = reps;
		this.sets = sets;
		this.weight = weight;
		this.date = date;
		this.exercise = exercise;
	}

	public long getStatId() {
		return statId;
	}

	public void setStatId(long statId) {
		this.statId = statId;
	}

	public int getReps() {
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

	public int getSets() {
		return sets;
	}

	public void setSets(int sets) {
		this.sets = sets;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Exercise getExercise() {
		return exercise;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}

	@Override
	public String toString() {
		return "ExerciseStat [statId=" + statId + ", reps=" + reps + ", sets=" + sets + ", weight=" + weight + ", date="
				+ date + ", exercise=" + exercise + "]";
	}
	
	

}
