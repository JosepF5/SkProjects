import React from 'react'
import PropTypes from 'prop-types'
import { Contact } from '../../models/contact.class'

const ContactComponent = ({ contact, complete, remove  }) => {

  const contactCompleted = {
    color: 'green',
    fontWeight: 'bold',
    textDecoration: 'line-through'
  }

  const contactPending = {
    fontWeight: 'bold',
    color: 'red'
  }

  return (
    <tr className='fw-normal' style={contact.conectado ? contactCompleted : contactPending}>
    <th>
        <span className='ms-2'>{contact.nombre}</span>
    </th>
    <td className='align-middle'>
        <span>{contact.email}</span>
    </td>
    <td className='align-middle'>
        {/* Execution of function to return icon depending on completion */}
        <button className='bi-trash contact-action' style={{color: 'tomato'}} onClick={() => complete(contact)}>connect</button>
        <button className='bi-trash contact-action' style={{color: 'tomato'}} onClick={() => remove(contact)}>remove</button>
    </td>
    </tr>

  )
}

ContactComponent.propTypes = {
  contact: PropTypes.instanceOf(Contact),
  complete: PropTypes.func.isRequired,
  remove: PropTypes.func.isRequired

}

export default ContactComponent
