package com.mikro;

import java.util.LinkedHashSet;

public class PhoneBook
{
    LinkedHashSet<Contact> contacts;
    Contact existingContact;

    public PhoneBook()
    {
        contacts = new LinkedHashSet<>();
    }

    public void addContact(Contact contact)
    {
        contacts.add(contact);
    }

    public void searchPhoneNumber(String phoneNumber)
    {
        for (Contact contact: contacts) {
            if(contact.phoneNumber.equals(phoneNumber)){
                existingContact = contact;
            }
        }

        printContact(phoneNumber);
    }

    public void showAllContacts()
    {
        for (Contact contact: contacts) {
            printContact(contact);
        }
    }

    public void printContact(String phoneNumber)
    {

        if(existingContact != null){
            System.out.println(existingContact.name);
            System.out.println(existingContact.phoneNumber);
            System.out.println(existingContact.email);
            System.out.println(existingContact.createdAt);
        } else {
            System.out.println("Contact with phone number (" + phoneNumber +  ") does not exist");
        }
    }

    public void printContact(Contact contact)
    {
        System.out.println(contact.name);
        System.out.println(contact.phoneNumber);
        System.out.println(contact.email);
        System.out.println(contact.createdAt);
    }
}

