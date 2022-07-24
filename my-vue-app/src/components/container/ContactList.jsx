import React from "react";
import ContactComponent from '../pure/ContactComponent'
import { Contact } from '../../models/contact.class';
const ContactList = () => {
  const defaultContact = new Contact(
    "Josep",
    "Palomino",
    "jfpalomino.22@gmail.com",
    true
  );

  return <div>
    <ContactComponent contact={defaultContact}/>
  </div>;
};

export default ContactList;
