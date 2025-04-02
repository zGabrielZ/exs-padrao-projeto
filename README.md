# Exs Design patterns

Neste repositório foi feito alguns exercícios utilizando design patterns e SOLID.

# Design patterns praticado
- Abstract Factory
- Adapter
- Builder
- Decorator
- Dependency injection
- Factory Method
- Observer
- Proxy
- Singleton
- Strategy
- Template Method
- Visitor

# SOLID

## Single responsibility principle
Toda a classe ou método deve ter responsabilidade em cada parte do programa, na qual deve ser encapsulado
cada classe, módulo ou função deve ser responsável por apenas um aspecto do sistema. 

Isso melhora a manutenção, reutilização e testabilidade do código.

## Open/Closed principle 

Mudar código existente deve ser minimizado, deve ser aberto para extensão mas fechado para modificação.

## Liskov Substitution principle

Classes derivadas (subclasses) devem ser compatíveis com a classe base (superclasse) em termos de comportamento e características.

A subclasse deve preservar o comportamento esperado, ou seja, deve seguir as regras e promessas estabelecidas pela classe base, não alterando seu contrato ou criando efeitos indesejados.

## Interface Segregation principle

Em vez de criar uma única interface com muitos métodos, deve-se dividir a interface em várias interfaces menores e mais específicas. 

Cada classe vai implementar apenas as interfaces que realmente necessita.

## Dependency inversion principle

O DIP sugere que tanto as classes de alto nível quanto as de baixo nível devem depender de abstrações (interfaces ou classes abstratas), 
e não de implementações concretas. 

Além disso, as abstrações não devem depender de detalhes, mas os detalhes (implementações) devem depender das abstrações.


