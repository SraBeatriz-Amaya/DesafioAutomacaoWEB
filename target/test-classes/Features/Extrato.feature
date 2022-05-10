#language: pt
#enconding: UTF-8

@Extrato
Funcionalidade: Visualizar extrato 

Contexto: Dado que eu estou logado na plataforma

Cenario: visualizar extrato
Quando eu acionar o botao extrato
E eu visualizo saldo disponivel
E eu visualizo a data de abertura 
E eu acionar botao voltar
Entao visualizo a tela principal
