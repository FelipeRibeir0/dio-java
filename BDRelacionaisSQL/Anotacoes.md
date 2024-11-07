# Características principais de um Banco de Dados Relacional

1.  Relacionamento entre tabelas
2.  Linguagem de Consulta Estruturada (SQL)
3.  Integridade referencial
4.  Normalização de dados
5.  Segurança (Autorização)
6.  Flexibilidade e extensibilidade
7.  Suporte a transações ACID

### ACID:

Transações são conjuntos de propriedades de BD Relacionais que garante que as operações sejam feitas de forma segura e confiável.

**Atomicidade:** Terá sucesso em todas operações ou cancelará tudo caso 1 não der certo

**Consistência:** Atrelada a atomicidade, garantindo todas regras e restrições da tabela.

**Isolamento:** Cada transação é feita de forma isolada para evitar acessos não permitidos ou perca de informação

**Durabilidade:** Uma vez que a transação é confirmada, a alteração será permanente.

* * *

## Introdução a conceitos do SQL

#### Organização do SQL

**DQL** - Linaguagem de Consulta de Dados -- SELECT  
**DML** - Linguagem de Manipulação de Dados -- INSERT, UPDATE e DELETE  
**DDL** - Linguagem de Definição de Dados -- CREATE, ALTER e DROP  
**DCL** - Linguagem de Controle de Dados -- GRANT, REVOKE  
**DTL** - Linguagem de Transação de Dados -- BEGIN, COMMIT e ROLLBACK

**Sintaxe Básica: Nomenclatura**

Os nomes devem começar com uma letra ou com um caractere de sublinhado _

Os nomes podem conter letras, números e caracteres de sublinhado

Sensibilidade a maiúsculas e minúsculas

Referência: https://www.sqltutorial.org

* * *

## MER e DER: Modelagem de Banco de Dados

O Modelo Entidade-Relacionamento **(MER)** é representado através de diagramas chamados Diagramas Entidade-Relacionamento **(DER)  

## Entidades

As entidades são nomeadas com substantivos concretos ou abstratos que representem de forma clara sua função

![85ff0894ccf210dd8966897ff4c63cdf.png](../_resources/85ff0894ccf210dd8966897ff4c63cdf.png)

## Atributos 

Os atributos são as características ou proriedades das entidades. Eles descrevem informações específicas sobre uma entidade

![e268ee2603b8ea2ca5e9c4945cf70970.png](../_resources/e268ee2603b8ea2ca5e9c4945cf70970.png)

#### Sites para criar diagramas
https://app.creately.com
https://draw.io

Aplicativos
[Microsoft Visio](https://www.microsoft.com/pt-br/microsoft-365/visio/flowchart-software)

## Relacionamentos

Os relacionamentos representam as associações entre entidades com a imagem de um losângulo.

![4eb429cf48e7ebe931c9a17dcb018641.png](../_resources/4eb429cf48e7ebe931c9a17dcb018641.png)

## Cardinalidade

Se trata do modo que as entidades se relacionam.

- Relacionamento 1:1 (Um para um)
- Relacionamento 1:N ou 1:* (Um para muitos)
- Relacionamento N:N ou *..\* (muitos para muitos)

![4746e6ecc5de949f66d52cba946d5a47.png](../_resources/4746e6ecc5de949f66d52cba946d5a47.png)

### Cardinalidade opcional

Se trata das cardinalidade máximas e mínimas

![19b647922bf8940f7fea8e3b6408c7be.png](../_resources/19b647922bf8940f7fea8e3b6408c7be.png)

### Citação especial:
**Criando um DER com IA**

https://app.quickdatabasediagrams.com/#/