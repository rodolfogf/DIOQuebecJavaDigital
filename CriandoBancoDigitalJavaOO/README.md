# Criando um Banco Digital com Java e Orientação a Objetos

## Projeto feito a partir da estrutura disponibilizada no desafio:

Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário:
“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

A implementação realizada consistiu na alteração de alguns atributos, implementação de uma classe chamada RegistroOperacao, na modificação dos métodos de saque, depósito e transferência, na modificação das respectivas sobrecargas do método imprimirExtrato das classes "ContaCorrente" e "ContaPoupanca", dentre outras. 

### Classe RegistroOperacao
Esta classe foi criada para registrar cada operação feita, seu valor e as conta envolvidas quando este for o caso, para que tais operações fosse exibidas no extrato. Além disso, também serve para auxiliar no cálculo do rendimento da poupança, uma vez que a depender do tempo em que o valor foi adicionado na conta, fará ou não parte do cálculo de rendimentos.
A princípio seria um método da classe "Conta" apenas. Porém, percebeu-se que sendo um classe, suas funções seriam desempenhadas da melhor forma no contexto do desafio.

*This class was created to register each operation performed, its value and the account involved when this is the case, so that such operations could be displayed in the statement. In addition, it also serves to assist in the calculation of the savings income, since depending on the time in which the value was added to the account, it will or will not be part of the income calculation.*
*At first it would be a method of the Conta ("Account") class only. However, it was noticed that being a class, its functions would be performed in the best way in the given context.*

### Método aplicarRendimento da classe ContaPoupanca
Método criado para calcular os rendimentos e alterar o saldo da conta poupança.

*Method created to calculate income and change the balance of the savings account.*
