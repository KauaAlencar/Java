# ☕ Atividades em Java

Este repositório reúne exercícios e pequenos projetos desenvolvidos em Java durante minha graduação em **Sistemas da Informação**. O objetivo é aplicar os conhecimentos adquiridos nas disciplinas de programação, com foco em boas práticas, lógica e organização de código.

---

## 🎯 Objetivos do Repositório

Praticar os principais conceitos da linguagem Java, incluindo:

- Sintaxe básica
- Estruturas de decisão e repetição
- Programação orientada a objetos (POO)
- Manipulação de vetores e matrizes
- Modularização com métodos e classes

---

### 🎭 Exercício: Quantidade de Convites para Cobrir o Custo

Este programa simula um cálculo de viabilidade financeira para um espetáculo. O usuário informa:

- 💰 O custo total de produção  
- 🎟️ O valor de cada ingresso  

Com base nesses dados, o sistema calcula:

- A **quantidade mínima de ingressos** necessária para **cobrir o custo de produção**
- A **quantidade de ingressos** necessária para obter um **lucro de 23%**

📌 **Destaque técnico:**  
Utiliza `Math.ceil()` para arredondar o número de ingressos para cima, já que não é possível vender frações de ingresso.

---

### 🧮 Projeto: Operações com Vetores

Este projeto apresenta um menu interativo com múltiplas operações sobre vetores de inteiros, possibilitando:

- Inicializar um vetor com números aleatórios
- Imprimir o vetor
- Verificar se um número está presente
- Buscar o maior valor
- Calcular a média dos números pares
- Calcular o percentual de números ímpares
- Calcular a média centralizada (ignorando o menor e o maior valor)
- Verificar se há dois números cuja soma seja igual a um valor informado

🧠 **Objetivo do exercício:**  
Praticar a manipulação de vetores e o uso de estruturas como `for`, `switch`, métodos e entradas com `Scanner`.

🔍 **Destaques técnicos:**
- Uso da classe `Random` para geração de números aleatórios
- Organização do código em métodos para melhor reutilização e legibilidade
- Validações para garantir que o vetor esteja inicializado antes das operações

---
Aqui está o seu README atualizado com a nova atividade “Relógio Digital” adicionada no mesmo estilo das anteriores:

---

### ⏰ Projeto: Relógio Digital

Este programa simula o funcionamento de um relógio digital no formato 24 horas, permitindo acompanhar o avanço do tempo segundo a segundo. Ele conta com:

- ⏱️ Atributos para **hora**, **minuto** e **segundo**
- ⛔ Validações nos `setters` para impedir valores fora do intervalo permitido
- 🔄 Método `tick()` que incrementa corretamente o tempo, respeitando os limites de cada unidade (ex.: 23:59:59 → 00:00:00)
- 🖨️ Método `getHorario()` que exibe o horário formatado com zeros à esquerda

🧠 **Objetivo do exercício:**  
Praticar manipulação de tempo, uso de condicionais encadeadas, validação de dados e formatação de saída com `String.format`.

🔍 **Destaques técnicos:**
- Validação de faixas numéricas diretamente nos métodos `set`
- Simulação de passagem de tempo com `tick()` e `Thread.sleep()` no `main`
- Organização de código utilizando encapsulamento e boas práticas de POO

---

✏️ Mais atividades serão adicionadas conforme avanço nos estudos.  
Fique à vontade para explorar e acompanhar meu progresso!
