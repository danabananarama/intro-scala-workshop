# intro-scala-workshop
Code and notes used for Scala workshop for interns.

(Thanks to Pei Shi for inspiring the structure with her awesometastic REST API workshop).

### Preparation

Most developers use some kind of IDE (Integrated Development Environment) when coding in Scala. The most common one in Zendesk is IntelliJ - you can download the free community edition [here](https://www.jetbrains.com/idea/download/#section=mac).

IDEs provide lots of features (e.g. type checking, jump to definition, refactoring) that allow developers to be more productive, particularly in a language that is statically typed like Scala. 

There is sometimes a downside in that IntelliJ can eat up your computer's resources (CPU/memory) and slow it down, and sometimes it can take time to set up your IDE (e.g. so that it understands your project dependencies, etc). But typically the boost in productivity, accuracy and general quality of life make an IDE well worth the trade-off.

For this workshop, you don't need to install the IDE, although you can if you like. We'll be using Worksheets to run our code, so you have options:
* You can copy and paste the code into an online worksheet like [Scastie](https://scastie.scala-lang.org/)
* You can install IntelliJ (recommended if you plan on doing More Scala Things!)

### Introduction

Scala (stands for **sca**lable **la**nguage) is a language which aims to provide a good static typing system and encourage the use of the functional programming paradigm.

This workshop aims to be a light introduction to the language. We'll talk about some of the thing

**Warm up: Exercise 1**

#### In Zendesk

Scala is one of the core Tech Menu-approved languages in Zendesk and is used widely across a number of teams and projects, including:

* Core services (e.g. account service, staff service)
* ML services and big data processing
* Event streaming

### Why use Scala?

Or, "what are some things that Dana likes about Scala?".

#### It's statically typed

i.e. types are inferred at compile time rather than run time **Exercise 3**.

#### It looks nice

Pattern matching is really pretty! **Exercise 6**

The language values readability (possibly too much so).

#### Facilitates a functional style of thinking/coding

Functional programming emphasises the use of immutability (i.e. side effect free code). You'll learn more about this in the FP workshop, but it's worth mentioning for now as it is a core design principle of the language.

It is useful for
* Programming concurrently (why?) **Exercise 7**
* Distributed data processing (e.g. Spark)

### Typical programming flow in Scala

* Compiling (typically to JVM byte code)
* Testing

### Further resources
* [Essential Scala](https://underscore.io/books/essential-scala/) is an approachable (and free! \o/) online book which aims to cover the basic features of Scala, and has some exercises to help you along.
* Functional Programming in Scala (aka "The Red Book") is a more advanced book which covers functional programming principles implemented in Scala. The first few chapters are an interesting exploration into some of the FP aspects of Scala, although many people find the latter half of the book to be too abstract/difficult to be useful.
* There is a Coursera course [Functional Programming Principles in Scala](https://www.coursera.org/learn/progfun1) by Martin Odersky (the creator of Scala) which is a challenging but still accessible introduction to functional programming in Scala.

In Zendesk:
* The slack channels #guild-scala and #guild-mel-scala are full of friendly folks who are happy to help with any questions you have.
* Sam and Luke were running sessions on the red book, check #mel-scala-redbook.
