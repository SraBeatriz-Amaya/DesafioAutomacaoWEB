#language: pt
#enconding: UTF-8

@CadastroLoginUsuario
Funcionalidade: Cadastrar e logar Usuario


Cenario: cadastrar e logar usuario
Quando eu acionar o botao registrar
E informar o campo email "testeStefanini.teste@outlook.com"
E informar o campo nome "Stefanini Teste"
E informar o campo senha "Teste123456"
E informar no campo confirmacao senha "Teste123456"
E acionar o botao conta saldo
E clicar no botao cadastrar
E eu visualizo um modal apresentando cadastrado com sucesso
E acionar o botao fechar  
E informo o campo email "testeStefanini.teste@outlook.com"
E preencho o campo senha "Teste123456"
E clicar no botao acessar
Entao o sistema apresenta "Olá Stefanini Teste"