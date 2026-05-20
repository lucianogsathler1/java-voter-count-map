# Sistema de Contagem de Votos 🗳️

Este é um sistema desenvolvido em Java para consolidar a contagem de votos de uma eleição a partir de um arquivo de texto (.txt).

##  O que o programa faz?
* Solicita o caminho de um arquivo de texto que contém os registros de votos no formato: `NomeCandidato,QuantidadeVotos`.
* Lê o arquivo linha por linha de forma eficiente.
* Consolida e soma os votos de cada candidato automaticamente, garantindo que nenhum nome apareça duplicado.
* Exibe o resultado final da eleição com o total de votos de cada um.

##  Conceitos de Java Praticados
* **Estrutura de Dados `Map (HashMap)`:** Utilizada para mapear os candidatos aos seus respectivos totais de votos de forma performática.
* **`hashCode` e `equals`:** Implementados na classe `Candidate` para garantir que o `Map` identifique corretamente quando um candidato se repete, permitindo a atualização dos votos em vez de duplicar a chave.
* **Manipulação de Arquivos:** Uso de `BufferedReader` e `FileReader` com a estrutura moderna `try-with-resources` para garantir o fechamento seguro dos arquivos.

## 🛠 Como testar
1. Crie um arquivo chamado `votos.txt` no seu computador com o seguinte conteúdo de exemplo:
   ```text
   Alex Blue,15
   Anny Green,20
   Alex Blue,10