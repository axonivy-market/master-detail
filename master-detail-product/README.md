# Master-Detail interface

Axon Ivy's Master-detail interface best-practice example is designed to accelerate process automation initiatives by demonstrating the flexible and powerful UI possibilities. This example showcases the following features:

* Four different approaches to implementing the Master-Detail Pattern are demonstrated based on the project's complexity. These approaches involve utilizing different process elements, UI views, and modal dialogs.
* Streamlining UI challenges for both professional developers and low coders, this example provides guidance on efficiently implementing the Master-Detail interface.
* This best-practice example is a valuable resource for resolving [Master-Detail interface](https://en.wikipedia.org/wiki/Master%E2%80%93detail_interface) requirements in any process automation project.

## Demo

In this demo, a lazy datatable lists all products available in the Ivy business repo. There are four scenarios:

1. The user adds a new product (demonstrated by a modal dialog opened within the same HTML dialog as the master).
2. The user edits an existing product (demonstrated by a business process design: the process flow takes the user to a stand-alone detail dialog, and upon completion of editing, the user returns to the master dialog).
3. The user edits an existing product (demonstrated by initiating a process via a link: the user is redirected to a process start which opens a stand-alone detail dialog. Upon completion of editing, the user returns to the master dialog).
4. The user edits an existing product (demonstrated by a detail view contained within the master dialog and navigating using PrimeFaces).

![image](https://github.com/axonivy-market/master-detail/assets/129939502/44e36978-dd07-453f-857d-4db359318165)


## Setup

Simply initiate the test process named: `Create Test Data Repo`. This process will generate some products within the business repository to initialize the products table with data.

Then start the process `Show Product List`.

