import React from 'react';

const PaddockCardList = (props) => {

    const paddocks = props.paddocks.map((paddock, index) => {
        return <p key={index}>{paddock.name}</p>
    })


    return (
    <>
    <h3>Paddock List</h3>
    {paddocks}
    </>
    );

}

export default PaddockCardList;
