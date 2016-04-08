package it.polito.tdp.modelli;

public class Parola {
	private String parola;
	private boolean esiste;
	public Parola(String parola, boolean esiste) {
		this.parola = parola;
		this.esiste = esiste;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((parola == null) ? 0 : parola.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parola other = (Parola) obj;
		if (parola == null) {
			if (other.parola != null)
				return false;
		} else if (!parola.equals(other.parola))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return this.parola+" "+this.esiste;
	}
	
	
}
