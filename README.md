# UD-DesignPatterns-Java

## Overview
This repository encompasses a comprehensive Java project demonstrating the implementation of various design patterns in a server-client architecture. The project is divided into different servers, each serving specific functionalities, and a client that interacts with these servers. It uses different patterns like DAO, singleton, factory or controller.

## Components

### Servers

#### 1. FACEBOOK_Server
- **Aim**: Mimics functionalities of Facebook, including user management and services.
- **Technologies**: Java, SQL, Apache Ant, libraries for database connectivity and logging.
- **Key Components**: UserDAO, DataAccessObjectBase, User domain object, FacebookService, create-facebook.sql (database script).

#### 2. GOOGLE_server
- **Aim**: Provides Google-related services.
- **Technologies**: Java, SQL, Apache Ant, libraries for database connectivity and logging.
- **Key Components**: UserDAO, DataAccessObjectBase, User domain object, GoogleService, create-google.sql (database script).

#### 3. STRAVA_server
- **Aim**: Provides Strava-related services and functionalities.
- **Technologies**: Java, SQL, Apache Ant, libraries for database connectivity, mailing, and logging.
- **Key Components**: ChallengeDAO, TrainingDAO, UserDAO, Challenge, Training, User domain objects, HomeAppService, LoginAppService, create-strava.sql (database script).

### Client

#### STRAVA_client
- **Aim**: Interacts with the servers, providing a graphical user interface for user interaction.
- **Technologies**: Java, Swing for GUI.
- **Key Components**: HomeController, LoginController, LoginW, HomeW, ServiceLocator.
