Employee Management System
This project is a simple Java console application designed to practice fundamental database management skills. Developed using Java, Maven, and PostgreSQL, this system performs basic CRUD (Create, Read, Update, Delete) operations on employee data.

Features
Database Integration: Seamlessly connects to a PostgreSQL database.

CRUD Operations: Performs the following actions on employee records:

Create: Adds new employees to the database.

Read: Displays a list of existing employees.

Update: Modifies an employee's information (e.g., updating their salary).

Delete: Permanently removes an employee from the database.

Dynamic Data Management: Resets the database table on each run to ensure a clean start and maintain data integrity.

Technologies Used
Java: The core programming language of the application.

Maven: A powerful tool used to manage project dependencies and the build lifecycle.

PostgreSQL: A reliable, open-source relational database used for data storage and querying.

Docker: Enables the PostgreSQL database to run easily in an isolated environment.

Setup and Running
Follow these steps to run the project on your local machine:

Start the PostgreSQL Database:

Ensure that Docker is installed.

Run the following command in your terminal to start the PostgreSQL container. This will launch the database server that your project will connect to.

Bash

docker run --name my-postgres -e POSTGRES_PASSWORD=---- -p ----:---- -d postgres
Compile and Run the Project:

Navigate to the main directory of the project.

Start the application by clicking the "Run" button in VS Code or by running the App.java file in the terminal.

The application will sequentially print all CRUD operations to the console.
