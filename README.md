# ☕ Atividades em Java

Este repositório reúne exercícios e pequenos projetos desenvolvidos em Java durante minha graduação em **Sistemas da Informação**. O objetivo é aplicar os conhecimentos adquiridos nas disciplinas de programação, com foco em boas práticas, lógica e organização de código.

---

## 🎯 Objetivos do Repositório

Praticar os principais conceitos da linguagem Java, incluindo:

* Sintaxe básica
* Estruturas de decisão e repetição
* Programação orientada a objetos (POO)
* Manipulação de vetores e matrizes
* Modularização com métodos e classes

---

### 🎭 Exercício: Quantidade de Convites para Cobrir o Custo

Este programa simula um cálculo de viabilidade financeira para um espetáculo. O usuário informa:

* 💰 O custo total de produção
* 🎟️ O valor de cada ingresso

Com base nesses dados, o sistema calcula:

* A **quantidade mínima de ingressos** necessária para **cobrir o custo de produção**
* A **quantidade de ingressos** necessária para obter um **lucro de 23%**

📌 **Destaque técnico:**
Utiliza `Math.ceil()` para arredondar o número de ingressos para cima, já que não é possível vender frações de ingresso.

---

### 🧮 Projeto: Operações com Vetores

Este projeto apresenta um menu interativo com múltiplas operações sobre vetores de inteiros, possibilitando:

* Inicializar um vetor com números aleatórios
* Imprimir o vetor
* Verificar se um número está presente
* Buscar o maior valor
* Calcular a média dos números pares
* Calcular o percentual de números ímpares
* Calcular a média centralizada (ignorando o menor e o maior valor)
* Verificar se há dois números cuja soma seja igual a um valor informado

🧠 **Objetivo do exercício:**
Praticar a manipulação de vetores e o uso de estruturas como `for`, `switch`, métodos e entradas com `Scanner`.

🔍 **Destaques técnicos:**

* Uso da classe `Random` para geração de números aleatórios
* Organização do código em métodos para melhor reutilização e legibilidade
* Validações para garantir que o vetor esteja inicializado antes das operações

---

### ⏰ Projeto: Relógio Digital

Este programa simula o funcionamento de um relógio digital no formato 24 horas, permitindo acompanhar o avanço do tempo segundo a segundo. Ele conta com:

* ⏱️ Atributos para **hora**, **minuto** e **segundo**
* ⛔ Validações nos `setters` para impedir valores fora do intervalo permitido
* 🔄 Método `tick()` que incrementa corretamente o tempo, respeitando os limites de cada unidade (ex.: 23:59:59 → 00:00:00)
* 🖨️ Método `getHorario()` que exibe o horário formatado com zeros à esquerda

🧠 **Objetivo do exercício:**
Praticar manipulação de tempo, uso de condicionais encadeadas, validação de dados e formatação de saída com `String.format`.

🔍 **Destaques técnicos:**

* Validação de faixas numéricas diretamente nos métodos `set`
* Simulação de passagem de tempo com `tick()` e `Thread.sleep()` no `main`
* Organização de código utilizando encapsulamento e boas práticas de POO

---

### 💰 Projeto: Cofre de Moedas

Este projeto simula um **Cofre de Moedas**, que permite adicionar diferentes tipos de moedas e calcular o valor total armazenado.

O sistema possui as seguintes funcionalidades:

* ✅ Cadastro de diferentes moedas, cada uma com valor e nome
* ✅ Cálculo do **total de dinheiro** armazenado no cofre
* ✅ Contagem de quantas vezes uma moeda específica foi adicionada ao cofre

🧠 **Objetivo do exercício:**
Praticar conceitos de **Programação Orientada a Objetos**, incluindo a criação de classes, encapsulamento e uso de listas (`ArrayList`).

🔍 **Destaques técnicos:**

* Implementação do método `equals()` na classe `Moeda` para comparação de objetos
* Uso de `ArrayList` para armazenar dinamicamente as moedas
* Método `contaMoedas()` que verifica e contabiliza a quantidade de uma moeda específica
* Estrutura modularizada com as classes `Moeda` e `Cofre`, além de uma `main` para teste

📌 **Observação:**
Este projeto segue uma estrutura similar a outra atividade que foi realizada anteriormente, demonstrando consolidação do aprendizado em **modelagem de classes** e **operações com listas**.

---

### 🧾 Projeto: Sistema de Folha de Pagamento

Este projeto consiste na implementação de um **Sistema de Folha de Pagamento** utilizando conceitos de herança e polimorfismo.

O sistema permite:

* ✅ Cadastro de funcionários com salário fixo
* ✅ Cadastro de funcionários comissionados
* ✅ Cadastro de funcionários por produtividade
* ✅ Cálculo automático dos proventos para cada tipo de funcionário
* ✅ Exibição organizada dos proventos de cada colaborador

👥 **Funcionários cadastrados no teste:**

* **Kauã** – Funcionário com salário fixo
* **Renata** – Funcionária comissionada
* **Maluu** – Funcionária por produtividade

🧠 **Objetivo do exercício:**
Praticar conceitos avançados de **Programação Orientada a Objetos**, incluindo herança, polimorfismo e sobrescrita de métodos.

🔍 **Destaques técnicos:**

* Uso de **superclasse** (`Funcionario`) e **subclasses** (`FuncionarioComissionado`, `FuncionarioProdutividade`)
* Sobrescrita do método `calculaProventos()` conforme a regra de cada tipo de funcionário
* Separação entre classes de domínio e a **classe de teste** (`TestaFolhaPagamento`) para organização do código
* Estrutura modularizada para fácil expansão do sistema

---

✏️ Mais atividades serão adicionadas conforme avanço nos estudos.
Fique à vontade para explorar e acompanhar meu progresso!

---
