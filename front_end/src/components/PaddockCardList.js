import React from 'react';
import Dennis from './Dennis.js';

const PaddockCardList = (props) => {

    const paddocks = props.paddocks.map((paddock, index) => {
        return <p key={index}>{paddock.name}</p>
    })


    return (
    <>
        <h3>Paddock List</h3>
        {paddocks}
        <Dennis/>
    </>
    );

}

export default PaddockCardList;
