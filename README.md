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

## 🖱️Como executar

  1. Clique no botão verde <img src="https://github.com/user-attachments/assets/2cc7d0ae-461e-43a1-b542-085ddddcc5bb" height=30> e copie a chave SSH do projeto <img src="https://github.com/user-attachments/assets/51191208-f7e6-49bc-b29b-7760b7d0814d" height=35>

  2. Abra seu terminal, dentro da pasta desejado e digite o seguinte comando:
  <code>git clone {chave_ssh}</code>

  3. Abra o projeto no seu editor de código de preferência e rode a classe <code>DSListApplication</code>

  4. Verifique em qual porta o Tomcat iniciou a aplicação <img src="https://github.com/user-attachments/assets/534003ff-5fdc-4646-a4d2-0be3e4ee53db">

  5. Utilize o
     [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/postman/postman-original.svg" height=20/> Postman](https://www.postman.com/downloads/) ou
     [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/swagger/swagger-original.svg" height=20/> Swagger](https://mvnrepository.com/artifact/io.swagger/swagger-annotations)
     para inicializar os endpoints presentes nas classes <strong>"GameController" e "GameListController"</strong> com seus respectivos mapeamentos, por exemplo:

<img src="https://github.com/user-attachments/assets/643c2248-9b9e-4527-89b8-e2a53af7fb38" width=400 align="center">
<img src="https://github.com/user-attachments/assets/ad8647f5-25b5-400b-8968-75e98b9b8cd2" width=600 align="center">


    

  





