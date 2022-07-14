import React from 'react'
import { createSlice, PayloadAction } from "@reduxjs/toolkit";

type dataType = {
    id?: string;
    name?: string;
    url?: string;
}
  
const initialState: any = []

const dataSlice = createSlice({
    name: "data",
    initialState,
    reducers: {
      getData: (state, action) => {
        return action.payload;
      },
    },
})
export default dataSlice.reducer;
export const {getData} = dataSlice.actions;
export type {dataType}
