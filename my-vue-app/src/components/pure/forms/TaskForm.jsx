import React from "react";

const TaskForm = () => {
  const TaskSchema = Yup.object().shape({
    name: Yup.string()
      .min(2, "Too Short!")
      .max(50, "Too Long!")
      .required("Required"),
    description: Yup.string()
      .min(2, "Too Short!")
      .max(100, "Too Long!")
      .required("Required"),
  });
  const tasks = useList([]);
  return <div></div>;
};

export default TaskForm;
