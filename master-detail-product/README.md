# Master-Detail interface

Axon Ivy's Master-detail interface best-practice example is designed to accelerate process automation initiatives by demonstrating the flexible and powerful UI possibilities. This example showcases the following features:

* Three different approaches to implementing the Master-Detail Pattern are demonstrated based on the project's complexity. These approaches involve utilizing different process elements, UI views, and modal dialogs.
* Streamlining UI challenges for both professional developers and low coders, this example provides guidance on efficiently implementing the Master-Detail interface.
* This best-practice example is a valuable resource for resolving [Master-Detail interface](https://en.wikipedia.org/wiki/Master%E2%80%93detail_interface) requirements in any process automation project.

## Demo

In this demo, a lazy datatable is listing all the products available in the Ivy business repo.
There exist three scenarios:

1. User adds a new product (demonstrated by modal dialog opened in the same HTML dialog as the master).
2. User edits an existing product (demonstrated by process design: user is redirected to the stand-alone detail dialog and when finished with editing returns to the master dialog).
3. User edits an existing product (demonstrated by a detail view contained in the master dialog and navigating by primefaces).

## Setup

You only need to start the test process: `Create Test Data Repo`. This will create some products in the business repo in order that the products table is initialized with data.

