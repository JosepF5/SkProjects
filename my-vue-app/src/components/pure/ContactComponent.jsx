import React from 'react'
import PropTypes from 'prop-types'
import { Contact } from '../../models/contact.class'

const ContactComponent = ({contact}) => {
  return (
    <div>
      <h2>{contact.name}</h2>
      <h5>
        {contact.conectado ? 'Contacto En Línea' : 'Contacto No Disponible'}
      </h5>
    </div>
  )
}

ContactComponent.propTypes = {
    contact: PropTypes.instanceOf(Contact)
}

export default ContactComponent
