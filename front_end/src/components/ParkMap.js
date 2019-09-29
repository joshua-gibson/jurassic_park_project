import React from 'react';
import '../style/ParkMap.css';

const ParkMap = () => {

  return (
    <>
       <div className="maparea">

       <a href="/paddocks">
        <div className="paddock p1">p1 <span class="tooltiptext">Paddock Name</span> </div>
        </a>
        <a href="/paddocks">
        <div className="paddock p2"> p2 <span class="tooltiptext">Paddock Name</span></div>
        </a>
        <a href="/paddocks">
        <div className="paddock p3"> p3 <span class="tooltiptext">Paddock Name</span></div>
        </a>
        <a href="/paddocks">
        <div className="paddock p4"> p4 <span class="tooltiptext">Paddock Name</span></div>
        </a>


        <img className="parkmap" src='./images/ParkBackground.png' alt="Park Landscape"></img>
       </div>
    </>
  );

  }

export default ParkMap;
