# Steps to run the Application 

**1. Steps to run the Application**
* https://github.com/AbarnaU/daddy-s_coffee.git

**2. Import Cloned Project in Eclipse IDE (You can use your prefered IDE)**

**3. Create Mysql database.**
* Create database as 'daddy's coffee'
* Import the 'daddy_s_coffee.sql' file in the database

**4. Change mysql username and password as per your installation.**
* Open 'src/main/resources/application.properties'
* Change 'spring.datasource.username' and 'spring.datasource.password' as per your mysql installation

**5. Execute the project by running the 'Application.java' file.**
* The app will start running at 'http://localhost:8080'.

# Sample requests to test the API flow

METHOD        | PATH          | DESCRIPTION
------------- | ------------- |-------------
POST          | /Coffees      |To add a new product
GET           | /Coffees      |To view all the products details
GET           | /Coffees/{id} |To view a particular product details
POST          | /Orders       |To place a new order 
GET           | /Orders       |To view all the orders details
GET           | /Orders/{id}  |To view a particular order details

# Steps to test the Application

**1. Open 'Postman'**

**2. For adding a new product,**
* Select the POST method 
* Type the url as 'http://localhost:8080/Coffees' 
* Click 'body', select 'row' and select 'JSON'
* Type '{"name": "Americano","price": "650.00","description": "Double boiled milk"}'
* Click Send button.

**3. For viewing all products,**
* Select the GET method 
* Type the url as 'http://localhost:8080/Coffees' 
* Click Send button.

**4. For viewing a particular product with id=2,**
* Select the GET method 
* Type the url as 'http://localhost:8080/Coffees/2' 
* Click Send button.

**5. For place a new order,**
* Select the POST method 
* Type the url as 'http://localhost:8080/Orders' 
* Click 'body', select 'row' and select 'JSON'
* Type '{"c_id":1,"qty":3,"username":"Elsa","phone":"+94791232809","address":"Colombo"}'
* Click Send button.

**6. For viewing all orders,**
* Select the GET method 
* Type the url as 'http://localhost:8080/Orders' 
* Click Send button.

**7. For viewing a particular order with id=1,**
* Select the GET method 
* Type the url as 'http://localhost:8080/Orders/1' 
* Click Send button.
