import React from 'react';
import DinosaurCard from './DinosaurCard'
import '../style/card.css'


const DinoCardList = (props) => {

   const dinos = props.dinosaurs.map((dinosaur, index) => {
     return <DinosaurCard 
     key={index} 
     name={dinosaur.name} 
     avatar={dinosaur.species.dietType.charAt(0)} 
     subheader={dinosaur.species.dietType} 
     paddockName={dinosaur.paddock.name}
     gsp={props.gsp}
     gsd={props.gsd}
     image={dinosaur.species.url} 
     paddocks={props.paddocks}
     content={dinosaur.species.info}/>

     
    //  <p key={index}> {dinosaur.name}</p>
    
   })


  return (
    <div className="card">
       {dinos}
    </div>
  );

  }

export default DinoCardList;
