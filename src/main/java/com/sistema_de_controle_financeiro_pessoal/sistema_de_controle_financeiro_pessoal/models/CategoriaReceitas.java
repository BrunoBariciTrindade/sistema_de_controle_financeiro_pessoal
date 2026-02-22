package com.sistema_de_controle_financeiro_pessoal.sistema_de_controle_financeiro_pessoal.models;

public class CategoriaReceitas {
private double  rendaClt;
private double  rendaCnpj;
private double  rendaTemporaria;
private double  rendaExtra;
private double  injecaoDeValorAleatorio;

public CategoriaReceitas() {
	super();
	// TODO Auto-generated constructor stub
}
public CategoriaReceitas(double rendaClt, double rendaCnpj, double rendaTemporaria, double rendaExtra,
		double injecaoDeValorAleatorio) {
	super();
	this.rendaClt = rendaClt;
	this.rendaCnpj = rendaCnpj;
	this.rendaTemporaria = rendaTemporaria;
	this.rendaExtra = rendaExtra;
	this.injecaoDeValorAleatorio = injecaoDeValorAleatorio;
}
public double getRendaClt() {
	return rendaClt;
}
public void setRendaClt(double rendaClt) {
	this.rendaClt = rendaClt;
}
public double getRendaCnpj() {
	return rendaCnpj;
}
public void setRendaCnpj(double rendaCnpj) {
	this.rendaCnpj = rendaCnpj;
}
public double getRendaTemporaria() {
	return rendaTemporaria;
}
public void setRendaTemporaria(double rendaTemporaria) {
	this.rendaTemporaria = rendaTemporaria;
}
public double getRendaExtra() {
	return rendaExtra;
}
public void setRendaExtra(double rendaExtra) {
	this.rendaExtra = rendaExtra;
}
public double getInjecaoDeValorAleatorio() {
	return injecaoDeValorAleatorio;
}
public void setInjecaoDeValorAleatorio(double injecaoDeValorAleatorio) {
	this.injecaoDeValorAleatorio = injecaoDeValorAleatorio;
}


}
