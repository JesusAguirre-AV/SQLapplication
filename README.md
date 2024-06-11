##Project desciption
A simple menu driven program that offers options for adding, updating, or deleting a project as well as listing and selecting from existing options. These projects are simple sets of instructions, steps, time management, and other relevant details

##Technologies used
This is using a connection to connect to mySQL and access a database by using prepared statements and query excecutions to remotely run SQL statements

##Favorite features
The menu selections help make utility extreamly simple, infact it inspired similar menu styles for som personal projects

##Code snippet
try(Connection conn  = DbConnection.getConnection()){
			startTransaction(conn);
			try{
				Project project=null;
				
				try(PreparedStatement stmt = conn.prepareStatement(sql))
//this snippet is a set of try with parameter statements where sql is a string that contains the SQL statements to interact with the database

##Installation and usage
This code can be retrieved using git and does require the use of DBeaver to examine the result of the output, it can also be examined from the menu.

##Contribution section
//Here there can be requests as well as feedback and possible bug details

##Contact
thebroness619@gmail.com
