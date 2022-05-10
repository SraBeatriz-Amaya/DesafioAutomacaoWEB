$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CadastrarLoginUsuario.feature");
formatter.feature({
  "name": "Cadastrar e logar Usuario",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@CadastroLoginUsuario"
    }
  ]
});
formatter.scenario({
  "name": "cadastrar e logar usuario",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@CadastroLoginUsuario"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar o botao registrar",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastroUsuarioSteps.euAcionarOBotaoRegistrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o campo email \"testeStefanini.teste@outlook.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuarioSteps.informarOCampoEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o campo nome \"Stefanini Teste\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuarioSteps.informarOCampoNome(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o campo senha \"Teste123456\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuarioSteps.informarOCampoSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar no campo confirmacao senha \"Teste123456\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuarioSteps.informarNoCampoConfirmacaoSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o botao conta saldo",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuarioSteps.acionarOBotaoContaSaldo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao cadastrar",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuarioSteps.clicarNoBotaoCadastrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu visualizo um modal apresentando cadastrado com sucesso",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuarioSteps.euVisualizoUmModalApresentandoCadastradoComSucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o botao fechar",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuarioSteps.acionarOBotaoFechar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o campo email \"testeStefanini.teste@outlook.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginUsuarioSteps.informoOCampoEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo senha \"Teste123456\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginUsuarioSteps.preenchoOCampoSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao acessar",
  "keyword": "E "
});
formatter.match({
  "location": "LoginUsuarioSteps.clicarNoBotaoAcessar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta \"Olá Stefanini Teste\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginUsuarioSteps.oSistemaApresenta(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Extrato.feature");
formatter.feature({
  "name": "Visualizar extrato",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Extrato"
    }
  ]
});
formatter.background({
  "name": "Dado que eu estou logado na plataforma",
  "description": "",
  "keyword": "Contexto"
});
formatter.scenario({
  "name": "visualizar extrato",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Extrato"
    }
  ]
});
formatter.step({
  "name": "eu acionar o botao extrato",
  "keyword": "Quando "
});
formatter.match({
  "location": "ExtratoSteps.euAcionarOBotaoExtrato()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu visualizo saldo disponivel",
  "keyword": "E "
});
formatter.match({
  "location": "ExtratoSteps.euVisualizoSaldoDisponivel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu visualizo a data de abertura",
  "keyword": "E "
});
formatter.match({
  "location": "ExtratoSteps.euVisualizoADataDeAbertura()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar botao voltar",
  "keyword": "E "
});
formatter.match({
  "location": "ExtratoSteps.euAcionarBotaoVoltar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo a tela principal",
  "keyword": "Entao "
});
formatter.match({
  "location": "ExtratoSteps.visualizoATelaPrincipal()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Pagamento.feature");
formatter.feature({
  "name": "Visualizar pagamento",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Pagamento"
    }
  ]
});
formatter.background({
  "name": "Dado que eu estou logado na plataforma",
  "description": "",
  "keyword": "Contexto"
});
formatter.scenario({
  "name": "visualizar pagamento",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Pagamento"
    }
  ]
});
formatter.step({
  "name": "eu acionar o botao pagamento",
  "keyword": "Quando "
});
formatter.match({
  "location": "PagamentoSteps.euAcionarOBotaoPagamento()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu visualizar Funcionalidade em desenvolvimento",
  "keyword": "E "
});
formatter.match({
  "location": "PagamentoSteps.euVisualizarFuncionalidadeEmDesenvolvimento()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clicar no botao fechar",
  "keyword": "E "
});
formatter.match({
  "location": "PagamentoSteps.euClicarNoBotaoFechar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo a pagina inicial",
  "keyword": "Entao "
});
formatter.match({
  "location": "PagamentoSteps.visualizoAPaginaInicial()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Saque.feature");
formatter.feature({
  "name": "Visualizar saque",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Saque"
    }
  ]
});
formatter.background({
  "name": "Dado que eu estou logado na plataforma",
  "description": "",
  "keyword": "Contexto"
});
formatter.scenario({
  "name": "visualizar saque",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Saque"
    }
  ]
});
formatter.step({
  "name": "eu acionar o botao saque",
  "keyword": "Quando "
});
formatter.match({
  "location": "SaqueSteps.euAcionarOBotaoSaque()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu visualizo Funcionalidade em desenvolvimento",
  "keyword": "E "
});
formatter.match({
  "location": "SaqueSteps.euVisualizoFuncionalidadeEmDesenvolvimento()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar botao fechar",
  "keyword": "E "
});
formatter.match({
  "location": "SaqueSteps.euAcionarBotaoFechar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo a tela inicial",
  "keyword": "Entao "
});
formatter.match({
  "location": "SaqueSteps.visualizoATelaInicial()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Transferencia.feature");
formatter.feature({
  "name": "Transferencia",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.background({
  "name": "Dado que eu estou logado na plataforma",
  "description": "",
  "keyword": "Contexto"
});
formatter.scenario({
  "name": "tranferencia invalida",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@TransferenciaInvalida"
    }
  ]
});
formatter.step({
  "name": "eu acionar o botao tranferencia",
  "keyword": "Quando "
});
formatter.match({
  "location": "TransferenciaInvalidaSteps.euAcionarOBotaoTranferencia()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu informar o numero da conta \"654\"",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaInvalidaSteps.euInformarONumeroDaConta(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu informar o digito da conta \"4\"",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaInvalidaSteps.euInformarODigitoDaConta(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu informar o valor da tranferencia \"100\"",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaInvalidaSteps.euInformarOValorDaTranferencia(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu informar a descricao \"Conta de Luz\"",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaInvalidaSteps.euInformarADescricao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar o botao transferir agora",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaInvalidaSteps.euAcionarOBotaoTransferirAgora()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu visualizo um modal apresentando Conta inválida ou inexistente",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaInvalidaSteps.euVisualizoUmModalApresentandoContaInválidaOuInexistente()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pressiono o botao fechar",
  "keyword": "Entao "
});
formatter.match({
  "location": "TransferenciaInvalidaSteps.pressionoOBotaoFechar()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Dado que eu estou logado na plataforma",
  "description": "",
  "keyword": "Contexto"
});
formatter.scenario({
  "name": "tranferencia sucesso",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@TransferenciaSucesso"
    }
  ]
});
formatter.step({
  "name": "eu pressionar o botao tranferencia",
  "keyword": "Quando "
});
formatter.match({
  "location": "TransferenciaSucessoSteps.euPressionarOBotaoTranferencia()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencher o valor da tranferencia \"200\"",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSucessoSteps.euPreencherOValorDaTranferencia(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencher a descricao \"Conta de Telefone\"",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSucessoSteps.euPreencherADescricao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu pressionar o botao transferir agora",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSucessoSteps.euPressionarOBotaoTransferirAgora()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu visualizo um modal apresentando Transferencia realizada com sucesso",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSucessoSteps.euVisualizoUmModalApresentandoTransferenciaRealizadaComSucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu pressionar o botao fechar",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSucessoSteps.euPressionarOBotaoFechar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu pressionar o botao sair",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSucessoSteps.euPressionarOBotaoSair()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta a tela de login",
  "keyword": "Entao "
});
formatter.match({
  "location": "TransferenciaSucessoSteps.oSistemaApresentaATelaDeLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", null);
formatter.after({
  "status": "passed"
});
});