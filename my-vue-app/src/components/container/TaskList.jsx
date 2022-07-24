import React from 'react'
import { LEVELS } from '../../models/levels.enum';
import { Task } from '../../models/task.class';
import TaskComponent from '../pure/TaskComponent'
const TaskList = () => {

    const default_task = new Task('Tarea 1', 'Descripción de la tarea 1', false, LEVELS.NORMAL);

    return (
        <div>
            <div>
                Your tasks:
            </div>
            <TaskComponent task={default_task}/>
        </div>
    )
}
export default TaskList
