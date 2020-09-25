### Overview

This is a simple phonebook application that uses the `LinkedHashSet` 
data structure for storage. This particular data structure was selected 
because it stores unique records and doesn't allow duplicate. 
However, if the application requires a feature that allows searching with
suggestions, then a `Trie` data structure would have been a better choice
of storage because of its fast retrieval.

### Features

This Phone book application can:
 
- store unique phone numbers
- get unique phone details using the phone number
- retrieve the list of phone numbers

A contact  has the following information:
- Name 
- Email
- Phone number
- Date created 

###### NOTE:
This application is structured into two classes:
- PhoneBook.java
    - This contains the logic for adding a contact and searching for contacts.
- Contact.java
    - This is a POJO for a contact information
    
### Running
- A Main class is included for testing the application. It adds some sample
contacts for illustration.

- To print all contacts inserted, uncomment the line with 
`phoneBook.showAllContacts()`