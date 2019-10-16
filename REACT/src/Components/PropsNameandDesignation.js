import React, { Component } from 'react';

const Name = props =>{
    const {name,designation} = props
    return(
        <h2>My name is {name} and Job Role is {designation}</h2>
    )
}
export default Name


