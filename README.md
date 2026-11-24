# Bakery

A Java console application for managing bakery products and orders. This project was created in Year 2, Semester 1 as part of my Object-Oriented
Principles module.

## Features

- Add cakes, pastries, and breads with their details and prices.
- List the IDs of bakery items.
- Model bakery items, customers, and orders using separate classes.
- Define bakery operations through a `Bakery` interface.

## Requirements

- Java Development Kit (JDK)

## Run the application

From the project directory, compile the Java files:

```bash
javac *.java
```

Then start the console application:

```bash
java MyMain
```

The application asks for the maximum number of items per order, then displays a
menu for adding bakery items, viewing item IDs, creating an order, or exiting.

## Project structure

- `MyMain.java` — console menu and application entry point.
- `Bakery.java` — interface for bakery operations.
- `BakeryImp.java` — implementation of the bakery operations.
- `Item.java`, `Cake.java`, `Pastry.java`, `Bread.java` — bakery item model and
  item types.
- `Agent.java`, `Customer.java`, `Order.java` — customer and order models.
