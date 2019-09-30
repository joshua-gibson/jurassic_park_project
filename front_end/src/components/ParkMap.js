import React from 'react';
import '../style/ParkMap.css';

const ParkMap = (props) => {

  const displayedPaddocks = props.paddocks.map((paddock, index) => {
    return  <a href="/paddocks" key={index}>
            <div className={`paddock p${index}`}> p{index} <span className="tooltiptext">{paddock.name}</span> </div>
            </a>
  })

  return (
    <>
       <div className={"maparea "  + (props.lockdown ? "lockdown" : "maparea") }>

          {displayedPaddocks}

        <img className="parkmap" src='./images/ParkBackground.png' alt="Park Landscape"></img>
       </div>
    </>
  );

  }

export default ParkMap;
