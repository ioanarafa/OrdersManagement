• Use an object-oriented programming design, classes with maximum 300
lines, methods with maximum 30 lines, Java naming conventions.

• Use javadoc for documenting classes and generate the corresponding
JavaDoc files.

• Use relational databases for storing the data for the application, minimum
three tables: Client, Product and Order.

• Create a graphical user interface including:

    • A window for client operations: add new client, edit client, delete client,
    view all clients in a table (JTable)
    • A window for product operations: add new product, edit product, delete
    product, view all product in a table (JTable)
    • A window for creating product orders - the user will be able to select an
    existing product, select an existing client, and insert a desired quantity for
    the product to create a valid order. In case there are not enough products,
    an under-stock message will be displayed. After the order is finalized, the
    product stock is decremented.

• Use reflection techniques to create a method that receives a list of objects
and generates the header of the table by extracting through reflection the
object properties and then populates the table with the values of the
elements from the list.

• Good quality documentation covering the sections from the
documentation template.

• Layered Architecture (the application will contain at least four packages:
dataAccessLayer, businessLayer, model and presentation).
