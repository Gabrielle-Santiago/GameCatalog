# **GameCatalog**

## **Descrição do Projeto**
GameCatalog é o backend responsável pelo consumo da API externa **OpenCritic**, permitindo o acesso a informações de jogos, gêneros e dados complementares. O projeto é organizado de forma modular, com as seguintes rotas principais:
- `/game`: Lista todos os jogos com informações resumidas.
- `/game/{id}`: Exibe informações detalhadas de um jogo específico.
- `/genre`: Retorna os gêneros de jogos.
- `/meta/search?criteria=`: Realiza uma busca específica por um jogo, utilizando o nome como critério de pesquisa.

---

## **Funcionalidades Principais**

### **Rota: `/game`**
- **Descrição**: Retorna uma lista com todos os jogos disponíveis na API externa.
- **Informações Retornadas**:
  ```json
  [
    {
      "id": "long",
      "name": "string",
      "url": "string",
      "firstReleaseDate": "string",
      "topCriticScore": "double"
    }
  ]

### **Rota: `/game/`{id}**
- **Descrição**: Retorna informações detalhadas de um jogo específico, com base no ID informado.
- **Informações Retornadas**:
```json
{
  "id": "long",
  "name": "string",
  "url": "string",
  "percentRecommended": "double",
  "numReviews": "long",
  "numTopCriticReviews": "long",
  "medianScore": "double",
  "description": "string",
  "genres": [
    {
      "name": "string"
    }
  ],
  "platforms": [
    {
      "name": "string",
      "releaseDate": "string"
    }
  ]
}
```

### **Rota: `/genre`**
- **Descrição**: Retorna a lista de todos os gêneros de jogos.
- **Utilização no Projeto:** Esta rota é consumida para exibir os gêneros na rota /game/{id}.
- **Informações Retornadas**:
```json
[
  {
    "name": "string"
  }
]
```

### **Rota: `/meta/search?criteria=`**
- **Descrição**: Realiza uma busca por jogos com base em um critério (nome do jogo).
- **Parâmetro**:
1. **criteria:** String contendo o nome do jogo a ser pesquisado.
```json
[
  {
    "relation": "string",
    "name": "string",
    "criteria": "string"
  }
]
```

## **Estrutura do Projeto**
<p>O projeto segue uma organização modular, com as seguintes pastas:</p>

1. **DTO (Data Transfer Object)**
<p>Contém as classes responsáveis por mapear os dados recebidos da API externa para os objetos que serão utilizados internamente no sistema.</p>

2. **Service**
<p>Implementa as regras de negócio e orquestra o consumo dos dados externos.</p>
<p>Realiza chamadas à API OpenCritic e processa os dados antes de enviá-los às controllers.</p>

3. **Controller**
<p>Define os endpoints da aplicação e realiza a comunicação entre as requisições HTTP e os serviços.</p>
<p>Valida as entradas dos usuários e retorna os dados processados pelo serviço.</p>

4. **Client**
<p>Responsável pelas integrações externas, contendo as chamadas diretas à API OpenCritic.</p>
<p>Implementa métodos para acessar as informações de jogos, gêneros e critérios de pesquisa.</p>

## **Banco de dados**
<p>Abaixo possui uma imagem de como o banco de dados deveria ser organizado, utilizado como meio visual para melhor incrementação das funcionalidades do projeto.</p>
<p>![gamesDB](https://github.com/user-attachments/assets/e99228b9-c01e-4d2e-a51a-cc8a06d5123f)</p>
