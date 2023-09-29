
# Proyecto Semana 3

Este proyecto se basa en el desarrollo de un microservico con Sprinboot.
Con las dependencias de Spring Web, Spring Data Jpa, DevTools, MySql connector,

Incluye un CRUD basico, e incorpora una API Rest muy sencilla.

Esta aplicación se ha hecho con la intención de ser ampliada a lo largo de las siguientes semanas.


## Authors

- [Sergio](https://www.github.com/sreturns)


## Tech Stack

 Java, SpringBoot, Maven


## API Reference

#### Get all Books

```
  GET /book
```


#### Get Book

```
  GET /book/{isbn}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `isbn`      | `Book` | **Required**. Isbn of Book to fetch 

#### Add Book

```
  POST /book
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Book`      |  | **Required**. Type Book object 

#### Update Book

```
  PUT /book
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Book`      |  | **Required**. Type Book object 

#### Delete Book

```
  DELETE /book/{isbn}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `isbn`      |  | **Required**. Isbn of book to fetch  

