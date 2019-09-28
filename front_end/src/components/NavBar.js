import React from 'react';
import {Link} from "react-router-dom";

const NavBar = (props) => {

  return (
    <>
    <ul>
      <li>
          <Link to="/">Park Management</Link>
      </li>
      <li>
          <Link to="/dinos">Manage dinosaurs</Link>
      </li>
        
    </ul>
    </>
  );

  }

export default NavBar;
