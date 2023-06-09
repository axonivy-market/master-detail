# Master Detail 

A utility process with one master dialog(with detail view) and a stand-alone detail dialog to implement a master detail scenario with Ivy and Primefaces.

## Demo
![List of Products](master-detail-svgrepo-com.svg "List of Products")

In this demo, a lazy datatable is listing all the products available in the Ivy business repo.
There exist three scenarios:
1. User adds a new product (demonstrated by modal dialog opened in the same HTML dialog as the master).
2. User edits an existing product (demonstrated by process design: user is redirected to the stand-alone detail dialog and when finished with editing returns to the master dialog).
3. User edits an existing product (demonstrated by a detail view contained in the master dialog and navigating by primefaces).

## Setup

 - You only need to start the test process: `Create Test Data Repo`. This will create some products in the business repo in order that the products table is initialized with data.

