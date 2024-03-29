package cts.prototype;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements IReteta{
	private String nume;
	private Map<String, Float> solutii = new HashMap<String, Float>();
	private float gramaj;
	
	private Reteta() {
		this.nume = "n/a";
		this.gramaj = 0;
		this.solutii = null;
	}


	public Reteta(String nume, Map<String, Float> solutii, float gramaj) {
		super();
		this.nume = nume;
		this.solutii = solutii;
		float sum = 0;
		for (float gramajSolutie : solutii.values()) {
			sum+=gramajSolutie;
		}
		if(sum == gramaj)
		{
			this.gramaj = gramaj;
		}else {
			throw new IllegalArgumentException();
		}
	}
	

	public void setNume(String nume) {
		this.nume = nume;
	}


	public void setSolutii(Map<String, Float> solutii) {
		this.solutii = new HashMap<String, Float>();
		for (String key : solutii.keySet()) {
			this.solutii.put(key,solutii.get(key));
		}
	}


	public void setGramaj(float gramaj) {
		this.gramaj = gramaj;
	}
	


	@Override
	public String toString() {
		return "Reteta [nume=" + nume + ", solutii=" + solutii + ", gramaj=" + gramaj + "]";
	}


	@Override
	public IReteta copiaza() {
		Reteta retetaNoua = new Reteta();
		retetaNoua.setGramaj(gramaj);
		retetaNoua.setNume(nume);
		retetaNoua.setSolutii(solutii);
		return retetaNoua;
	}
	
	
}
