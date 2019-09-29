import React from 'react';
import {Link} from "react-router-dom";
import '../style/NavBar.css';

const NavBar = (props) => {

  return (
    <>
    <ul className="navbar">
      <li className="navbaritem">
          <Link to="/">Park Management</Link>
      </li>
      <li className="navbaritem">
          <Link to="/dinos">Manage Dinosaurs</Link>
      </li>
      <li className="navbaritem">
          <Link to="/paddocks">Manage Paddocks</Link>
      </li>
        
    </ul>
    </>
  );

  }

export default NavBar;
