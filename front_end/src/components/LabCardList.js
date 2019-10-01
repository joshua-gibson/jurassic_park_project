import React from 'react';
import DinosaurCard from './DinosaurCard'
import '../style/card.css'


const DinoCardList = (props) => {

    const dinos = props.dinosaurs.map((dinosaur, index) => {
        return <DinosaurCard 
        key = {index}
        name={dinosaur.type} 
        avatar={dinosaur.dietType.charAt(0)} 
        image={dinosaur.url} 
        content={dinosaur.info}
        />

    })


    return ( 
    <div className="card">
    {dinos}
    </div>
    );

}

export default DinoCardList;