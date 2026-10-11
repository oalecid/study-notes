# JDBC

Java Database Connectivity é uma API que permite que programas Java se conectem e interajam com bancos de dados.

## Como usar

1 - Carregar o Driver JDBC

```java
Class.forName("com.mysql.cj.jdbc.Driver");
```

2 - Estabelecer conexão

```java
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nomeDoBanco", "usuario", "senha");
```

3 - Criar um Statement

```java
Statement stmt = conn.createStatement();
```

4 - Execultar consulta

```java
ResultSet rs = stmt.executeQuery("SELECT * FROM nomeDaTabela");
```

5 - Processar os resultados

```java
while (rs.next()) {
  System.out.println(rs.getString("nomeDaColuna"));
}
```

6 - Fechar a conexão

```java
rs.close();
stmt.close();
conn.close();
```