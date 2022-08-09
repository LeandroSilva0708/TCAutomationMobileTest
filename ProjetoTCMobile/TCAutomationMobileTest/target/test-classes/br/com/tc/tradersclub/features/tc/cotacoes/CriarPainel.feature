#language: pt

Funcionalidade: Criar painel

  @Android
  Cenario: Criar Painel
    Dado que o usuario esta na tela incial do aplicativo TC
    Quando realiza o login
    E acessa o Produto “Cotações”
    Quando clica em “Criar Painel”
    E insere o nome do Painel “Teste” e clica em “Criar”
    Então verifica que o título do Painel criado é o mesmo do nome anteriormente inserido
    E lhe será apresentada, no painel, a mensagem “Nenhum ativo adicionado no seu painel”
