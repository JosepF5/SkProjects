import React, { useState,useEffect } from "react";
import ContactComponent from "../pure/ContactComponent";
import ContactForm from "../pure/forms/ContactForm";
import { Contact } from "../../models/contact.class";
const ContactList = () => {
  const defaultContact = new Contact(
    "Josep",
    "Palomino",
    "jfpalomino.22@gmail.com",
    true
  );

  const [contacts, setContacts] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    console.log("Contact State has been modified");
    setTimeout(() => {
      setLoading(false);
    }, 2000);
    return () => {
      console.log("ContactList component is going to unmount...");
    };
  }, [contacts]);

  function handleConnection(contact) {
    console.log("Connect this Contact:", contact);
    const index = contacts.indexOf(contact);
    const tempContacts = [...contacts];
    tempContacts[index].conectado = !tempContacts[index].conectado;
    setContacts(tempContacts);
  }

  function deleteContact(contact) {
    console.log("Detele this Contact:", contact);
    const index = contacts.indexOf(contact);
    const tempContacts = [...contacts];
    tempContacts.splice(index, 1);
    setContacts(tempContacts);
  }

  function addContact(contact) {
    console.log("Detele this Contact:", contact);
    const tempContacts = [...contacts];
    tempContacts.push(contact);
    setContacts(tempContacts);
  }

  const Table = () => {
    return (
      <table>
        <thead>
          <tr>
            <th scope="col">Nombre</th>
            <th scope="col">Email</th>
            <th scope="col">Actions</th>
          </tr>
        </thead>
        <tbody>
          {contacts.map((contact, index) => {
            return (
              <ContactComponent 
                key={index} 
                contact={contact} 
                complete={handleConnection} 
                remove={deleteContact}  
              />
            );
          })}
        </tbody>
      </table>
    );
  };

  let contactsTable;

  if (contacts.length > 0) {
    contactsTable = <Table></Table>;
  } else {
    contactsTable = (
      <div>
        <h3> There are no contacts to show</h3>
        <h4>Please, create one</h4>
      </div>
    );
  }

  const loadingStyle = {
    color: "grey",
    fontSize: "30px",
    fontWeight: "bold",
  };

  return (
    <div>
            <div className='col-12'>
                <div className='card'>
                    <div className='card-header p-3'>
                        <h5>
                            Your Contacts:
                        </h5>
                    </div>
                    <div className='card-body' data-mdb-perfect-scrollbar='true' style={ {position: 'relative', height: '400px'} }>
                        {loading ? (<p style={loadingStyle}>Loading contacts...</p>) : contactsTable}
                    </div>
                </div>
            </div>
            <ContactForm add={addContact} length={contacts.length}/>
        </div>

  );
};

export default ContactList;
