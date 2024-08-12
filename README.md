# Game-Application-using-Spring
# Multi-Game Application

## Introduction
Welcome to the **Multi-Game Application**! This project includes three classic games—Super Mario, Tic-Tac-Toe, and Pac-Man—as well as a final game component developed using Spring and Java Beans. This application showcases a blend of game development with a focus on both graphical and server-side programming.

## Features
- **Super Mario**
  - A 2D platformer game inspired by the Super Mario series.
  - Features classic gameplay elements: jumping, running, and obstacle avoidance.

- **Tic-Tac-Toe**
  - A simple, interactive 3x3 grid game.
  - Playable against a basic AI or another player.

- **Pac-Man**
  - A simplified version of the Pac-Man maze game.
  - Navigate Pac-Man through a maze, collecting dots while avoiding ghosts.

- **Final Game (Spring and Java Beans)**
  - A full-fledged game utilizing Spring Framework and Java Beans.
  - Includes backend management, game state handling, and user interactions.

## Project Layout
```bash
src
├── main
│   ├── java
│   │   ├── com.example.multigame
│   │   │   ├── controller
│   │   │   │   └── GameController.java
│   │   │   ├── service
│   │   │   │   └── GameService.java
│   │   │   ├── repository
│   │   │   │   └── GameRepository.java
│   │   │   └── model
│   │   │       └── Game.java
│   ├── resources
│   │   └── application.properties
│   └── webapp
│       └── WEB-INF
│           └── web.xml
├── supermario
│   └── SuperMario.java
├── tictactoe
│   └── TicTacToe.java
└── pacman
    └── PacMan.java
