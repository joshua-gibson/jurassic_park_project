import React from 'react';

const PaddockInfo = (props) => {


    if (!props.paddock) return null;
    return (
    <>
    <h3>Paddock Info</h3>
    <p>Paddock Name: {props.paddock.name}</p>
    <p>Visitor Capacity: {props.paddock.visitorCapacity}</p>
    <p>Dinosaur Capacity: {props.paddock.dinosaurCapacity}</p>
    <p>{props.paddock._links.dinosaurs}</p>
    </>
    );

}

export default PaddockInfo;
