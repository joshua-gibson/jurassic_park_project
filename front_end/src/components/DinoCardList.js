import React from 'react';

const DinoCardList = (props) => {

   const dinos = props.dinosaurs.map((dinosaur, index) => {
     return <p key={index}> {dinosaur.name}</p>
   })


  return (
    <>
       <h3>Dinosaur List</h3>
       {dinos}


    </>
  );

  }

export default DinoCardList;
