import React, { useRef } from "react";
import PropTypes from "prop-types";
import { Contact } from "../../../models/contact.class";
const ContactForm = ({add, length}) => {

  const nombreRef = useRef("");
  const apellidoRef = useRef("");
  const gmailRef = useRef("");
  const conectadoRef = useRef(false);

  function addContact(e) {
    e.preventDefault();
    const newContact = new Contact(
      nombreRef.current.value,
      apellidoRef.current.value,
      gmailRef.current.value,
      conectadoRef.current.value,
    );
    add(newContact);
  }

  return (
    <form onSubmit={addContact} className='d-flex justify-content-center align-items-center mb-4'>
        <div className='form-outline flex-fill'>
            <input ref={nombreRef} id='inputName' type='text' className='form-control form-control-lg' required autoFocus placeholder='Contact Name'/>
            <input ref={apellidoRef} id='inputDescription' type='text' className='form-control form-control-lg' required placeholder='Contact description'/>
            <input ref={gmailRef} id='inputEmail' type='email' className='form-control form-control-lg' required placeholder='Contact email'/>
            <button type='submit' className='btn btn-success btn-lg ms-2'>
                {length > 0 ? 'Add New Contact' : 'Create your First Contact'}
            </button>
        </div>
    </form>
);

};

ContactForm.propTypes = {
    add: PropTypes.func.isRequired,
    length: PropTypes.number.isRequired
};

export default ContactForm;
