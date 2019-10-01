import React from 'react';
import LabCard from './LabCard'
import '../style/card.css'


const DinoCardList = (props) => {

    const dinos = props.dinosaurs.map((dinosaur, index) => {
        return <LabCard 
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