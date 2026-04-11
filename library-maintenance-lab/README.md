# Atividade 1 – Manutenção Preventiva

## Identificação de Problemas e Classificação

1. **God Class (Classe com muitas responsabilidades)**  
   A classe `LibrarySystem` concentra muitas responsabilidades, como exibição de menu, leitura de dados, controle do fluxo e tratamento de erros, dificultando manutenção e evolução.

2. **Mixed Responsibilities (Múltiplas responsabilidades)**  
   O método `startCli()` mistura interface com o usuário, lógica do sistema e tratamento de exceções, tornando o código menos organizado.

3. **Long Method (Método muito longo)**  
   O método `LoanManager.borrowBook()` é muito extenso e realiza várias tarefas em um único bloco, prejudicando a legibilidade.

4. **Deep Nesting (Excesso de aninhamento)**  
   O método `borrowBook()` possui muitos `if` aninhados, o que dificulta a leitura e manutenção do código.

5. **Long Parameter List (Lista longa de parâmetros)**  
   O método `borrowBook()` recebe muitos parâmetros primitivos, aumentando a complexidade e o risco de erro.

6. **Validation Smell (Problema de validação)**  
   O método `BookManager.registerBook()` permite cadastrar livros com título vazio, o que não deveria ocorrer em um sistema correto.

7. **Edge Case / Missing Validation (Caso limite não tratado)**  
   No método `listBooksSimple()`, quando não há livros cadastrados, o sistema tenta acessar um item inexistente da lista, podendo gerar erro.

8. **Incorrect Logic / Bug (Erro de lógica)**  
   No método `generateSimpleReport()`, o total de empréstimos e a contagem de empréstimos fechados estavam sendo calculados de forma incorreta.

9. **Hidden Dependencies (Dependências ocultas)**  
   O uso de dados estáticos no `LegacyDatabase` faz com que o sistema dependa diretamente dele, dificultando testes e manutenção.

10. **Encapsulation Violation (Violação de encapsulamento)**  
    Os métodos do `LegacyDatabase` expõem diretamente estruturas internas mutáveis, permitindo alterações sem controle.

## Refatorações Realizadas

- **Severo Junior**  
  - Criou o método `canUserBorrow` em `LoanManager.borrowBook()` para resolver parcialmente os problemas 3 (Long Method) e 4 (Deep Nesting).  
  - Corrigiu o comportamento de empréstimo não encontrado em `LoanManager.returnBook()`, garantindo que o sistema lance exceção ao invés de retornar em silêncio.

- **Luiz Bolzani**  
  - Adicionou validação no método `BookManager.listBooksSimple()` para tratar corretamente o caso em que não há livros cadastrados.

- **Jefferson**  
  - Corrigiu a lógica do método `LegacyDatabase.countOpenLoansByBook()`, garantindo a contagem correta de empréstimos abertos por livro.

- **Zoltan**  
  - Ajustou o método `ReportGenerator.generateSimpleReport()`, corrigindo o total de empréstimos e a contagem de empréstimos fechados.

- **Bruno Laroca**  
  - Criou o método `LoanManager.listLoansByUser()`, organizando a funcionalidade de consulta de empréstimos por usuário em uma operação própria.

---

## Observação Final

O objetivo não foi reescrever o sistema inteiro do zero.  
As melhorias foram aplicadas de forma incremental, com pequenas mudanças seguras, buscando simular manutenção de software no mundo real.
