import React from 'react';

const PaddockFilterForm = (props) => {

  const paddockoptions = props.paddocks.map((paddock, index) => {
    return <option value="{paddock.name}">{paddock.name}</option>
  })

  return (
    <>
       <h3>Filter By Paddock:</h3>
       <form>
            <select>
                {paddockoptions}
            </select> 
            </form> 
    </>
  );

  }

export default PaddockFilterForm;
