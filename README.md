# DSList 📽️

<div align="center">
  <h3>Técnologias Utilizadas:</h3>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" height=30 weight=30/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/maven/maven-original.svg" height=30 weight=30/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original.svg" height=30 weight=30/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/docker/docker-original.svg" height=30 weight=30/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/hibernate/hibernate-original.svg" height=30 weight=30/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/azuresqldatabase/azuresqldatabase-original.svg" height=30 weight=30/>
</div>

## 💡Sobre 
Esse projeto foi contruido durante as aulas do evento "Intensivão Java Spring" do professor [Nélio Alves](https://www.linkedin.com/in/nelio-alves/) com o objetivo de melhorar minhas habilidades técnicas com as tecnologias <strong>Java, Spring, Maven e SQL</strong>.

<p>
  O DSList é uma aplicação desenvolvida em <strong>Java</strong> utilizando o ecossistema <strong>Spring</strong> e utilizando <strong>Maven</strong> para melhor gerenciamento das dependências do projeto. Foi utilizado uma arquitetura de camadas baseada em APIs RESTful, 
  permitindo a comunicação entre o backend e frontend/sistemas integrados. Toda a lógica de negócio e a integração com o banco de dados foram implementadas com o <strong>Spring Boot e Spring Data JPA</strong>, que com auxilio do <strong>Hibernate</strong>
  são responsáveis por toda a automatização do mapeamento de classes e objetos, simplificando operações CRUD.
</p>

<p>
  Para o armazenamento dos dados foi utilizado SQL com um banco integrado, o <strong>H2 DataBase</strong>, além disso o uso do <strong>Docker</strong> foi excencial para garantir que a aplicação possa ser executada em um ambiente padronizado e isolado.
</p>

<div align="center">
  <h3>Modelo de Domínio</h3>
  <img src="https://github.com/user-attachments/assets/8dccd13f-9a9c-4fcc-8342-896ed4312fdb">
</div>

<div align="center">
  <h3>Padrão de Camadas Utilizado</h3>
  <img src="https://github.com/user-attachments/assets/84510da8-88d6-48fc-9e44-23ebe8d1cb3e">
</div>

## 🧠Lógica 
<p>
  A ideia principal do projeto é uma aplicação que possa gerenciar listas de jogos (podendo ser transformada facilmente para qualquer nicho como filmes, receitas, séries, etc.) permitindo que os usuários organizem e visualizem seus jogos favoritos de forma personalizada.
  O projeto funciona como uma API RESTful que fornece endpoints para algumas operações como buscar jogos, organizá-los em listas onde podem ser ordenados conforme a preferência do usuário, visualizar resumos e detalhes mais específicos de cada jogo, etc.
</p>

<p>
  A lógica central do programa envolve o gerenciamento das entidades <strong>"Game" e "GameList"</strong> que representam respectivamente cada jogo e a lista de jogos, permitindo a associação entre ambos e a manipulação desses dados de forma rápida e eficaz.
</p>


