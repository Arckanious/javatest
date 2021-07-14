package main;

public class Person {
	private int age;
	private String name;
	
	Person(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	String andar(Directions direcao) {
		return Directions.toString(direcao);
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int idade) {
		this.age = idade;
	}
	public String getName() {
		return name;
	}
	public void setName(String nome) {
		this.name = nome;
	}
}
