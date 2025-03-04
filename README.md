# 🏰 Projeto - Padrões de Projeto em Java (Curso Cod3r)

## 📚 Descrição
Este repositório faz parte de um projeto de estudos, onde estou implementando diversos **Padrões de Projeto** utilizando **Java**, com base no curso **"Padrões de Projeto em Java"** da **Cod3r**.  
Diferente de apenas reproduzir o código apresentado, minha proposta é refatorar e implementar os padrões à minha própria maneira, consolidando o aprendizado e buscando soluções mais alinhadas com meu estilo e experiência.

---

## 🎯 Objetivos
- Praticar a aplicação de padrões de projeto no dia a dia de um desenvolvedor Java.
- Exercitar conceitos de **SOLID**, **Clean Code** e boas práticas.
- Criar um material de consulta pessoal para projetos futuros.
- Compreender os contextos e cenários ideais para aplicação de cada padrão.

---

## 📂 Padrões Implementados
| Categoria               | Padrões                                                         |
|------------------|------------------------------------------------------------------------|
| **Criacionais**         | Factory Method, Abstract Factory, Singleton, Builder, Prototype |
| **Estruturais**          | Adapter, Bridge, Composite, Decorator, Facade, Proxy            |
| **Comportamentais** | Observer, Strategy, Template Method, Command, State, Chain of Responsibility |

---

## ⚙️ Tecnologias e Ferramentas
- **Java 17+**
- **JUnit 5** para testes
- **Maven** para gerenciamento de dependências
- **IntelliJ IDEA** como IDE
- **Git & GitHub** para controle de versão

---

## 🗂 Estrutura do Projeto
```text
src
├── main
│   ├── java
│   │   ├── br.com.cod3r.padroes
│   │   │   ├── criacionais
│   │   │   ├── estruturais
│   │   │   └── comportamentais
│   └── resources
├── test
│   ├── java
│   │   └── br.com.cod3r.padroes
```

---

## ✅ Exemplo de Implementação (Factory Method)
```java
public enum TipoDb {
    ORACLE(OracleDB.class),
    POSTGRES(PostgresDB.class);

    private final Class<? extends Db> dbClass;

    TipoDb(Class<? extends Db> dbClass) {
        this.dbClass = dbClass;
    }

    public Db createDatabase() {
        try {
            return dbClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar instância do banco: " + dbClass.getSimpleName(), e);
        }
    }
}
```

---

## 🚀 Como Executar
Clone o repositório:
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

Execute os testes e/ou a aplicação:
```bash
mvn clean install
```

---

## 🏃‍♂️ Próximos Passos
- Criar cenários reais simulando sistemas completos usando padrões combinados.
- Escrever documentação com explicação de cada padrão.
- Incluir diagramas UML para cada padrão.

---

## 📅 Curso Base
Curso: [Padrões de Projeto em Java - Cod3r](https://www.cod3r.com.br/)  
---

