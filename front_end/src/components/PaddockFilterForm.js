import React from 'react';

const PaddockFilterForm = (props) => {

  const paddockoptions = props.paddocks.map((paddock, index) => {
    return <option key={paddock.id} value={paddock.id}>{paddock.name}</option>
  })

  function onSelect(event) {
    const selectedIndex = event.target.options.selectedIndex;
    const padVal = parseInt(event.target.options[selectedIndex].getAttribute('value'));
        console.log(padVal);
        props.filterByPaddock(padVal);
  }

  return (
    <>
       <h3>Filter By Paddock:</h3>
       <form>
          <select onChange={onSelect}>
            {paddockoptions}
          </select> 
        </form> 
    </>
  );

  }

export default PaddockFilterForm;
