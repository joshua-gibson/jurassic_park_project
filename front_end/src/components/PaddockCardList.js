import React from 'react';
import Dennis from './Dennis.js';

const PaddockCardList = (props) => {

    const paddocks = props.paddocks.map((paddock, index) => {
        return <a href={`http://localhost:3000/paddocks/${paddock.id}`} key={index}>{paddock.name}</a>
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
