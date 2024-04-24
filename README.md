# DSCommerce
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Zelphh/listagem-pokemon/blob/main/LICENSE)

# Sobre o projeto

- Sistema utilizado em cursos da Devsuperior no processo de aprendizado dos alunos. A concepção do sistema partiu das seguintes premissas:
  - Um sistema que possua um modelo de domínio relativamente simples, porém abrangente, que explore vários tipos de relacionamentos entre as entidades de negócio (muitos-para-um, muitos-para-muitos, etc.).
    
  - Um sistema que possibilite a aplicação de vários conhecimentos importantes das disciplinas de fundamentos.
    
  - Sistema que contenha as principais funcionalidades que se espera de um profissional iniciante, tais como telas de cadastro e fluxos de caso de uso.


![image](https://github.com/Zelphh/dscommerce/assets/133059098/72ec31d9-3d89-4d4e-ade6-283ae408f710)

- Possui um CRUD para os produtos, categorias e pedidos
- Possui sistema de login, com username(email) e senha
- Possui um sitema de segurança com token JWT e Spring Security

# Ações

- Autenticação:
  - ![NPM](https://img.shields.io/badge/POST-F4CF67) **Fazer login**: Verifica as credencias e devolve um token de acesso para usar as funcionalidades do sistema, se as credenciais estiverem valdias (Publico, todos podem acessar acessar)


- Produtos:
  - ![NPM](https://img.shields.io/badge/GET-49FF49) **Produtos por ID**: Dado um ID, retorna os dados do respectivo produto (Publico, não precisa estar logado para acessar)
    
  - ![NPM](https://img.shields.io/badge/GET-49FF49) **Lista paginada de produtos**: Retorna uma lista de 20 produtos, podendo receber parametros na rota para modificar tamanho, ordenação e etc (Publico, não precisa estar logado para acessar)
    
  - ![NPM](https://img.shields.io/badge/GET-49FF49) **Produtos por parâmetros**: Dado um nome de um produto e/ou de uma caegoria, retorna uma lista paginada com os produtos respectivos (Publico, não precisa estar logado para acessar)
    
  - ![NPM](https://img.shields.io/badge/POST-F4CF67) **Cadastrar um novo produto**: Passando as informações do produto, o sistema verifica se todas são validas e salva o produto (Protegido, apenas um administrador logado pode realizar essa ação)
    
  - ![NPM](https://img.shields.io/badge/PUT-4169E1) **Alterar um produto**: Dado um ID e Passando as informações desejadas, o sistema verifica se todas são validas e altera o produto (Protegido, apenas um administrador logado pode realizar essa ação)
    
  - ![NPM](https://img.shields.io/badge/DEL-FF6961) **Deletar um produto**: Dado um ID, o sistema verifica se não havera falha na integridade caso o produto seja deletado, caso esteja tudo ok, a ação é executada (Protegido, apenas um administrador logado pode realizar essa ação)

  
- Usuário
  - ![NPM](https://img.shields.io/badge/GET-49FF49) **Informações do usuario**: O sistema automaticamente pega os dados do usuario logado (Livre, todos que estiverem logados podem realizar a ação)


- Categorias:
  - ![NPM](https://img.shields.io/badge/GET-49FF49) **Lista de todas as categorias**: Busca todas as categorias (Publico, não precisa estar logado para acessar)


# Informações completas do projeto:
Link para o PDF: https://drive.google.com/file/d/1dapYLnBYNqPt8DMgstzYtK6j_yL0XlfT/view?usp=drive_link


# Técnologias usadas:

![NPM](https://img.shields.io/badge/JAVA-FFA500) ![NPM](https://img.shields.io/badge/INTELIJ-D30069) ![NPM](https://img.shields.io/badge/SPRING_BOOT-49FF49) ![NPM](https://img.shields.io/badge/SPRING_SECURITY-7AFF7A) ![NPM](https://img.shields.io/badge/SPRING_DATA_JPA-7AFF7A) ![NPM](https://img.shields.io/badge/JWT-B100CD)  ![NPM](https://img.shields.io/badge/OAUTH2-333333) ![NPM](https://img.shields.io/badge/BCRYPT-7F89DF) 

# Autor

Matheus Melle Tártari

https://www.linkedin.com/in/matheusmellet%C3%A1rtari/
