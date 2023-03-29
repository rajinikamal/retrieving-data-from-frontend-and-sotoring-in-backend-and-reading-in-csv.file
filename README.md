# retrieving-data-from-frontend-and-sotoring-in-backend-and-reading-in-csv.file

In this code, I am using the jsoup jar file to read the product details on a web page and printing them in the console. 
I am also storing the values in a database using the jdbc tool and performing insert operations. 
To retrieve data from the database, I am using a select operation with a limit function
to retrieve the top 10 products in the database. I store this data in an ArrayList as an object.
Finally, I am using the FileWriter predefined class to download a CSV jar file, 
add it to the build path, and write the data to the CSV file.


"There is another way to retrieve a CSV file directly by using the 'SELECT * FROM csv LIMIT 10' query.
After getting the result from the workbench, you can import it into Excel and
save it as a CSV file to obtain the output of the top 10 products."

pdf of the code ---https://drive.google.com/file/d/1IStHdPijizhVtiZ4nTToBzHGjwKzCvEJ/view?usp=share_link
