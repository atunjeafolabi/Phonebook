package com.mikro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate currentDate = LocalDate.now();

        PhoneBook phoneBook = new PhoneBook();

        Contact contact1 = new Contact("Segun Agunbiade", "segun@mail.com", "08077449032", dtf.format(currentDate));
        Contact contact2 = new Contact("Peace Agunbiade", "peace@mail.com", "07059449032", dtf.format(currentDate));
        Contact contact3 = new Contact("Joe Doe", "joe@mail.com", "07044993823", dtf.format(currentDate));
        Contact contact4 = new Contact("Ben Sam", "ben@mail.com", "08122739127", dtf.format(currentDate));
        Contact contact5 = new Contact("Ifeanyi Charles", "ifeanyi@mail.com", "08055332219", dtf.format(currentDate));

        phoneBook.addContact(contact1);
        phoneBook.addContact(contact2);
        phoneBook.addContact(contact3);
        phoneBook.addContact(contact4);
        phoneBook.addContact(contact5);

        // Search for one phone number e.g 07022889382
        phoneBook.searchPhoneNumber("08077449032");

        // Uncomment to display the list all phone numbers
//          phoneBook.showAllContacts();
    }
}

