# Assignment
For creating this project i have been taken spring initializer in that i configure the required dependencies.
After settiing up download the zip file and extract the files at the downloaded location.
Go to the IDE go to the path(file-> import-> existing maven project-> browse the downloaded location and add it.
After all the setup done create four packages with names entity,service,controller and repository with base package name itself.
In entity package create a class called "User" and define the variables "id","username" and "password".
For storing data in the table we need to annotate the "User" class as "@Entity" it indicates that this class will an entity.
And also annotated with "@Table" so it will be as a table.
generate getters and setters for the username and password.
After that create a controller class called "Usercontroller" from this class we can achieve all mappings and used to send response and receive request.
The "UserController" class should annotated with "@RestController" through this we achieve @ResponseBody and @Controller features.
From this class we will getting requests and responses through specific methods which are  annotated by specific mappning.
In Service package create a class called" UserService" in this class we have perform all the necessity operations like validation,filter.
UserService class has to be annotated with "@Service" annotation which specifies that this class as a service class.
After that create a Interface called "UserRepository" which extends "CrudRepository" which enable the interface to do operations and this interface with "@Repository".
After all doing this run main class Application with main method which anotated with "@SpringBootApplication.
copy the h2 database url from the console .
open Postman and send post request for signup with "/signUp" url.
After posting the request check h2 database from the chrome paste the database url which is copied (at line 17).
Check the table as "users" and then check the data is to be stored.
From the same the controller class we have login method run this method in postman with url "/login" send the "username" and "password" if the those values are present in the database it will get verified.
If we achieve all this perfectly the project is successful.
