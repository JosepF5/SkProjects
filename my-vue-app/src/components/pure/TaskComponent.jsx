import React from 'react'
import PropTypes from 'prop-types'
import { Task } from '../../models/task.class'

function TaskComponent({task}) {
  return (
    <div>
      <h2>
        Nombre: {task.name}
      </h2>
      <h3>
        Descripción: {task.description}
      </h3>
      <h5>
        Estado: {task.completed ? 'Completada' : 'Pendiente'}
      </h5>
      <h3>
        Fecha de creación: {task.level}
      </h3>
    </div>
  )
}

TaskComponent.propTypes = {
    task: PropTypes.instanceOf(Task)
}

export default TaskComponent


