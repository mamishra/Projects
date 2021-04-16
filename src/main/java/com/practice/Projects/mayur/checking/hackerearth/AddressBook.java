package com.practice.Projects.mayur.checking.hackerearth;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by MAYUR on 7/21/20.
 */
public class AddressBook {

  private Trie trie;

  public AddressBook() {
    //TODO
    trie = new Trie();
  }

  public void addContact(Contact contact) {
    //TODO
    trie.insert(contact.getName(),contact);
  }

  public void deleteContact(String name) {
    //TODO
    List<Contact> contacts = trie.search(name);
    Contact contact = contacts.get(0);
    trie.delete(name,contact);
  }

  public void updateContact(String name, Contact contact) {
    //TODO
    if(name!=null && contact != null) {
      List<Contact> contacts = trie.look(name);
      trie.delete(name,contacts.get(0));
      trie.insert(name,contact);
    }
  }

  public List<Contact> searchByName(String name) {
    //TODO
    return name!=null?trie.search(name):null;
  }

  public List<Contact> searchByOrganisation(String organisation) {
    //TODO
    List<Contact> contacts = null;
    if(organisation!= null){
      contacts = trie.look("");
    }
    List<Contact> orgContact = null;
    if(contacts!=null) {
      orgContact = contacts.stream().filter(contact -> contact.getOrganisation().equals(organisation)).collect(Collectors.toList());
    }

    return orgContact;
  }

}
