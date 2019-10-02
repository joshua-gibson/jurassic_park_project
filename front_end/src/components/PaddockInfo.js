import React from 'react';

const PaddockInfo = (props) => { 


    if (!props.paddock) return null;
    return (
    <>
    <h3>Paddock Info</h3>
    {props.paddock.name}
    </>
    );

}

export default PaddockInfo;
