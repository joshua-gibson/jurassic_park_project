import React from 'react';
import '../style/LockdownButton.css'

const LockdownButton = () => {

  return (
    <div className="lbcontainer">
       <h1>Enter Lockdown: </h1>
        <label className="switch">
          <input type="checkbox"/>
          <span className="slider round"></span>
        </label>
    </div>
  );

  }

export default LockdownButton;
