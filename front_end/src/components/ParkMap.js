import React from 'react';
import '../style/ParkMap.css';

const ParkMap = (props) => {

  return (
    <>
       <div className={"maparea "  + (props.lockdown ? "lockdown" : "maparea") }>

       <a href="/paddocks">
        <div className="paddock p1"> p1 <span className="tooltiptext">Paddock P1 Name</span> </div>
        </a>
        <a href="/paddocks">
        <div className="paddock p2"> p2 <span className="tooltiptext">Paddock P2 Name</span></div>
        </a>
        <a href="/paddocks">
        <div className="paddock p3"> p3 <span className="tooltiptext">Paddock P3 Name</span></div>
        </a>
        <a href="/paddocks">
        <div className="paddock p4"> p4 <span className="tooltiptext">Paddock P4 Name</span></div>
        </a>
        <a href="/paddocks">
        <div className="paddock p5"> p5 <span className="tooltiptext">Paddock P5 Name</span></div>
        </a>


        <img className="parkmap" src='./images/ParkBackground.png' alt="Park Landscape"></img>
       </div>
    </>
  );

  }

export default ParkMap;
