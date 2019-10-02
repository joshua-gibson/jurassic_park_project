import React from 'react';

const PaddockInfo = (props) => {

    // const dinoNode = props.paddocks._links.dinosaurs.map((dinosaur, index) =>{
    //     dinosaur.name
    // })

    if (!props.paddock) return null;
    return (
    <>
    <h3>Paddock Info</h3>
    <p>Paddock Name: {props.paddock.name}</p>
    <p>Visitor Capacity: {props.paddock.visitorCapacity}</p>
    <p>Dinosaur Capacity: {props.paddock.dinosaurCapacity}</p>

    <button> <a href="http://localhost:3000/dinos">Dinosaurs</a></button>

    </>
    );

}

export default PaddockInfo;
