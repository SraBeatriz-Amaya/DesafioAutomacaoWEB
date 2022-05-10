#language: pt
#enconding: UTF-8


Funcionalidade: Transferencia 

Contexto: Dado que eu estou logado na plataforma

@TransferenciaInvalida
Cenario: tranferencia invalida
Quando eu acionar o botao tranferencia
E eu informar o numero da conta "654"
E eu informar o digito da conta "4"
E eu informar o valor da tranferencia "100"
E eu informar a descricao "Conta de Luz"
E eu acionar o botao transferir agora
E eu visualizo um modal apresentando Conta inválida ou inexistente
Entao pressiono o botao fechar

@TransferenciaSucesso
Cenario: tranferencia sucesso
Quando eu pressionar o botao tranferencia
E eu preencher o valor da tranferencia "200"
E eu preencher a descricao "Conta de Telefone"
E eu pressionar o botao transferir agora
E eu visualizo um modal apresentando Transferencia realizada com sucesso
E eu pressionar o botao fechar
E eu pressionar o botao sair 
Entao o sistema apresenta a tela de login
