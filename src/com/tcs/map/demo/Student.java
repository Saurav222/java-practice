package com.tcs.map.demo;

public class Student {
	private float math;
	private float bio;
	private float physics;

	public Student(float math, float bio, float physics) {
		super();
		this.math = math;
		this.bio = bio;
		this.physics = physics;
	}

	public float getMath() {
		return math;
	}

	public void setMath(float math) {
		this.math = math;
	}

	public float getBio() {
		return bio;
	}

	public void setBio(float bio) {
		this.bio = bio;
	}

	public float getPhysics() {
		return physics;
	}

	public void setPhysics(float physics) {
		this.physics = physics;
	}

	@Override
	public String toString() {
		return "[math=" + math + ", bio=" + bio + ", physics=" + physics + "]";
	}

}
