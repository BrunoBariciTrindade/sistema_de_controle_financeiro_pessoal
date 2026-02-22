package com.sistema_de_controle_financeiro_pessoal.sistema_de_controle_financeiro_pessoal.models;

public class CategoriaDespesas {
 double transporte;
 double escola;
 double alimentacao;
 double lazer;
 double iptu;
 double ipva;
 double agua;
 double contaEnergia;
 double internet;
 double contaTelefonica;
 double dispesaCarros;
 double saude;
 
 public CategoriaDespesas() {
	super();
	// TODO Auto-generated constructor stub
}
 public CategoriaDespesas(double transporte, double escola, double alimentacao, double lazer, double iptu, double ipva,
		double agua, double contaEnergia, double internet, double contaTelefonica, double dispesaCarros, double saude) {
	super();
	this.transporte = transporte;
	this.escola = escola;
	this.alimentacao = alimentacao;
	this.lazer = lazer;
	this.iptu = iptu;
	this.ipva = ipva;
	this.agua = agua;
	this.contaEnergia = contaEnergia;
	this.internet = internet;
	this.contaTelefonica = contaTelefonica;
	this.dispesaCarros = dispesaCarros;
	this.saude = saude;
}
 public double getTransporte() {
	return transporte;
}
 public void setTransporte(double transporte) {
	this.transporte = transporte;
 }
 public double getEscola() {
	return escola;
 }
 public void setEscola(double escola) {
	this.escola = escola;
 }
 public double getAlimentacao() {
	return alimentacao;
 }
 public void setAlimentacao(double alimentacao) {
	this.alimentacao = alimentacao;
 }
 public double getLazer() {
	return lazer;
 }
 public void setLazer(double lazer) {
	this.lazer = lazer;
 }
 public double getIptu() {
	return iptu;
 }
 public void setIptu(double iptu) {
	this.iptu = iptu;
 }
 public double getIpva() {
	return ipva;
 }
 public void setIpva(double ipva) {
	this.ipva = ipva;
 }
 public double getAgua() {
	return agua;
 }
 public void setAgua(double agua) {
	this.agua = agua;
 }
 public double getContaEnergia() {
	return contaEnergia;
 }
 public void setContaEnergia(double contaEnergia) {
	this.contaEnergia = contaEnergia;
 }
 public double getInternet() {
	return internet;
 }
 public void setInternet(double internet) {
	this.internet = internet;
 }
 public double getContaTelefonica() {
	return contaTelefonica;
 }
 public void setContaTelefonica(double contaTelefonica) {
	this.contaTelefonica = contaTelefonica;
 }
 public double getDispesaCarros() {
	return dispesaCarros;
 }
 public void setDispesaCarros(double dispesaCarros) {
	this.dispesaCarros = dispesaCarros;
 }
 public double getSaude() {
	return saude;
 }
 public void setSaude(double saude) {
	this.saude = saude;
 }

 
}
